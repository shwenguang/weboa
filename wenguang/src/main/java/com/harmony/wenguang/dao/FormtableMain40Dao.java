package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.FormtableMain40DO;

public interface FormtableMain40Dao {
    
    public List<FormtableMain40DO> selectAllData();
    
    public List<FormtableMain40DO> selectByExample(FormtableMain40DO example);

}
