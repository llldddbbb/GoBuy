package com.gobuy.rest.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

/**
 * Created by ldb on 2017/5/13.
 */
public class JedisTest {

    /**
     * 单机版测试
     */
    @Test
    public void testJedisSingle(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-jedis.xml");
        JedisPool pool=(JedisPool)applicationContext.getBean("redisClient");
        Jedis jedis = pool.getResource();
        String s = jedis.get("jedis");
        System.out.println(s);
        jedis.close();
        pool.close();
    }

    /**
     * 集群版测试
     */
    @Test
    public void testJedisCluster(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-jedis.xml");
        JedisCluster jedisCluster= (JedisCluster) applicationContext.getBean("redisCluster");
        jedisCluster.set("jedisCluster","hellowCluster");
        String str = jedisCluster.get("jedisCluster");
        System.out.println(str);
        jedisCluster.close();
    }


}
