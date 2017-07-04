package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.dataobject.FormtableMainDO;

@Repository
public class FormtableMainDaoImpl extends SqlSessionDaoSupport implements FormtableMainDao{

	@Override
	public int insert(FormtableMainDO dd) {
		return this.getSqlSession().insert("formtable_main.insert",dd);
	}

	@Override
	public List<FormtableMainDO> selectByExample(FormtableMainDO example) {
		return this.getSqlSession().selectList("formtable_main.selectByExample",example);
	}
	
	public List<FormtableMainDO> selectSimpleByExample(FormtableMainDO example){
	    return this.getSqlSession().selectList("formtable_main.selectSimpleByExample",example);
	}

}
