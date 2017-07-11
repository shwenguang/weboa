package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;

public interface FormtableMainDao {
	public int insert(FormtableMain2DO dd);
	
	public List<FormtableMain2DO> selectByExample(FormtableMain2DO example);
	
	public List<FormtableMain2DO> selectSimpleByExample(FormtableMain2DO example);
}
