package com.gobuy.sso.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ldb on 2017/5/13.
 */
public class JedisClientCluster implements JedisClient {

    @Autowired
    private JedisClient jedisClient;


    @Override
    public String get(String key) {
        return jedisClient.get(key);
    }

    @Override
    public String set(String key, String value) {
        return jedisClient.set(key,value);
    }

    @Override
    public String hget(String hkey, String key) {
        return jedisClient.hget(hkey,key);
    }

    @Override
    public long hset(String hkey, String key, String value) {
        return jedisClient.hset(hkey,key,value);
    }

    @Override
    public long incr(String key) {
        return jedisClient.incr(key);
    }

    @Override
    public long expire(String key, int second) {
        return jedisClient.expire(key,second);
    }

    @Override
    public long ttl(String key) {
        return jedisClient.ttl(key);
    }

    @Override
    public long del(String key) {
        return jedisClient.del(key);
    }

    @Override
    public long hdel(String hkey, String key) {
        return jedisClient.hdel(hkey,key);
    }
}
