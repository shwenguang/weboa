package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgConfigDao;
import com.harmony.wenguang.dao.dataobject.WgConfigDO;

@Repository
public class WgConfigDaoImpl extends SqlSessionDaoSupport implements WgConfigDao {
    @Override
    public int insert(WgConfigDO wgConfigDO) {
        return this.getSqlSession().insert("wg_config.insert", wgConfigDO);
    }

    @Override
    public List<WgConfigDO> selectByExample(WgConfigDO example) {
        return this.getSqlSession().selectList("wg_config.selectByExample",example);
    }

    @Override
    public int update(WgConfigDO wgConfigDO) {
        return 0;
    }

}
