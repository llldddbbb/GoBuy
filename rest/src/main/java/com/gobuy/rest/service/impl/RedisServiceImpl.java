package com.gobuy.rest.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.ExceptionUtil;
import com.gobuy.rest.dao.JedisClient;
import com.gobuy.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ldb on 2017/5/13.
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private JedisClient jedisClient;

    @Value("${INDEX_CONTENT_REDIS_KEY}")
    private String INDEX_CONTENT_REDIS_KEY;

    @Override
    public GoBuyResult syncContent(long contentCid) {
        try{
           jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");

        }catch (Exception e){
            return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        return GoBuyResult.ok();
    }
}
