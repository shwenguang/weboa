package com.harmony.wenguang.dao.dataobject;

public class WgDisclosureInfoDO {
	//申请人(个人)签名
	private String applicant_sign;
	//证件名称
	private String id_name;
	//申请人(法人或其它组织)签名
	private String corporate_sign;
	//单位/职业
	private String occupation;
	//证件号码
	private String id_number;
	//法定代表人
	private String legal_representative;
	//通信地址
	private String address;
	//联系电话
	private String phone_number;
	//电子邮箱
	private String email;
	//邮政编码
	private String postal_code;
	//联系人
	private String legal_representative_s;
	//政府信息公开义务机关(机构)名称
	private String organization_name;
	//名称
	private String organization_name_s;
	//文号
	private String organization_number;
	//所需政府信息(其它特征描述)
	private String government_information;
	//获取政府信息的方式  邮递、传真、递送、当面领取、现场查阅、电子邮件
	private String mode;
	//获取政府信息的载体形式 纸质文本、光盘、磁盘
	private String carrier;
	//所需政府信息用途类型 自身生产需要、自身科研的需要、自身生活的需要、查验自身信息
	private String use_type;
	//所需政府信息用途
	private String information_use;
	//减免费用理由 农村五保户供养对象、属于城乡居民最低生活保障对象、属于领取国家抚恤补助的优抚对象、确有其他经济困难
	private String remission_type;
	//申请人签名(盖章)
	private String signature_applicant;
    public String getApplicant_sign() {
        return applicant_sign;
    }
    public void setApplicant_sign(String applicant_sign) {
        this.applicant_sign = applicant_sign;
    }
    public String getId_name() {
        return id_name;
    }
    public void setId_name(String id_name) {
        this.id_name = id_name;
    }
    public String getCorporate_sign() {
        return corporate_sign;
    }
    public void setCorporate_sign(String corporate_sign) {
        this.corporate_sign = corporate_sign;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getId_number() {
        return id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public String getLegal_representative() {
        return legal_representative;
    }
    public void setLegal_representative(String legal_representative) {
        this.legal_representative = legal_representative;
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
    public String getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    public String getLegal_representative_s() {
        return legal_representative_s;
    }
    public void setLegal_representative_s(String legal_representative_s) {
        this.legal_representative_s = legal_representative_s;
    }
    public String getOrganization_name() {
        return organization_name;
    }
    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }
    public String getOrganization_name_s() {
        return organization_name_s;
    }
    public void setOrganization_name_s(String organization_name_s) {
        this.organization_name_s = organization_name_s;
    }
    public String getOrganization_number() {
        return organization_number;
    }
    public void setOrganization_number(String organization_number) {
        this.organization_number = organization_number;
    }
    public String getGovernment_information() {
        return government_information;
    }
    public void setGovernment_information(String government_information) {
        this.government_information = government_information;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getUse_type() {
        return use_type;
    }
    public void setUse_type(String use_type) {
        this.use_type = use_type;
    }
    public String getInformation_use() {
        return information_use;
    }
    public void setInformation_use(String information_use) {
        this.information_use = information_use;
    }
    public String getRemission_type() {
        return remission_type;
    }
    public void setRemission_type(String remission_type) {
        this.remission_type = remission_type;
    }
    public String getSignature_applicant() {
        return signature_applicant;
    }
    public void setSignature_applicant(String signature_applicant) {
        this.signature_applicant = signature_applicant;
    }
   
}
