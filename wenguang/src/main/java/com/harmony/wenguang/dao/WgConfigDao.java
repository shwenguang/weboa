package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.WgConfigDO;

public interface WgConfigDao {
    public int insert(WgConfigDO wgConfigDO);
    
    public List<WgConfigDO> selectByExample(WgConfigDO example);
    
    public int update(WgConfigDO wgConfigDO);
}
