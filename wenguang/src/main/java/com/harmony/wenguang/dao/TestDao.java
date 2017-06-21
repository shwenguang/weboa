package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.TestDO;

public interface TestDao {
	public int create();
	public int insert(TestDO testDo);
	public List<TestDO> queryAll();
}
