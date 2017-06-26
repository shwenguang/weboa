package com.harmony.wenguang.dao;

import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

public interface FormtableMainDao {
	public int insert(FormtableMainDO dd);
	
	public FormtableMainDO getById(Long id);
}
