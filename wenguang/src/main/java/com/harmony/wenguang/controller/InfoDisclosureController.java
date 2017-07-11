package com.harmony.wenguang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.harmony.wenguang.dao.dataobject.WgInputDO;
import com.harmony.wenguang.dao.impl.WgInputDaoImpl;

@Controller
@RequestMapping("/info/disclosure")
public class InfoDisclosureController {
	@Resource
    protected HttpServletRequest request;
	@Resource
	protected WgInputDaoImpl wgInputDaoImpl;
	@RequestMapping("/addNewApply.do")
	public ModelAndView addNewAplly(ModelAndView mv){
		mv.setViewName("addNewApply"); 
		return mv;
	}
	@RequestMapping(value="/insert.do",produces="application/json;charset=utf-8")
	@ResponseBody
	public String insertSQL() throws JSONException
	{
	    String json = request.getParameter("jsonstr");
		JSONObject jsonObj = JSON.parseObject(json);
		WgInputDO wgInputDO=new WgInputDO();
		wgInputDO.setApplicant_Sign(jsonObj.getString("Applicant"));//申请人(个人)签名
		wgInputDO.setID_name(jsonObj.getString("Document_Name"));//证件名称
		wgInputDO.setCorporate_sign(jsonObj.getString("Applicant_Organization"));//申请人(法人或其它组织)签名
		wgInputDO.setOccupation(jsonObj.getString("Profession"));//单位/职业
		wgInputDO.setID_number(jsonObj.getString("Document_Num"));//证件号码
		wgInputDO.setLegal_representative(jsonObj.getString("Legal_Person"));//法定代表人
		wgInputDO.setAddress(jsonObj.getString("Commun_Address"));//通信地址
		wgInputDO.setPhone_number(jsonObj.getString("Telphone"));//联系电话
		wgInputDO.setEmail(jsonObj.getString("Email"));//电子邮箱
		wgInputDO.setPostal_Code(jsonObj.getString("ZipCode"));//邮政编码
		wgInputDO.setLegal_representative_s(jsonObj.getString("Contacts"));//联系人
		wgInputDO.setOrganization_name(jsonObj.getString("Zfxxgk_Name"));//政府信息公开义务机关(机构)名称
		wgInputDO.setOrganization_name_s(jsonObj.getString("Zf_Name"));//名称
		wgInputDO.setOrganization_number(jsonObj.getString("Zf_NO"));//文号
		wgInputDO.setGovernment_information(jsonObj.getString("Description"));//所需政府信息(其它特征描述)
		wgInputDO.setMode(jsonObj.getString("Zfxx_Style"));//获取政府信息的方式  邮递、传真、递送、当面领取、现场查阅、电子邮件
		wgInputDO.setCarrier(jsonObj.getString("Carrier_Form"));//获取政府信息的载体形式 纸质文本、光盘、磁盘
		wgInputDO.setUse_type(jsonObj.getString("Use_Style"));//所需政府信息用途类型 自身生产需要、自身科研的需要、自身生活的需要、查验自身信息
		wgInputDO.setInformation_use(jsonObj.getString("Specific_Use"));//所需政府信息用途
		wgInputDO.setRemission_type(jsonObj.getString("Fee_Reduction"));//减免费用理由 农村五保户供养对象、属于城乡居民最低生活保障对象、属于领取国家抚恤补助的优抚对象、确有其他经济困难
		wgInputDO.setSignature_applicant(jsonObj.getString("Sqr_Signature"));//申请人签名(盖章)
		
		System.out.println(JSON.toJSONString(wgInputDO,true));
//		wgInputDaoImpl.insert(wgInputDO);
		JSONObject result = new JSONObject();
		result.put("result", "success");
		result.put("message","提交成功");
		return result.toJSONString();
	}
	
}
