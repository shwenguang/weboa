package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.TestDao;
import com.harmony.wenguang.dao.dataobject.TestDO;

@Repository
public class TestDaoImpl extends SqlSessionDaoSupport implements TestDao{
	@Override
	public int create() {
		this.getSqlSession().update("createtable");
		return 0;
	}

	@Override
	public int insert(TestDO testDo) {
		this.getSqlSession().insert("insert",testDo);
		return 0;
	}

	@Override
	public List<TestDO> queryAll() {
		List<TestDO> list = this.getSqlSession().selectList("selectAll");
		return list;
	}

}
