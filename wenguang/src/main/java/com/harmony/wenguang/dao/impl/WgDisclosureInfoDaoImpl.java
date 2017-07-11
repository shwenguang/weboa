package com.harmony.wenguang.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgDisclosureInfoDao;
import com.harmony.wenguang.dao.dataobject.WgDisclosureInfoDO;
@Repository
public class WgDisclosureInfoDaoImpl extends SqlSessionDaoSupport implements WgDisclosureInfoDao {

	@Override
	public int insert(WgDisclosureInfoDO wgInputDO) {
		return this.getSqlSession().insert("wg_input.insert",wgInputDO);
	}
}
