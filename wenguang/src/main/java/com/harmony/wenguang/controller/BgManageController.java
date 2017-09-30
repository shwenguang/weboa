package com.harmony.wenguang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bg")
public class BgManageController {
	@Resource
    HttpServletRequest request;
	
	@RequestMapping("/index.do")
    public ModelAndView index(){
		ModelAndView mv = new ModelAndView("bgindex");
		return mv;
	}
}
