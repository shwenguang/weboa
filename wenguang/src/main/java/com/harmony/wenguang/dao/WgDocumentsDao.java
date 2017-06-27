package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;

public interface WgDocumentsDao {
	public int insert(WgDocumentsDO wgDocumentsDO);
	
	public List<WgDocumentsDO> selectByExample(WgDocumentsDO example);
}
