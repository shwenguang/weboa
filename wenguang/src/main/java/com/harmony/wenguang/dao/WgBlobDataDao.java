package com.harmony.wenguang.dao;

import com.harmony.wenguang.dao.dataobject.WgBlobDataDO;

public interface WgBlobDataDao {
	public int insert(WgBlobDataDO data);
	public WgBlobDataDO getData(int id);
}
