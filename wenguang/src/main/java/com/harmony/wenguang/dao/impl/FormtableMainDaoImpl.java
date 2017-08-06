package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMain2DO;

@Repository
public class FormtableMainDaoImpl extends SqlSessionDaoSupport implements FormtableMainDao{

	@Override
	public int insert(FormtableMain2DO dd) {
		return this.getSqlSession().insert("formtable_main.insert",dd);
	}

	@Override
	public List<FormtableMain2DO> selectByExample(FormtableMain2DO example) {
		return this.getSqlSession().selectList("formtable_main.selectByExample",example);
	}
	
	public List<FormtableMain2DO> selectSimpleByExample(FormtableMain2DO example){
	    return this.getSqlSession().selectList("formtable_main.selectSimpleByExample",example);
	}
	
	public List<FormtableMain2DO> selectByExampleOrderedByTime(FormtableMain2DO example){
		return this.getSqlSession().selectList("formtable_main.selectByExampleOrderedByTime",example);
	}
	
	public List<FormtableMain2DO> selectByParaOrderedByTime(FormtableMain2DO example)
	{
		return this.getSqlSession().selectList("formtable_main.selectByParaOrderedByTime",example);
	}

}
