package com.harmony.wenguang.support;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Jsoup;

import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.service.FileDocument;


public class FileTransformUtils {
	public static boolean transform(Long docid,Integer requestId) throws Exception{
	    if((requestId == null || requestId <= 0)
	    && (docid == null || docid <= 0)){
	        return false;
	    }
	    FormtableMain2DO example = new FormtableMain2DO();
	    example.setRequestId(requestId);
	    example.setId(docid);
	    List<FormtableMain2DO> list = Dao.inst().getFormtableMainDao().selectByExample(example);
	    if(list == null || list.size()==0 ){
	        return false;
	    }
	    for(FormtableMain2DO dd : list){
	        FormtableMain2DO detailExample = new FormtableMain2DO();
	        detailExample.setId(dd.getId());
	        FormtableMain2DO detail = Dao.inst().getFormtableMainDao().selectSimpleByExample(detailExample).get(0);
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
	        if(html == null ){
	            return false;
	        }

	        org.jsoup.nodes.Document htmlDocument = Jsoup.parse(html);
	        
	        String fjName = CommonUtils.blank(detail.getFjbt())?("附件"+docid):detail.getFjbt();
	        if(dd.getFjInputStream()!=null || dd.getFjInputStream().trim().length()>0){
	            String fjhtml = String.format(
	                    "<p style=''>"
	                    +"<span>下载附件</span></br>"
	                    + "附件1: <a href='%s'>%s</a><p>", 
	                    "/documents/fujian.do?docid="+docid,fjName
	                    );
	            htmlDocument.select("body").append(fjhtml);
	        }
	        htmlDocument.select("head").append("<title>上海文化广播影视管理局</title>");
	        htmlDocument.select("head").append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
	        htmlDocument.select("body").prepend(String.format(
	                "<div style='margin-bottom:2em'>"
	                + "<h3 style='text-align:center'>%s</h3>"
	                +"<p style='text-align:center;color:#CECECE;size:20px'>%s</p>"
	                + "</div>",
	                detail.getZwbt(),detail.getZs()));
//	        System.out.println(htmlDocument.html());
	        WgDocumentsDO wgDocumentsDO = new WgDocumentsDO();
	        wgDocumentsDO.setDocName((requestId!=null?requestId:docid)+"");
	        wgDocumentsDO.setDocContent(htmlDocument.html());
	        wgDocumentsDO.setDocType("html");
	        wgDocumentsDO.setRecordType("text");
	        wgDocumentsDO.setStatus("1");
	        Dao.inst().getWgDocumentsDao().insert(wgDocumentsDO);
	        
	    }
	    return true;
	}
}
