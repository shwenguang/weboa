package com.harmony.wenguang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

//import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
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
	
	@RequestMapping("/head_info_disclosure.do")
	public ModelAndView addhead_info_disclosureAplly(){
		
		ModelAndView mv = new ModelAndView("head_info_disclosure");
		FormtableMain2DO example = new FormtableMain2DO();
        List<FormtableMain2DO> dataList = formtableMainDao.selectByExampleOrderedByTime(example);
        mv.addObject("docList", dataList);
		return mv;
	}
	
	@RequestMapping("/info_disclosure.do")
	public ModelAndView addinfo_disclosureAplly(){
		int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"),1);
		int pageRows = 5;
//		StringBuilder query = new StringBuilder();
		FormtableMain2DO example = new FormtableMain2DO();
		example.setPageNo(pageNo);
		example.setPageRows(pageRows);
		Integer totalRows = formtableMainDao.countByExample(example);
		List<FormtableMain2DO> dataList = formtableMainDao.selectSimpleByExample(example);
		int totalPage = CommonUtils.ceilDivide(totalRows , pageRows);
		ModelAndView mv = new ModelAndView("info_disclosure");
		mv.addObject("docList", dataList);
		mv.addObject("curPage", pageNo);
		mv.addObject("totalRows", totalRows);
		mv.addObject("totalPage", totalPage);
		mv.addObject("beginPage", determineBeginPage(pageNo,totalPage));
		mv.addObject("endPage", determineEndPage(pageNo,totalPage));
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
	public ModelAndView addIndex4Aplly() {
		// 此处通过name传递值
		int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"),1);
		String startTime = request.getParameter("st");
		String endTime = request.getParameter("et");
		String callNumber = request.getParameter("call_Number");
		String publishOrganization = request.getParameter("publish_Organization");
		String infoName = request.getParameter("infoName");
		String indexOfFile = request.getParameter("indexOf_File");
		String openCategories = request.getParameter("select1");
		String keyWord = request.getParameter("keyword");
		StringBuilder query = new StringBuilder();
		query.append("?st=").append(CommonUtils.encodeurl(startTime));
		query.append("&et=").append(CommonUtils.encodeurl(endTime));
		query.append("&call_Number=").append(CommonUtils.encodeurl(callNumber));
		query.append("&infoName=").append(CommonUtils.encodeurl(infoName));
		query.append("&indexOf_File=").append(CommonUtils.encodeurl(indexOfFile));
		query.append("&select1=").append(CommonUtils.encodeurl(openCategories));
		query.append("&keyword=").append(CommonUtils.encodeurl(keyWord));
		query.append("&publish_Organization=").append(CommonUtils.encodeurl(publishOrganization));
		FormtableMain2DO example = new FormtableMain2DO();
		example.setYfrq(CommonUtils.trimToNull(startTime));
		example.setFwh(CommonUtils.trimToNull(endTime));
		example.setCallNumber(CommonUtils.trimToNull(callNumber));
		// example.setFwdw(publishOrganization);
		example.setZwbt(CommonUtils.trimToNull(infoName));
		example.setFileNumber(CommonUtils.trimToNull(indexOfFile));
//		example.setPageNo(CommonUtils.parseInt(pageNo, 1));
		// example.setYjml(openCategories);
		example.setKeyWord(CommonUtils.trimToNull(keyWord));
		Integer totalRows = formtableMainDao.countByExample(example);
		List<FormtableMain2DO> dataList = formtableMainDao.selectSimpleByExample(example);
		int totalPage = CommonUtils.ceilDivide(totalRows, 5);
		ModelAndView mv = new ModelAndView("index4");
		mv.addObject("docList", dataList);
		mv.addObject("curPage", pageNo);
		mv.addObject("totalRows", totalRows);
		mv.addObject("totalPage", totalPage);
		mv.addObject("beginPage", determineBeginPage(pageNo,totalPage));
		mv.addObject("endPage", determineEndPage(pageNo,totalPage));
		mv.addObject("queryStr", query.toString());
		return mv;
	}
	/*
	@RequestMapping("/index5.do")
	public ModelAndView addIndex5Aplly(ModelAndView mv){
		mv.setViewName("index5"); 
		return mv;
	}
	*/
	static int determineBeginPage(int curPage,int totalPage){
		if(curPage<=0 ){
			return 1;
		}
		if(curPage > totalPage){
			return totalPage;
		}
		int r = curPage - 5;
		int s = totalPage - 10;
		if(r > s) r = s;
		return r <= 0? 1:r;
	}
	static int determineEndPage(int curPage,int totalPage){
		int b = determineBeginPage(curPage,totalPage);
		int r = b + 10;
		return r > totalPage ? totalPage : r;
	}
}
