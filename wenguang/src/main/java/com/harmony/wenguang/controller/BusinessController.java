package com.harmony.wenguang.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/left.do")
    public String left(){
        return "left";
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
