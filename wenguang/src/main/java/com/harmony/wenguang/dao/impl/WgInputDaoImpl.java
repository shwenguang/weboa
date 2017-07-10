package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgInputDao;
import com.harmony.wenguang.dao.dataobject.WgInputDO;
@Repository
public class WgInputDaoImpl extends SqlSessionDaoSupport implements WgInputDao {

	@Override
	public int insert(WgInputDO wgInputDO) {
		return this.getSqlSession().insert("wg_input.insert",wgInputDO);
	}
}
