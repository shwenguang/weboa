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

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

@Controller
@RequestMapping("/busi")
public class BusinessController {
    @Resource
    FormtableMainDao formtableMainDao;
    
    
    @RequestMapping("/uploadPage.do")
    public String uploadPage(){
        return "uploadPage";
    }
    
    @RequestMapping("/upload.do")
    public String upload(@RequestParam("file") CommonsMultipartFile file){
        FormtableMainDO md = new FormtableMainDO();
        try(InputStream is = file.getInputStream();
          ByteArrayOutputStream os = new ByteArrayOutputStream();
          ) {
            int t ;
            while((t=is.read()) != -1){
                os.write(t);
            }
            md.setRequestId(new Long(System.currentTimeMillis()).intValue());
            md.setZwInputStream(new Base64().encodeAsString(os.toByteArray()));
            md.setFjInputStream(new Base64().encodeAsString(os.toByteArray()));
        } catch (IOException e) {
            return null;
        }
        formtableMainDao.insert(md);
        return null;
    }
}
