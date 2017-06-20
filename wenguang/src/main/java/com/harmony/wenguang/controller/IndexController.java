package com.harmony.wenguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String index(){
		ModelAndView mv = new ModelAndView("hello");
		System.out.println(">>>>>>>ssss>>>>>>");
		return "hello world";
	}
}
