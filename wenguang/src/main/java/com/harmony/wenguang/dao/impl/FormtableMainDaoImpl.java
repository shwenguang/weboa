package com.harmony.wenguang.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

@Repository
public class FormtableMainDaoImpl extends SqlSessionDaoSupport implements FormtableMainDao{

	@Override
	public int insert(FormtableMainDO dd) {
		return this.getSqlSession().insert("formtable_main.insert",dd);
	}

	@Override
	public FormtableMainDO getById(Long id) {
		return this.getSqlSession().selectOne("formtable_main.getById",id);
	}

}
