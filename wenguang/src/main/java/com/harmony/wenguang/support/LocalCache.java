package com.harmony.wenguang.support;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.Configuration;
import net.sf.ehcache.config.DiskStoreConfiguration;
import net.sf.ehcache.config.PersistenceConfiguration;
import net.sf.ehcache.distribution.RMICacheReplicatorFactory;
import net.sf.ehcache.store.MemoryStoreEvictionPolicy;


public class LocalCache {
    static Configuration conf = new Configuration()
        .diskStore(new DiskStoreConfiguration().path("java.io.tmpdir"))
        .cache(new CacheConfiguration("common_ehcache",1000)
                .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LRU)
                .timeToIdleSeconds(10)
                .timeToLiveSeconds(10)
                .diskExpiryThreadIntervalSeconds(10)
                .persistence(new PersistenceConfiguration().strategy(PersistenceConfiguration.Strategy.NONE))
                .maxEntriesLocalDisk(0)
                .cacheEventListenerFactory(new CacheConfiguration.CacheEventListenerFactoryConfiguration().className(RMICacheReplicatorFactory.class.getName()))
                )
         .cache(new CacheConfiguration("short_ehcache",1000)
                .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LRU)
                .timeToIdleSeconds(180)
                .timeToLiveSeconds(300)
                .diskExpiryThreadIntervalSeconds(180)
                .persistence(new PersistenceConfiguration().strategy(PersistenceConfiguration.Strategy.NONE))
                .maxEntriesLocalDisk(0)
                .cacheEventListenerFactory(new CacheConfiguration.CacheEventListenerFactoryConfiguration().className(RMICacheReplicatorFactory.class.getName()))
                )
        ;
    static CacheManager manager = CacheManager.create(conf);
    static Cache cache1 = manager.getCache("common_ehcache");//获得缓存
    static Cache cache2 = manager.getCache("short_ehcache");//获得缓存

    public static<T> void cache(String key,T value){
        Element element = new Element(key,value);
        cache1.put(element);
    }
    
    @SuppressWarnings("unchecked")
    public static<T> T get(String key){
        Element el = cache1.get(key);
        if(el != null){
            return (T)el.getObjectValue();
        }
        return null;
    }
    
    public static<T> void shortCache(String key,T value){
        Element element = new Element(key,value);
        cache1.put(element);
    }
    
    @SuppressWarnings("unchecked")
    public static<T> T getShortCache(String key){
        Element el = cache1.get(key);
        if(el != null){
            return (T)el.getObjectValue();
        }
        return null;
    }
}
