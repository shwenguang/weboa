package com.harmony.wenguang.support;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.PicturesManager;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.hwpf.usermodel.PictureType;
import org.apache.poi.xwpf.converter.core.FileImageExtractor;
import org.apache.poi.xwpf.converter.core.FileURIResolver;
import org.apache.poi.xwpf.converter.xhtml.XHTMLConverter;
import org.apache.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.w3c.dom.Document;

import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.service.FileDocument;

public class Word2Html {
	private static String picPath = "D:/alidata1/pics/";
//    public static void main(String args[]) throws Exception{
//        convertToHtml("D:/alidata1/origindoc.doc","D:/alidata1/origindoc.html");
//        convertToHtml("D:/alidata1/origindoc.docx","D:/alidata1/origindocx.html");
//    }
    
    public static String convertToHtml(final String docFile) throws Exception{
    	FileDocument fd = new FileDocument(){
			@Override
			public FileType getSuffix() {
				return FileType.docx;
			}
			@Override
			public InputStream getInputStream() {
				try {
					return new FileInputStream(docFile);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				return null;
			}
			@Override
			public File getFile() {
				return new File(docFile);
			}
			@Override
			public String getName() {
				return docFile;
			}
        };
        if(docFile.endsWith("docx")){
            return docx2Html(fd);
        }else{
            return doc2html(fd);
        }
    }
    
    public static String doc2html(FileDocument docFile) throws Exception{
    	System.out.println("doc2html");
        HWPFDocument doc = new HWPFDocument(docFile.getInputStream());
        WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument());
        wordToHtmlConverter.setPicturesManager(new PicturesManager(){
            public String savePicture(byte[] content, 
                                      PictureType pictureType, 
                                      String suggestedName, 
                                      float widthInches,
                                      float heightInches) {
            	String docName = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase()+".jpg";
            	WgDocumentsDO wgDocumentsDO = new WgDocumentsDO();
            	wgDocumentsDO.setDocContent(content);
            	wgDocumentsDO.setDocName(docName);
            	wgDocumentsDO.setDocType("pic");
            	Dao.inst().getWgDocumentsDao().insert(wgDocumentsDO);
                return "/wg/documents/"+docName;
            }});
        
        wordToHtmlConverter.processDocument(doc);
        
//        List<Picture> pics = doc.getPicturesTable().getAllPictures();
//        if(pics!=null){
//            for(Picture pic : pics){
//                System.out.println(pic.suggestFullFileName());
//            }
//        }
        
        Document htmlDoc = wordToHtmlConverter.getDocument();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DOMSource domSource = new DOMSource(htmlDoc);
        StreamResult streamResult = new StreamResult(out);
        
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans = tf.newTransformer();
        
        trans.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        trans.setOutputProperty(OutputKeys.INDENT, "yes");
        trans.setOutputProperty(OutputKeys.METHOD, "html");
        trans.transform(domSource, streamResult);
        out.close();
//        Files.write(out.toByteArray(), new File(htmlFile));
        return new String(out.toByteArray());
    }
    
    public static String docx2Html(FileDocument docFile) throws Exception{
        XWPFDocument doc = new XWPFDocument(docFile.getInputStream());
        XHTMLOptions options = XHTMLOptions.create().indent(4);
        File imgFolder = new File(picPath);
        options.setExtractor(new FileImageExtractor(imgFolder));
        options.URIResolver(new FileURIResolver(imgFolder));
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XHTMLConverter.getInstance().convert(doc, out, options);
//        System.out.println("docx to html done");
        return new String(out.toByteArray());
    }
}
