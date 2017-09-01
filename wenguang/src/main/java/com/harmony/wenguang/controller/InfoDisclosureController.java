package com.harmony.wenguang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.dataobject.WgDisclosureInfoDO;
import com.harmony.wenguang.dao.impl.WgDisclosureInfoDaoImpl;

@Controller
@RequestMapping("/info/disclosure")
public class InfoDisclosureController {
    @Resource
    protected HttpServletRequest      request;
    @Resource
    protected WgDisclosureInfoDaoImpl wgDisclosureInfoDao;

    @RequestMapping("/addNewApply.do")
    public ModelAndView addNewAplly(ModelAndView mv) {
        mv.setViewName("addNewApply2");
        return mv;
    }

    @RequestMapping("/addNewApplyTable.do")
    public ModelAndView addNewApplyTable(ModelAndView mv) {
        mv.setViewName("addNewApplyTable");
        mv.addObject("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return mv;
    }

    @RequestMapping(value = "/insert.do", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String insertSQL(WgDisclosureInfoDO info) throws JSONException {
        System.out.println(JSON.toJSONString(info, true));
        wgDisclosureInfoDao.insert(info);
        JSONObject result = new JSONObject();
        result.put("result", "success");
        result.put("message", "提交成功");
        return result.toJSONString();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
