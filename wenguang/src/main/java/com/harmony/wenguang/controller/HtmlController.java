package com.harmony.wenguang.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;
import com.harmony.wenguang.service.FileDocument;
import com.harmony.wenguang.service.HtmlService;
import com.harmony.wenguang.support.Word2Html;

@Controller
@RequestMapping("/html/")
public class HtmlController {
	@Resource
	HtmlService htmlService;
	@Resource
	HttpServletRequest request;
	@Resource
	FormtableMainDao formtableMainDao;
	
	@RequestMapping("/doc.do")
	@ResponseBody
	public String html(){
		String path1 = request.getParameter("path1");
		String path2 = request.getParameter("path2");
		String path3 = request.getParameter("path3");
		
		System.out.println("htmlService=="+htmlService);
		return htmlService.getHtml(null) + ",path1="+path1+",path2 = "+ path2 + ", path3 = "+path3;
	}
	
	@RequestMapping("/show.do")
	@ResponseBody
	public String show() throws Exception{
		Long id = Long.parseLong(request.getParameter("id"));
		FormtableMainDO maindo = formtableMainDao.getById(id);
		if(maindo==null){
			return "<html><body>not found page</body></html>";
		}
		Base64 base64 = new Base64();
		final InputStream is = new FileInputStream(new File("/Users/yinguoliang/Downloads/正则表达式.doc"));//new ByteArrayInputStream(base64.decode(maindo.getZwInputStream()));
		FileDocument file = new FileDocument(){

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
		try {
			return Word2Html.doc2html(file);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				return Word2Html.docx2Html(file);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return "<p> something error</p>";
	}
}
