package com.harmony.wenguang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.support.CommonUtils;

@Controller
@RequestMapping("/bg")
public class BgManageController {
	@Resource
    HttpServletRequest request;
	@Resource
    FormtableMainDao formtableMainDao;
	
	@RequestMapping("/index.do")
    public ModelAndView index(){
		ModelAndView mv = new ModelAndView("bgindex");
		return mv;
	}
	
	@RequestMapping("/queryList.do")
	@ResponseBody
    public Object queryList(){
		JSONObject json = new JSONObject();
		Integer ejml = CommonUtils.parseInt(request.getParameter("ejml"), null);
		Integer yjml = CommonUtils.parseInt(request.getParameter("yjml"), null);
		int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
		int pageSize = CommonUtils.parseInt(request.getParameter("pageSize"), 20);
		FormtableMain2DO example = new FormtableMain2DO();
		example.setPageNo(pageNo);
		example.setPageRows(pageSize);
		example.setEjml(ejml);
		example.setYjml(yjml);
		int total = formtableMainDao.countByExample(example);
		List<FormtableMain2DO> list = formtableMainDao.selectByExample(example);
		json.put("total", total);
		json.put("list", list);
		return json;
	}
}
