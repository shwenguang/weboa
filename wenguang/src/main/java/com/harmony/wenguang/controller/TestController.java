package com.harmony.wenguang.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.google.common.io.Files;
import com.harmony.wenguang.constant.FileType;
import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.WgBlobDataDao;
import com.harmony.wenguang.dao.WgDocumentsDao;
import com.harmony.wenguang.dao.dataobject.WgBlobDataDO;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;
import com.harmony.wenguang.service.FileDocument;
import com.harmony.wenguang.support.Word2Html;

@Controller
public class TestController {
	@Resource
	DataSource dataSource;
	@Resource
	WgBlobDataDao wgBlobDataDao;
	@Resource
	FormtableMainDao formtableMainDao;
	@Resource
	HttpServletRequest request;
	@Resource
	WgDocumentsDao wgDocumentsDao;

	@RequestMapping(value = "/test/createTable.do")
	@ResponseBody
	public String createTable() {
		try {
//			executeSql("drop table IF EXISTS wg_test ");
//			executeSql(
//					"create table wg_test( id int primary key AUTO_INCREMENT, name varchar(100), remark varchar(100) )");
//			executeSql("drop table if exists wg_documents");
//			executeSql(
//					"create table wg_documents(id int primary key AUTO_INCREMENT,doc_name varchar(200),doc_type varchar(20),doc_content blob, status varchar(10))");
//			executeSql("drop table if exists wg_blob_data");
//			executeSql("create table wg_blob_data(id int primary key AUTO_INCREMENT,name varchar(100), content blob)");
//			executeSql("drop table if exists formtable_main_2");
//			executeSql("CREATE TABLE formtable_main_2 (id int primary key AUTO_INCREMENT,requestId int,	fwh varchar(200),	fwdw int,	jj int,	sfgk int,	qfr int,	zw int,	zs varchar(200),	zbdw int ,	ngr int ,	hbdw text ,	hbr text ,	fj text ,	dz int ,	yfrq char(10) ,	jd int ,	dyfs int ,	bz text ,	ld varchar(2000) ,	sfxyldsy int ,	fwzl int ,	ljxz int ,	czshczz varchar(2000) ,	bgszr varchar(2000) ,	hhbr varchar(100) ,	bgszrrlzy text ,	qz varchar(200) ,	qzx text ,	fwh1 int ,	fwh2 int ,	fwh3 varchar(200) ,	xgtalc int ,	xgtalcbdjm varchar(1000) ,	sfgkwb varchar(200) ,	sfxyhb int ,	yjml int ,	ejml int ,	sjml int ,	hbcs varchar(2000) ,	hbcsczz varchar(2000) ,	ldqz varchar(999) ,	zwbt varchar(999) ,	fjbt varchar(999) ,	fjInputStream varchar(60000) ,	 zwInputStream varchar(60000))");
		
		final byte[] bs = Files.toByteArray(new File("C:/Users/yinguoliang/Desktop/文档webservices接口.docx"));
		WgDocumentsDO wgDocumentsDO = new WgDocumentsDO();
		wgDocumentsDO.setDocContent(new Base64().encodeAsString(bs));
		wgDocumentsDO.setDocName("lunwen");
		wgDocumentsDO.setDocType("docx");
		wgDocumentsDO.setStatus("1");
		wgDocumentsDO.setCreateDate(new Date());
		wgDocumentsDO.setRecordType("base64");
		wgDocumentsDao.insert(wgDocumentsDO);
		
		wgDocumentsDO = new WgDocumentsDO();
		String html=Word2Html.docx2Html(new FileDocument(){

			@Override
			public FileType getSuffix() {
				return null;
			}

			@Override
			public InputStream getInputStream() {
				return new ByteArrayInputStream(bs);
			}

			@Override
			public File getFile() {
				return null;
			}

			@Override
			public String getName() {
				return null;
			}});
		System.out.println(html);
		wgDocumentsDO.setDocContent(html);
		wgDocumentsDO.setDocName("lunwenhtml");
		wgDocumentsDO.setDocType("html");
		wgDocumentsDO.setStatus("1");
		wgDocumentsDO.setCreateDate(new Date());
		wgDocumentsDO.setRecordType("text");
		wgDocumentsDao.insert(wgDocumentsDO);
		
		} catch (Exception e) {
			return e.getMessage();
		}
		return "success";
	}

//	private void executeSql(String sql) throws SQLException {
//		Connection conn = dataSource.getConnection();
//		PreparedStatement stmt = conn.prepareStatement(sql);
//		stmt.executeUpdate();
//		conn.close();
//	}

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
