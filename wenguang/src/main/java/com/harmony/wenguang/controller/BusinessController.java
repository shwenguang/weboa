package com.harmony.wenguang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.harmony.wenguang.dao.FormtableMain39Dao;
import com.harmony.wenguang.dao.FormtableMain40Dao;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain39DO;
import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;
import com.harmony.wenguang.support.CommonUtils;

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
    public ModelAndView docindex(){
        String yjml = request.getParameter("yjml");
        String ejml = request.getParameter("ejml");
        ModelAndView mv = new ModelAndView("docindex2");
        //请求中应该有一级目录ID，如果没有，则默认页面展示第一个一级目录内容
        if(StringUtils.isBlank(yjml)){
            yjml = "1";
        }
        //查出所有的一级目录
        List<FormtableMain39DO> list1 = formtableMain39Dao.selectAllData();
        mv.addObject("menu1List", list1);
        //查询指定的一级目录下的所有二级目录
		FormtableMain40DO example1 = new FormtableMain40DO();
		example1.setYjmlmc(yjml);
		List<FormtableMain40DO> list2 = formtableMain40Dao.selectByExample(example1);
		mv.addObject("menu2List", list2);
		//一级目录信息
		FormtableMain39DO yjmlExamle = new FormtableMain39DO();
		yjmlExamle.setId(CommonUtils.parseLong(yjml, -1L));
		List<FormtableMain39DO> yjlist = formtableMain39Dao.selectByExample(yjmlExamle);
		if (yjlist != null && yjlist.size() == 1) {
			mv.addObject("yjmlData", yjlist.get(0));
		}
        //如果请求中含有一级目录和二级目录，则查询文章列表
        if(StringUtils.isNotBlank(yjml) && StringUtils.isNotBlank(ejml)){
            int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
            int pageRows = CommonUtils.parseInt(request.getParameter("pageRows"), 20);
            FormtableMain2DO example = new FormtableMain2DO();
            example.setPageNo(pageNo);
            example.setPageRows(pageRows);
            example.setXxgkyjml(yjml);
            example.setXxgkejml(ejml);
            List<FormtableMain2DO> dataList = formtableMainDao.selectSimpleByExample(example);
            mv.addObject("docList", dataList);
            
            FormtableMain40DO ejmlExample = new FormtableMain40DO();
            ejmlExample.setId(CommonUtils.parseLong(ejml, -1L));
            List<FormtableMain40DO> ejlist = formtableMain40Dao.selectByExample(ejmlExample);
            if(ejlist!=null && ejlist.size()==1){
                mv.addObject("ejmlData",ejlist.get(0));
            }
        }
        mv.addObject("yjml",yjml);
        mv.addObject("ejml",ejml);
        return mv;
    }
    @RequestMapping("/docshow.do")
    public ModelAndView docshow(){
        String yjml = request.getParameter("yjml");
        String ejml = request.getParameter("ejml");
        String docid = request.getParameter("docid");
        ModelAndView mv = new ModelAndView("docshow");
        //请求中应该有一级目录ID，如果没有，则默认页面展示第一个一级目录内容
        if(StringUtils.isBlank(yjml)){
            yjml = "1";
        }
        //查出所有的一级目录
        List<FormtableMain39DO> list1 = formtableMain39Dao.selectAllData();
        mv.addObject("menu1List", list1);
        //查询指定的一级目录下的所有二级目录
        FormtableMain40DO example1 = new FormtableMain40DO();
        example1.setYjmlmc(yjml);
        List<FormtableMain40DO> list2 = formtableMain40Dao.selectByExample(example1);
        mv.addObject("menu2List", list2);
        //一级目录信息
        FormtableMain39DO yjmlExamle = new FormtableMain39DO();
        yjmlExamle.setId(CommonUtils.parseLong(yjml, -1L));
        List<FormtableMain39DO> yjlist = formtableMain39Dao.selectByExample(yjmlExamle);
        if (yjlist != null && yjlist.size() == 1) {
            mv.addObject("yjmlData", yjlist.get(0));
        }
        //如果请求中含有一级目录和二级目录，则查询文章列表
        if(StringUtils.isNotBlank(yjml) && StringUtils.isNotBlank(ejml)){
            int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
            int pageRows = CommonUtils.parseInt(request.getParameter("pageRows"), 20);
            FormtableMain2DO example = new FormtableMain2DO();
            example.setPageNo(pageNo);
            example.setPageRows(pageRows);
            example.setXxgkyjml(yjml);
            example.setXxgkejml(ejml);
            List<FormtableMain2DO> dataList = formtableMainDao.selectSimpleByExample(example);
            mv.addObject("docList", dataList);
            
            FormtableMain40DO ejmlExample = new FormtableMain40DO();
            ejmlExample.setId(CommonUtils.parseLong(ejml, -1L));
            List<FormtableMain40DO> ejlist = formtableMain40Dao.selectByExample(ejmlExample);
            if(ejlist!=null && ejlist.size()==1){
                mv.addObject("ejmlData",ejlist.get(0));
            }
        }
        mv.addObject("docid", docid);
        
        return mv;
    }
//    @RequestMapping("/top.do")
//    public String top(){
//        return "top";
//    }
//    @RequestMapping("/doclist.do")
//    public ModelAndView doclist(){
//        ModelAndView mv = new ModelAndView("doclist");
//        return mv;
//    }
//    @RequestMapping(value="/querydocs.do", produces="application/json; charset=UTF-8")
//    @ResponseBody
//    public Object querydocs(){
//        int pageNo = CommonUtils.parseInt(request.getParameter("pageNo"), 1);
//        int pageRows = CommonUtils.parseInt(request.getParameter("pageRows"), 20);
//        String yjmlid = request.getParameter("yjmlid");
//        String ejmlid = request.getParameter("ejmlid");
//        String yjmlmc = request.getParameter("yjmlmc");
//        String ejmlmc = request.getParameter("ejmlmc");
//        
//        System.out.println(String.format("======================查询文档,参数========================="
//                + "\n一级目录名称=%s,一级目录编号=%s,\n二级目录名称=%s,二级目录编号=%s,\n当前页数=%d,每页大小=%d",
//                yjmlmc,yjmlid,ejmlmc,ejmlid,pageNo,pageRows));
//        
//        List<JSONObject> list = new ArrayList<JSONObject>();
//        FormtableMain2DO example = new FormtableMain2DO();
//        example.setPageNo(pageNo);
//        example.setPageRows(pageRows);
//        example.setXxgkyjml(yjmlid);
//        example.setXxgkejml(ejmlid);
//        List<FormtableMain2DO> dataList = formtableMainDao.selectSimpleByExample(example);
//        if(dataList != null)
//        for(FormtableMain2DO data : dataList){
//            JSONObject page = new JSONObject();
//            String name = data.getZwbt();
//            page.put("name", StringUtils.isBlank(name)?"文件":name);
//            page.put("url", "/wg/reqid/"+data.getRequestId());
//            page.put("zs", data.getZs());
//            page.put("rowid", data.getRowId());
//            list.add(page);
//        }
//        return list;
//    }
//    @RequestMapping("/left.do")
//    public ModelAndView left(){
//        ModelAndView mv =new ModelAndView("left");
//        String key = "menu_left_2017_alldata";
//        JSONArray menuList = LocalCache.get(key);
//        if(menuList == null){
//            menuList = new JSONArray();
//            List<FormtableMain39DO> list1 = formtableMain39Dao.selectAllData();
//            for(FormtableMain39DO d1 : list1){
//                JSONObject j = new JSONObject();
//                j.put("name", d1.getYjmlmc());
//                j.put("rowid", d1.getRowId());
//                j.put("mlbh", d1.getMlbh());
//                FormtableMain40DO example = new FormtableMain40DO();
//                example.setYjmlmc(d1.getMlbh());
//                List<FormtableMain40DO> list2 = formtableMain40Dao.selectByExample(example);
//                JSONArray subs = new JSONArray();
//                for(FormtableMain40DO d2 : list2){
//                    JSONObject jj = new JSONObject();
//                    jj.put("name", d2.getEjmlmc());
//                    jj.put("rowid", d2.getRowId());
//                    jj.put("ejmlid", d2.getId());//二级目录ID
//                    jj.put("yjmlid", d1.getId());//一级目录ID
//                    jj.put("mlbh", d2.getMlbh());
//                    subs.add(jj);
//                }
//                j.put("subs", subs);
//                menuList.add(j);
//            }
//            LocalCache.cache(key, menuList);
//        }
//        
//        mv.addObject("menuList", menuList);
//        return mv;
//    }
//    @RequestMapping("/uploadPage.do")
//    public String uploadPage(){
//        return "uploadPage";
//    }
    
//    @RequestMapping("/upload.do")
//    public ModelAndView upload(@RequestParam("file") CommonsMultipartFile file){
//        ModelAndView mv = new ModelAndView();
//        FormtableMain2DO md = new FormtableMain2DO();
//        try(InputStream is = file.getInputStream();
//          ByteArrayOutputStream os = new ByteArrayOutputStream();
//          ) {
//            int t ;
//            while((t=is.read()) != -1){
//                os.write(t);
//            }
//            md.setRequestId(Math.abs(new Long(System.currentTimeMillis()).intValue()));
//            md.setZwInputStream(new Base64().encodeAsString(os.toByteArray()));
//            md.setFjInputStream(new Base64().encodeAsString(os.toByteArray()));
//            formtableMainDao.insert(md);
//            mv.addObject("msg", "上传成功");
//        } catch (IOException e) {
//            mv.setViewName("fail");
//            mv.addObject("msg", e.getMessage());
//            return mv;
//        }
//        mv.setViewName("success");
//        return mv;
//    }
}
