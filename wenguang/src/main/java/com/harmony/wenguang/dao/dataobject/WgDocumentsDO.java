package com.harmony.wenguang.dao.dataobject;

public class WgDocumentsDO {
	private int id;
	private String docName;
	private String docType;
	private byte[] docContent;
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
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public byte[] getDocContent() {
		return docContent;
	}
	public void setDocContent(byte[] docContent) {
		this.docContent = docContent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
