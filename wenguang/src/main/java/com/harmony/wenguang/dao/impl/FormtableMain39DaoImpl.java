package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.FormtableMain39Dao;
import com.harmony.wenguang.dao.dataobject.FormtableMain39DO;
@Repository
public class FormtableMain39DaoImpl extends SqlSessionDaoSupport implements FormtableMain39Dao{
    @Override
    public List<FormtableMain39DO> selectAllData() {
        return this.getSqlSession().selectList("formtable_main_39.selectAllData");
    }

    @Override
    public List<FormtableMain39DO> selectByExample(FormtableMain39DO example) {
        return this.getSqlSession().selectList("formtable_main_39.selectByExample",example);
    }

}
