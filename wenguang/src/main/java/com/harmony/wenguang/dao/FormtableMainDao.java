package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;

public interface FormtableMainDao {
	public int insert(FormtableMain2DO dd);
	
	public List<FormtableMain2DO> selectByExample(FormtableMain2DO example);
	
	public List<FormtableMain2DO> selectSimpleByExample(FormtableMain2DO example);
	/**
	 * 根据一级目录查找或者查找全部，然后根据时间排序找到的结果
	 * @param example
	 * @return
	 */
	public List<FormtableMain2DO> selectByExampleOrderedByTime(FormtableMain2DO example);
	/**
	 * 根据参数查找数据，然后根据时间排序找到的结果
	 * @param example
	 * @return
	 */
	public List<FormtableMain2DO> selectByParaOrderedByTime(FormtableMain2DO example);
	
	public Integer countByExample(FormtableMain2DO example);
}
