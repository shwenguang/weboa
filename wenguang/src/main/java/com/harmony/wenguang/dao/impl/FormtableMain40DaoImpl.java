package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.FormtableMain40Dao;
import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;
@Repository
public class FormtableMain40DaoImpl extends SqlSessionDaoSupport implements FormtableMain40Dao{

    @Override
    public List<FormtableMain40DO> selectAllData() {
        return this.getSqlSession().selectList("formtable_main_40.selectAllData");
    }

    @Override
    public List<FormtableMain40DO> selectByExample(FormtableMain40DO example) {
        return this.getSqlSession().selectList("formtable_main_40.selectByExample",example);
    }

}
