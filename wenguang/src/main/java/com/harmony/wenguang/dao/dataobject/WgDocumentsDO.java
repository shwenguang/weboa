package com.harmony.wenguang.dao.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WgDocumentsDO extends PageDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
	private String docName;
	private String docType;
	private String docContent;
	private String recordType;
	private Date createDate;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getRecordType() {
        return recordType;
    }
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
    public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocContent() {
		return docContent;
	}
	public void setDocContent(String docContent) {
		this.docContent = docContent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
	
}
