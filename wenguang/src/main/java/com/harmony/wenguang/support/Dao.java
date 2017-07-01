package com.harmony.wenguang.support;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.harmony.wenguang.dao.FormtableMainDao;
import com.harmony.wenguang.dao.WgDocumentsDao;

@Component
public class Dao implements InitializingBean{
	@Resource
	WgDocumentsDao wgDocumentsDao;
	@Resource
	FormtableMainDao formtableMainDao;
	public WgDocumentsDao getWgDocumentsDao() {
		return wgDocumentsDao;
	}

	public void setWgDocumentsDao(WgDocumentsDao wgDocumentsDao) {
		this.wgDocumentsDao = wgDocumentsDao;
	}
	
	public FormtableMainDao getFormtableMainDao() {
        return formtableMainDao;
    }

    public void setFormtableMainDao(FormtableMainDao formtableMainDao) {
        this.formtableMainDao = formtableMainDao;
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
