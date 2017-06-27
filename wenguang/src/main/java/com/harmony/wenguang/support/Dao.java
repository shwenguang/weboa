package com.harmony.wenguang.support;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.harmony.wenguang.dao.WgDocumentsDao;

@Component
public class Dao implements InitializingBean{
	@Resource
	WgDocumentsDao wgDocumentsDao;

	public WgDocumentsDao getWgDocumentsDao() {
		return wgDocumentsDao;
	}

	public void setWgDocumentsDao(WgDocumentsDao wgDocumentsDao) {
		this.wgDocumentsDao = wgDocumentsDao;
	}
	
	static Holder holder = new Holder();
    public static Dao inst(){
        return holder.inst;
    }
	@Override
    public void afterPropertiesSet() throws Exception {
        holder.inst = this;
    }
    public static class Holder{
        Dao inst = null;
    }
}
