package com.harmony.wenguang.controller;

import java.util.Enumeration;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMain39Dao;
import com.harmony.wenguang.dao.FormtableMain40Dao;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain39DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;
import com.harmony.wenguang.support.CommonUtils;
import com.harmony.wenguang.vo.FormtableMain2Vo;

@Controller
@RequestMapping("/bg")
public class BgManageController {
	@Resource
    HttpServletRequest request;
	@Resource
    FormtableMainDao formtableMainDao;
	@Resource
    FormtableMain39Dao formtableMain39Dao;
    @Resource
    FormtableMain40Dao formtableMain40Dao;
    
    
	@RequestMapping("/index.do")
    public ModelAndView index(){
		ModelAndView mv = new ModelAndView("bgindex");
		return mv;
	}
	@RequestMapping("/menuTree.do")
	@ResponseBody
    public Object menuTree(){
	    JSONArray menutree = new JSONArray();
	    List<FormtableMain39DO> yjmls = formtableMain39Dao.selectAllData();
	    for(FormtableMain39DO yj : yjmls ){
	        JSONObject menu1 = new JSONObject();
	        menutree.add(menu1);
	        menu1.put("name", yj.getYjmlmc());
	        menu1.put("mlbh", yj.getMlbh());
	        FormtableMain40DO t = new FormtableMain40DO();
	        t.setYjmlmc(yj.getMlbh());
	        List<FormtableMain40DO> subs = formtableMain40Dao.selectByExample(t);
	        JSONArray menu2 = new JSONArray();
	        for(FormtableMain40DO sub : subs){
	            JSONObject subMenu = new JSONObject();
	            menu2.add(subMenu);
	            subMenu.put("name", sub.getEjmlmc());
	            subMenu.put("mlbh", sub.getId());
	        }
	        menu1.put("subs", menu2);
	    }
        return menutree;
    }
	
	@RequestMapping("/getDetail.do")
	@ResponseBody
	public Object getDetail(){
	    Long id = CommonUtils.parseLong(request.getParameter("id"), null);
	    FormtableMain2DO example = new FormtableMain2DO();
	    example.setId(id);
	    List<FormtableMain2DO> list = formtableMainDao.selectSimpleByExample(example);
	    
	    if(list.size() > 0){
	        FormtableMain2Vo vo = new FormtableMain2Vo();
	        BeanUtils.copyProperties(list.get(0), vo);
	        return vo;
	    }
	    else{
	        return null;
	    }
	}
	
	@RequestMapping("/uploadFile.do")
    @ResponseBody
    public Object uploadFile(){
	    Enumeration<String> e = request.getParameterNames();
	    while(e.hasMoreElements()){
	        System.out.println(e.nextElement());
	    }
	    System.out.println("........................."+request.getContentLength());
	    return null;
	}
	
	@RequestMapping("/queryList.do")
	@ResponseBody
    public Object queryList(){
		JSONObject json = new JSONObject();
		String xxgkejml = request.getParameter("ejml");
		String xxgkyjml = request.getParameter("yjml");
		int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
		int pageSize = CommonUtils.parseInt(request.getParameter("pageSize"), 20);
		FormtableMain2DO example = new FormtableMain2DO();
		example.setPageNo(pageNo);
		example.setPageRows(pageSize);
		example.setXxgkejml(xxgkejml);
		example.setXxgkyjml(xxgkyjml);
		int total = formtableMainDao.countByExample(example);
		List<FormtableMain2DO> list = formtableMainDao.selectSimpleByExample(example);
		json.put("total", total);
		json.put("list", list);
		return json;
	}
}
