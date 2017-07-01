package com.harmony.wenguang.support;

import java.io.File;
import java.io.InputStream;

import org.apache.poi.util.IOUtils;

import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.service.FileDocument;

public class FileTransformUtils {
	public static void transform(String fileName,String fileType,final InputStream is) throws Exception{
		FileDocument fd = new FileDocument(){
			@Override
			public FileType getSuffix() {
				return null;
			}

			@Override
			public InputStream getInputStream() {
				return is;
			}

			@Override
			public File getFile() {
				return null;
			}

			@Override
			public String getName() {
				return null;
			}
		};
		String html = null;
		if("doc".equals(fileType)){
			html = Word2Html.doc2html(fd);
		}else if("docx".equals(fileType)){
			html = Word2Html.docx2Html(fd);
		}
		IOUtils.closeQuietly(is);
		WgDocumentsDO wgDocumentsDO = new WgDocumentsDO();
    	wgDocumentsDO.setDocContent(html);
    	wgDocumentsDO.setDocName(fileName);
    	wgDocumentsDO.setDocType("html");
    	Dao.inst().getWgDocumentsDao().insert(wgDocumentsDO);
	}
}
