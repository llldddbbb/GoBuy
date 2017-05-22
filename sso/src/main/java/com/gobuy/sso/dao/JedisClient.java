package com.gobuy.sso.dao;

/**
 * Created by ldb on 2017/5/13.
 */
public interface JedisClient {

    String get(String key);
    String set(String key, String value);
    String hget(String hkey, String key);
    long hset(String hkey, String key, String value);
    //自增
    long incr(String key);
    //设置过期时间
    long expire(String key, int second);
    //查询过期时间
    long ttl(String key);

    long del(String key);

    long hdel(String hkey, String key);

}
