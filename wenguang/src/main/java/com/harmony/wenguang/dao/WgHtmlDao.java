package com.harmony.wenguang.dao;

import java.util.List;

import com.harmony.wenguang.dao.dataobject.WgHtmlDO;

public interface WgHtmlDao {
	public int insert(WgHtmlDO wgHtmlDO);
	
	public List<WgHtmlDO> getHtmlByPath(String path);
}
