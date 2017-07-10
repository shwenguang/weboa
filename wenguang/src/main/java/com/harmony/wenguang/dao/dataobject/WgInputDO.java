package com.harmony.wenguang.dao.dataobject;

public class WgInputDO extends PageDTO{
    private static final long serialVersionUID = 1L;
    //申请人(个人)签名
	private String applicant_Sign;
	//证件名称
	private String ID_name;
	//申请人(法人或其它组织)签名
	private String corporate_sign;
	//单位/职业
	private String Occupation;
	//证件号码
	private String ID_number;
	//法定代表人
	private String Legal_representative;
	//通信地址
	private String address;
	//联系电话
	private String phone_number;
	//电子邮箱
	private String email;
	//邮政编码
	private String Postal_Code;
	//联系人
	private String Legal_representative_s;
	//政府信息公开义务机关(机构)名称
	private String Organization_name;
	//名称
	private String Organization_name_s;
	//文号
	private String Organization_number;
	//所需政府信息(其它特征描述)
	private String Government_information;
	//获取政府信息的方式  邮递、传真、递送、当面领取、现场查阅、电子邮件
	private String mode;
	//获取政府信息的载体形式 纸质文本、光盘、磁盘
	private String carrier;
	//所需政府信息用途类型 自身生产需要、自身科研的需要、自身生活的需要、查验自身信息
	private String use_type;
	//所需政府信息用途
	private String Information_use;
	//减免费用理由 农村五保户供养对象、属于城乡居民最低生活保障对象、属于领取国家抚恤补助的优抚对象、确有其他经济困难
	private String Remission_type;
	//申请人签名(盖章)
	private String Signature_applicant;
	

}
