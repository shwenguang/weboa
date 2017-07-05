package com.harmony.wenguang.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

@Controller
@RequestMapping("/busi")
public class BusinessController {
    @Resource
    HttpServletRequest request;
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
        Enumeration<String> em = request.getParameterNames();
        while(em.hasMoreElements()){
            String key = em.nextElement();
            System.out.println(key+":::::"+request.getParameter(key));
        }
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
        String menu = null;
        try {
            InputStream is = BusinessController.class.getResourceAsStream("/mixin/menu.json");
            menu = IOUtils.toString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray memuList = JSON.parseArray(menu);
        mv.addObject("menuList", memuList);
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
