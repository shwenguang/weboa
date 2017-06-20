package com.harmony.wenguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/index")
public class IndexController {
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
}
