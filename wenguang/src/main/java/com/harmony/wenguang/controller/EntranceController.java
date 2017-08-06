package com.harmony.wenguang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;








import org.apache.commons.lang3.StringUtils;
import org.codehaus.jettison.json.JSONException;
//import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;








import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain39DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.harmony.wenguang.dao.dataobject.WgDisclosureInfoDO;
import com.harmony.wenguang.dao.impl.WgDisclosureInfoDaoImpl;
import com.harmony.wenguang.support.CommonUtils;

@Controller
@RequestMapping("/entrance/")
public class EntranceController {
	@Resource
    protected HttpServletRequest request;
	@Resource
	protected WgDisclosureInfoDaoImpl wgDisclosureInfoDao;
	@Resource
	FormtableMainDao formtableMainDao;
	
	@RequestMapping("/main.do")
	public ModelAndView addMainAplly(){
		
		ModelAndView mv = new ModelAndView("main");
		FormtableMain2DO example = new FormtableMain2DO();
        List<FormtableMain2DO> dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList", dataList);
        
        dataList=null;
        example.setXxgkyjml("2");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList2", dataList);
        
        dataList=null;
        example.setXxgkyjml("17");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList3", dataList);
        
        dataList=null;
        example.setXxgkyjml("4");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList4", dataList);
        
        dataList=null;
        example.setXxgkyjml("5");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList5", dataList);
        
        dataList=null;
        example.setXxgkyjml("15");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList6", dataList);
        
        dataList=null;
        example.setXxgkyjml("16");
        dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList7", dataList);
        
        
		return mv;
	}
	
	@RequestMapping("/index2.do")//显示main.JSP的右侧导航栏
	public ModelAndView addIndex2Aplly(ModelAndView mv){
		mv.setViewName("index2"); 
		return mv;
	}
	@RequestMapping("/index3.do")//显示main.JSP的右侧搜索栏
	public ModelAndView addIndex3Aplly(ModelAndView mv){
		mv.setViewName("index3"); 
		return mv;
	}
	
	@RequestMapping("/index4.do")//显示查询结果页面
	public ModelAndView addIndex4Aplly(){
		//此处通过name传递值
        String startTime = request.getParameter("st");
        String endTime = request.getParameter("et");
        String callNumber = request.getParameter("call_Number");
        String publishOrganization = request.getParameter("publish_Organization"); 
        String infoName = request.getParameter("infoName");
        String indexOfFile = request.getParameter("indexOf_File");
        String openCategories = request.getParameter("select1");
        String keyWord = request.getParameter("keyword");
        
        FormtableMain2DO example = new FormtableMain2DO();
        example.setYfrq(startTime);
        example.setFwh(endTime);
        example.setCallNumber(callNumber);
        //TODO 此处发文机构与公开类别(一级目录)都是Integer变量，需要映射
    //    example.setFwdw(publishOrganization);
        example.setZwbt(infoName);
        example.setFileNumber(indexOfFile);
    //    example.setYjml(openCategories);
        example.setKeyWord(keyWord);
        
        List<FormtableMain2DO> dataList = formtableMainDao.selectByParaOrderedByTime(example);
        
        ModelAndView mv = new ModelAndView("index4");
        mv.addObject("docList", dataList);
		
        return mv;
	}
	/*
	@RequestMapping("/index5.do")
	public ModelAndView addIndex5Aplly(ModelAndView mv){
		mv.setViewName("index5"); 
		return mv;
	}
	*/
}
