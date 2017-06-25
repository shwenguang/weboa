package com.harmony.wenguang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harmony.wenguang.service.HtmlService;

@Controller
@RequestMapping("/html/")
public class HtmlController {
	@Resource
	HtmlService htmlService;
	
	@RequestMapping("/doc.do")
	@ResponseBody
	public String html(){
//		System.out.println("htmlService=="+htmlService);
		return htmlService.getHtml(null);
	}
}
