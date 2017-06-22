package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.WgTestDO;

public interface WgTestDao {
	public int insert(WgTestDO testDo);
	public List<WgTestDO> queryAll();
}
