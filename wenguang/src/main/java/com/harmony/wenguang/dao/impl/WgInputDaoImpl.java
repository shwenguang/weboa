package com.harmony.wenguang.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgInputDao;
import com.harmony.wenguang.dao.dataobject.WgInputDO;
@Repository
public class WgInputDaoImpl extends SqlSessionDaoSupport implements WgInputDao {

	@Override
	public int insert(WgInputDO wgInputDO) {
		// TODO Auto-generated method stub
		return 0;
	}
}
