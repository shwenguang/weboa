package com.harmony.wenguang.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.harmony.wenguang.dao.WgBlobDataDao;
import com.harmony.wenguang.dao.dataobject.WgBlobDataDO;

@Controller
public class TestController {
	@Resource
	DataSource dataSource;
	@Resource
	WgBlobDataDao wgBlobDataDao;

	@Resource
	HttpServletRequest request;

	@RequestMapping(value = "/test/createTable.do")
	@ResponseBody
	public String createTable() {
		try {
			executeSql("drop table IF EXISTS wg_test ");
			executeSql(
					"create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) )");
			executeSql("drop table if exists wg_documents");
			executeSql(
					"create table wg_documents(id int primary key AUTO_INCREMENT,file_type varchar(20),doc_name varchar(200),doc_path varchar(200),doc_content blob, status varchar(10))");
			executeSql("drop table if exists wg_blob_data");
			executeSql("create table wg_blob_data(id int primary key AUTO_INCREMENT,name varchar(100), content blob)");
		} catch (Exception e) {
			return e.getMessage();
		}
		return "success";
	}

	private void executeSql(String sql) throws SQLException {
		Connection conn = dataSource.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();
		conn.close();
	}

	@RequestMapping(value = "/test/hello.do")
	@ResponseBody
	public String index(HttpServletResponse response) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name=" + name + ",age=" + age);
		this.allowCrossDomain(response);
		System.out.println(">>>>>>>ssss>>>>>>");
		Object list = new String("123");
		return JSON.toJSONString(list);
	}

	@RequestMapping(value = "/test/tojsp.do")
	public ModelAndView tojsp() {
		ModelAndView mv = new ModelAndView("jsptest");
		System.out.println(">>>>>>>ssss>>>>>>");
		return mv;
	}

	@RequestMapping("/test/blob.do")
	@ResponseBody
	public String doblob() {
		WgBlobDataDO data = new WgBlobDataDO();
		data.setName("123");
		data.setContent("Hello Blob".getBytes());
		wgBlobDataDao.insert(data);

		WgBlobDataDO dd = wgBlobDataDao.getData(1);
		if (dd != null && dd.getContent() != null) {
			System.out.println("read from db:" + new String(dd.getContent()));
		}

		return "success";
	}

	private void allowCrossDomain(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	}
}
