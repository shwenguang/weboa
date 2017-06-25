package com.harmony.wenguang.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgBlobDataDao;
import com.harmony.wenguang.dao.dataobject.WgBlobDataDO;

@Repository
public class WgBlobDataDaoImpl extends SqlSessionDaoSupport implements WgBlobDataDao {

	@Override
	public int insert(WgBlobDataDO data) {
		return this.getSqlSession().insert("wg_blob_data.insert", data);
	}

	@Override
	public WgBlobDataDO getData(int id) {
		return this.getSqlSession().selectOne("wg_blob_data.getData", id);
	}

}
