package com.harmony.wenguang.dao.dataobject;

import java.io.Serializable;

public class FormtableMain39DO extends PageDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    Long id;
    Integer requestId;
	String yjmlmc;
	String mlbh;
	Integer formmodeid;
	Integer modedatacreater;
	Integer modedatacreatertype;
	String modedatacreatedate;
	String modedatacreatetime;
	Integer xssx;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getRequestId() {
        return requestId;
    }
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
    public String getYjmlmc() {
        return yjmlmc;
    }
    public void setYjmlmc(String yjmlmc) {
        this.yjmlmc = yjmlmc;
    }
    public String getMlbh() {
        return mlbh;
    }
    public void setMlbh(String mlbh) {
        this.mlbh = mlbh;
    }
    public Integer getFormmodeid() {
        return formmodeid;
    }
    public void setFormmodeid(Integer formmodeid) {
        this.formmodeid = formmodeid;
    }
    public Integer getModedatacreater() {
        return modedatacreater;
    }
    public void setModedatacreater(Integer modedatacreater) {
        this.modedatacreater = modedatacreater;
    }
    public Integer getModedatacreatertype() {
        return modedatacreatertype;
    }
    public void setModedatacreatertype(Integer modedatacreatertype) {
        this.modedatacreatertype = modedatacreatertype;
    }
    public String getModedatacreatedate() {
        return modedatacreatedate;
    }
    public void setModedatacreatedate(String modedatacreatedate) {
        this.modedatacreatedate = modedatacreatedate;
    }
    public String getModedatacreatetime() {
        return modedatacreatetime;
    }
    public void setModedatacreatetime(String modedatacreatetime) {
        this.modedatacreatetime = modedatacreatetime;
    }
    public Integer getXssx() {
        return xssx;
    }
    public void setXssx(Integer xssx) {
        this.xssx = xssx;
    }
}
