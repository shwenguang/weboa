package com.harmony.wenguang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.dataobject.WgDisclosureInfoDO;
import com.harmony.wenguang.dao.impl.WgDisclosureInfoDaoImpl;

@Controller
@RequestMapping("/entrance/")
public class EntranceController {
	@Resource
    protected HttpServletRequest request;
	@Resource
	protected WgDisclosureInfoDaoImpl wgDisclosureInfoDao;
	@RequestMapping("/main.do")
	public ModelAndView addMainAplly(ModelAndView mv){
		mv.setViewName("main"); 
		return mv;
	}
	
	@RequestMapping("/index2.do")
	public ModelAndView addIndex2Aplly(ModelAndView mv){
		mv.setViewName("index2"); 
		return mv;
	}
	@RequestMapping("/index3.do")
	public ModelAndView addIndex3Aplly(ModelAndView mv){
		mv.setViewName("index3"); 
		return mv;
	}
	@RequestMapping("/index4.do")
	public ModelAndView addIndex4Aplly(ModelAndView mv){
		mv.setViewName("index4"); 
		return mv;
	}
	@RequestMapping("/index5.do")
	public ModelAndView addIndex5Aplly(ModelAndView mv){
		mv.setViewName("index5"); 
		return mv;
	}
}
