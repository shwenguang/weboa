package com.harmony.wenguang.controller;

import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harmony.wenguang.dao.WgDocumentsDao;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;

@Controller
@RequestMapping("/documents/")
public class DocumentsController {
	@Resource
	HttpServletRequest request;
	@Resource
	WgDocumentsDao wgDocumentsDao;

	@RequestMapping("/get.do")
	public String doc(HttpServletResponse response) {
		OutputStream os = null;
		try {
			String docName = request.getParameter("docName");
//			String reqType = request.getParameter("reqType");
			WgDocumentsDO example = new WgDocumentsDO();
			example.setDocName(docName);
			List<WgDocumentsDO> list = wgDocumentsDao.selectByExample(example);
			if (list == null || list.size() == 0) {
				return "404";
			}
			WgDocumentsDO dd = list.get(0);
			if(dd.getDocContent()==null || dd.getDocContent().length()==0){
				return "404";
			}
			os = response.getOutputStream();
			if ("html".equals(dd.getDocType())) {
				response.setContentType("text/html");
				response.setCharacterEncoding("utf-8");
				os.write(dd.getDocContent().getBytes());
			} else if ("pic".equals(dd.getDocType())) {
				response.setContentType("image/pjpeg");
				os.write(Base64.decodeBase64(dd.getDocContent()));
			} else if("txt".equals(dd.getDocType())){
				response.setContentType("text/plain");
				response.setCharacterEncoding("utf-8");
				os.write(Base64.decodeBase64(dd.getDocContent()));
			}else {
				response.setContentType("application/octet-stream");
				response.addHeader("Content-Disposition","attachment;fileName=" + dd.getDocName() + "." + dd.getDocType());
				os.write(Base64.decodeBase64(dd.getDocContent()));
			}
			return null;
		} catch (Exception ex) {
			ex.printStackTrace();
			return "something err";
		}finally{
			IOUtils.closeQuietly(os);
		}
	}
}
