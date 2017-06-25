package com.harmony.wenguang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harmony.wenguang.service.HtmlService;

@Controller
@RequestMapping("/html/")
public class HtmlController {
	@Resource
	HtmlService htmlService;
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("/doc.do")
	@ResponseBody
	public String html(){
		String path1 = request.getParameter("path1");
		String path2 = request.getParameter("path2");
		String path3 = request.getParameter("path3");
		
		System.out.println("htmlService=="+htmlService);
		return htmlService.getHtml(null) + ",path1="+path1+",path2 = "+ path2 + ", path3 = "+path3;
	}
}
