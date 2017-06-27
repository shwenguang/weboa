package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgDocumentsDao;
import com.harmony.wenguang.dao.dataobject.WgDocumentsDO;

@Repository
public class WgDocumentsDaoImpl extends SqlSessionDaoSupport implements WgDocumentsDao{

	@Override
	public int insert(WgDocumentsDO wgDocumentsDO) {
		return this.getSqlSession().insert("wg_documents.insert",wgDocumentsDO);
	}

	@Override
	public List<WgDocumentsDO> selectByExample(WgDocumentsDO example) {
		return this.getSqlSession().selectList("wg_documents.selectByExample",example);
	}

}
