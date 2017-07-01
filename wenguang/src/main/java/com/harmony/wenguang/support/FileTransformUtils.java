package com.harmony.wenguang.support;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.service.FileDocument;


public class FileTransformUtils {
	public static boolean transform(Integer requestId) throws Exception{
	    if(requestId == null || requestId <= 0){
	        return false;
	    }
	    FormtableMainDO example = new FormtableMainDO();
	    example.setRequestId(requestId);
	    List<FormtableMainDO> list = Dao.inst().getFormtableMainDao().selectByExample(example);
	    if(list == null || list.size()==0 ){
	        return false;
	    }
	    for(FormtableMainDO dd : list){
	        String zw = dd.getZwInputStream();
	        if(zw == null){
	            continue;
	        }
	        final byte[] bs = new Base64().decode(zw);
	        FileDocument doc = new FileDocument() {
                @Override
                public FileType getSuffix() {
                    return null;
                }
                @Override
                public String getName() {
                    return null;
                }
                @Override
                public InputStream getInputStream() {
                    return new ByteArrayInputStream(bs);
                }
                @Override
                public File getFile() {
                    return null;
                }
            };
            String html = null;
	        try{
	            html = Word2Html.doc2html(doc);
	        }catch(Exception ex){
	            html = Word2Html.docx2Html(doc);
	        }
	        WgDocumentsDO wgDocumentsDO = new WgDocumentsDO();
	        wgDocumentsDO.setDocName(requestId+"");
	        wgDocumentsDO.setDocContent(html);
	        wgDocumentsDO.setDocType("html");
	        wgDocumentsDO.setRecordType("text");
	        wgDocumentsDO.setStatus("1");
	        Dao.inst().getWgDocumentsDao().insert(wgDocumentsDO);
	        if(dd.getFjInputStream()!=null){
	            wgDocumentsDO = new WgDocumentsDO();
	            wgDocumentsDO.setDocName(requestId+"fj");
	            wgDocumentsDO.setDocContent(dd.getFjInputStream());
	            wgDocumentsDO.setDocType("doc");
	            wgDocumentsDO.setRecordType("base64");
	            wgDocumentsDO.setStatus("1");
	            Dao.inst().getWgDocumentsDao().insert(wgDocumentsDO);
	        }
	    }
	    return true;
	}
}
