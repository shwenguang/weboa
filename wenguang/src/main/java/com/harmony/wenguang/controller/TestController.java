package com.harmony.wenguang.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.harmony.wenguang.dao.WgTestDao;
import com.harmony.wenguang.dao.dataobject.WgTestDO;

@Controller
public class TestController {
	@Resource
	DataSource dataSource;
	@Resource
	WgTestDao testDao;
    @RequestMapping("/test/*")
	public String no404(){
    	System.out.println(">>>>>>");
	    return "404";
	}
    @RequestMapping(value="/test/createTable.do")
	@ResponseBody
	public String createTable(){
    	try {
    		executeSql("drop table IF EXISTS wg_test ");
    		executeSql("create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) )");
		} catch (Exception e) {
			return e.getMessage();
		}
    	return "success";
    }
    private void executeSql(String sql) throws SQLException{
    	Connection conn = dataSource.getConnection();
    	PreparedStatement stmt = conn.prepareStatement(sql);
    	stmt.executeUpdate();
    	conn.close();
    }
	@RequestMapping(value="/test/hello.do")
	@ResponseBody
	public String index(){
		WgTestDO testDo = new WgTestDO();
		testDo.setName("YYYY");
		testDao.insert(testDo);
		testDo.setName("22222");
		testDao.insert(testDo);
		List<WgTestDO> list = testDao.queryAll();
		if(list!=null){
			for(WgTestDO dd : list){
				System.out.println(dd.getId()+"----"+dd.getName());
			}
		}
		System.out.println(">>>>>>>ssss>>>>>>");
		return "hello world";
	}
	@RequestMapping(value="/test/tojsp.do")
	public ModelAndView tojsp(){
        ModelAndView mv = new ModelAndView("jsptest");
        System.out.println(">>>>>>>ssss>>>>>>");
        return mv;
	}
}
