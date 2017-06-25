package com.harmony.wenguang.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.harmony.wenguang.dao.WgHtmlDao;
import com.harmony.wenguang.dao.dataobject.WgHtmlDO;

@Repository
public class WgHtmlDaoImpl extends SqlSessionDaoSupport implements WgHtmlDao{

	@Override
	public int insert(WgHtmlDO wgHtmlDO) {
		return this.getSqlSession().insert("wg_html.insert", wgHtmlDO);
	}

	@Override
	public List<WgHtmlDO> getHtmlByPath(String path) {
		return this.getSqlSession().selectList("wg_html.getHtmlByPath", path);
	}

}
