package com.harmony.wenguang.dao.dataobject;

public class WgInputDO {
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
	private int mode;
	//获取政府信息的载体形式 纸质文本、光盘、磁盘
	private int carrier;
	//所需政府信息用途类型 自身生产需要、自身科研的需要、自身生活的需要、查验自身信息
	private int use_type;
	//所需政府信息用途
	private String Information_use;
	//减免费用理由 农村五保户供养对象、属于城乡居民最低生活保障对象、属于领取国家抚恤补助的优抚对象、确有其他经济困难
	private String Remission_type;
	//申请人签名(盖章)
	private String Signature_applicant;
	public String getApplicant_Sign() {
		return applicant_Sign;
	}
	public void setApplicant_Sign(String applicant_Sign) {
		this.applicant_Sign = applicant_Sign;
	}
	public String getID_name() {
		return ID_name;
	}
	public void setID_name(String iD_name) {
		ID_name = iD_name;
	}
	public String getCorporate_sign() {
		return corporate_sign;
	}
	public void setCorporate_sign(String corporate_sign) {
		this.corporate_sign = corporate_sign;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getID_number() {
		return ID_number;
	}
	public void setID_number(String iD_number) {
		ID_number = iD_number;
	}
	public String getLegal_representative() {
		return Legal_representative;
	}
	public void setLegal_representative(String legal_representative) {
		Legal_representative = legal_representative;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostal_Code() {
		return Postal_Code;
	}
	public void setPostal_Code(String postal_Code) {
		Postal_Code = postal_Code;
	}
	public String getLegal_representative_s() {
		return Legal_representative_s;
	}
	public void setLegal_representative_s(String legal_representative_s) {
		Legal_representative_s = legal_representative_s;
	}
	public String getOrganization_name() {
		return Organization_name;
	}
	public void setOrganization_name(String organization_name) {
		Organization_name = organization_name;
	}
	public String getOrganization_name_s() {
		return Organization_name_s;
	}
	public void setOrganization_name_s(String organization_name_s) {
		Organization_name_s = organization_name_s;
	}
	public String getOrganization_number() {
		return Organization_number;
	}
	public void setOrganization_number(String organization_number) {
		Organization_number = organization_number;
	}
	public String getGovernment_information() {
		return Government_information;
	}
	public void setGovernment_information(String government_information) {
		Government_information = government_information;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getCarrier() {
		return carrier;
	}
	public void setCarrier(int carrier) {
		this.carrier = carrier;
	}
	public int getUse_type() {
		return use_type;
	}
	public void setUse_type(int use_type) {
		this.use_type = use_type;
	}
	public String getInformation_use() {
		return Information_use;
	}
	public void setInformation_use(String information_use) {
		Information_use = information_use;
	}
	public String getRemission_type() {
		return Remission_type;
	}
	public void setRemission_type(String remission_type) {
		Remission_type = remission_type;
	}
	public String getSignature_applicant() {
		return Signature_applicant;
	}
	public void setSignature_applicant(String signature_applicant) {
		Signature_applicant = signature_applicant;
	}

}
