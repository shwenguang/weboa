package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.WgInputDO;

public interface WgInputDao {
    public int insert(WgInputDO wgInputDO);
    
    public List<WgInputDO> selectByExample(WgInputDO wgInputDO);
    
    public int update(WgInputDO wgInputDO);

}
