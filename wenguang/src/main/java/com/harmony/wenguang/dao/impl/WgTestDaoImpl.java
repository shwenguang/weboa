package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgTestDao;
import com.harmony.wenguang.dao.dataobject.WgTestDO;

@Repository
public class WgTestDaoImpl extends SqlSessionDaoSupport implements WgTestDao{
	@Override
	public int insert(WgTestDO testDo) {
		this.getSqlSession().insert("wg_test.insert",testDo);
		return 0;
	}

	@Override
	public List<WgTestDO> queryAll() {
		List<WgTestDO> list = this.getSqlSession().selectList("wg_test.selectAll");
		return list;
	}

}
