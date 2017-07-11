package com.harmony.wenguang.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.FormtableMain39Dao;
import com.harmony.wenguang.dao.FormtableMain40Dao;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain39DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;
import com.harmony.wenguang.support.CommonUtils;
import com.harmony.wenguang.support.LocalCache;

@Controller
@RequestMapping("/busi")
public class BusinessController {
    @Resource
    HttpServletRequest request;
    @Resource
    FormtableMainDao formtableMainDao;
    @Resource
    FormtableMain39Dao formtableMain39Dao;
    @Resource
    FormtableMain40Dao formtableMain40Dao;

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
        return mv;
    }
    @RequestMapping(value="/querydocs.do", produces="application/json; charset=UTF-8")
    @ResponseBody
    public Object querydocs(){
        int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
        int pageRows = CommonUtils.parseInt(request.getParameter("pageRows"), 20);
        String yjmlbh = request.getParameter("yjmlbh");
        String ejmlbh = request.getParameter("ejmlbh");
        String yjmlmc = request.getParameter("yjmlmc");
        String ejmlmc = request.getParameter("ejmlmc");
        
        System.out.println(String.format("查询文档,参数:\n一级目录名称=%s,一级目录编号=%s,\n二级目录名称=%s,二级目录编号=%s,\n当前页数=%d,每页大小=%d",
                yjmlmc,yjmlbh,ejmlmc,ejmlbh,pageNo,pageRows));
        
        List<JSONObject> list = new ArrayList<JSONObject>();
        FormtableMainDO example = new FormtableMainDO();
        example.setPageNo(pageNo);
        example.setPageRows(pageRows);
        List<FormtableMainDO> dataList = formtableMainDao.selectSimpleByExample(example);
        if(dataList != null)
        for(FormtableMainDO data : dataList){
            JSONObject page = new JSONObject();
            String name = data.getZwbt();
            page.put("name", StringUtils.isBlank(name)?"文件":name);
            page.put("url", "/wg/reqid/"+data.getRequestId());
            page.put("zs", data.getZs());
            page.put("rowid", data.getRowId());
            list.add(page);
        }
        return list;
    }
    @RequestMapping("/left.do")
    public ModelAndView left(){
        ModelAndView mv =new ModelAndView("left");
        String key = "menu_left_2017_alldata";
        JSONArray menuList = LocalCache.get(key);
        if(menuList == null){
            menuList = new JSONArray();
            List<FormtableMain39DO> list1 = formtableMain39Dao.selectAllData();
            for(FormtableMain39DO d1 : list1){
                JSONObject j = new JSONObject();
                j.put("name", d1.getYjmlmc());
                j.put("rowid", d1.getRowId());
                j.put("mlbh", d1.getMlbh());
                FormtableMain40DO example = new FormtableMain40DO();
                example.setYjmlmc(d1.getMlbh());
                List<FormtableMain40DO> list2 = formtableMain40Dao.selectByExample(example);
                JSONArray subs = new JSONArray();
                for(FormtableMain40DO d2 : list2){
                    JSONObject jj = new JSONObject();
                    jj.put("name", d2.getEjmlmc());
                    jj.put("rowid", d2.getRowId());
                    jj.put("ejmlbh", d2.getMlbh());//二级目录编号
                    jj.put("yjmlbh", d1.getMlbh());//一级目录编号
                    jj.put("mlbh", d2.getMlbh());
                    subs.add(jj);
                }
                j.put("subs", subs);
                menuList.add(j);
            }
            LocalCache.cache(key, menuList);
        }
        
        mv.addObject("menuList", menuList);
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
