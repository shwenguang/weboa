package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

public interface FormtableMainDao {
	public int insert(FormtableMainDO dd);
	
	public List<FormtableMainDO> selectByExample(FormtableMainDO example);
	
	public List<FormtableMainDO> selectSimpleByExample(FormtableMainDO example);
}
