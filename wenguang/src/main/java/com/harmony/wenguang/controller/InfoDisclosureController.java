package com.harmony.wenguang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/info/disclosure")
public class InfoDisclosureController {
	@Resource
    protected HttpServletRequest request;
	@RequestMapping("/addNewApply.do")
	public ModelAndView addNewAplly(ModelAndView mv){
		mv.setViewName("addNewApply");
		mv.addObject("aaa", "hello mode");
		return mv;
	}
	//TODO 添加输入数据的处理逻辑
}
