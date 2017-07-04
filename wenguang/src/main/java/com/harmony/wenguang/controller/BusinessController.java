package com.harmony.wenguang.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

@Controller
@RequestMapping("/busi")
public class BusinessController {
    @Resource
    FormtableMainDao formtableMainDao;
    
    @RequestMapping("/docindex.do")
    public String docindex(){
        return "docindex";
    }
    @RequestMapping("/top.do")
    public String top(){
        return "top";
    }
    @RequestMapping("/doclist.do")
    public ModelAndView doclist(){
        ModelAndView mv = new ModelAndView("doclist");
        List<JSONObject> list = new ArrayList<JSONObject>();
        List<FormtableMainDO> dataList = formtableMainDao.selectSimpleByExample(null);
        if(dataList != null)
        for(FormtableMainDO data : dataList){
            JSONObject page = new JSONObject();
            String name = data.getZwbt();
            page.put("name", StringUtils.isBlank(name)?"文件":name);
            page.put("url", "/wg/reqid/"+data.getRequestId());
            page.put("zs", data.getZs());
            list.add(page);
        }
        mv.addObject("doclist", list);
        return mv;
    }
    @RequestMapping("/left.do")
    public ModelAndView left(){
        ModelAndView mv =new ModelAndView("left");
        List<JSONObject> list = new ArrayList<JSONObject>();
        JSONObject level1 = new JSONObject();
        level1.put("menuId", 1);
        level1.put("menuName", "目录1");
        level1.put("menuCode", "M001");
        JSONObject level2 = new JSONObject();
        level2.put("menuId", 1);
        level2.put("menuName", "目录2");
        level2.put("menuCode", "M002");
        List<JSONObject> sublist2_1 = new ArrayList<JSONObject>();
        level2.put("subMenu", sublist2_1);
        JSONObject level21 = new JSONObject();
        level21.put("menuId", 1);
        level21.put("menuName", "子目录2");
        level21.put("menuCode", "SM002");
        JSONObject level22 = new JSONObject();
        level22.put("menuId", 1);
        level22.put("menuName", "子目录2");
        level22.put("menuCode", "SM002");
        sublist2_1.add(level21);
        sublist2_1.add(level22);
        JSONObject level3 = new JSONObject();
        level3.put("menuId", 1);
        level3.put("menuName", "目录3");
        level3.put("menuCode", "M003");
        JSONObject level4 = new JSONObject();
        level4.put("menuId", 1);
        level4.put("menuName", "目录4");
        level4.put("menuCode", "M004");
        
        list.add(level1);
        list.add(level2);
        list.add(level3);
        list.add(level4);
        mv.addObject("menuList", list);
        return mv;
    }
    @RequestMapping("/uploadPage.do")
    public String uploadPage(){
        return "uploadPage";
    }
    
    @RequestMapping("/upload.do")
    public ModelAndView upload(@RequestParam("file") CommonsMultipartFile file){
        ModelAndView mv = new ModelAndView();
        FormtableMainDO md = new FormtableMainDO();
        try(InputStream is = file.getInputStream();
          ByteArrayOutputStream os = new ByteArrayOutputStream();
          ) {
            int t ;
            while((t=is.read()) != -1){
                os.write(t);
            }
            md.setRequestId(Math.abs(new Long(System.currentTimeMillis()).intValue()));
            md.setZwInputStream(new Base64().encodeAsString(os.toByteArray()));
            md.setFjInputStream(new Base64().encodeAsString(os.toByteArray()));
            formtableMainDao.insert(md);
            mv.addObject("msg", "上传成功");
        } catch (IOException e) {
            mv.setViewName("fail");
            mv.addObject("msg", e.getMessage());
            return mv;
        }
        mv.setViewName("success");
        return mv;
    }
}
