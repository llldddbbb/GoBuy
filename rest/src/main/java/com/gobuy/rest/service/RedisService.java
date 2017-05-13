package com.gobuy.rest.service;

import com.gobuy.common.pojo.GoBuyResult;

/**
 * Created by ldb on 2017/5/13.
 */
public interface RedisService {

    GoBuyResult syncContent(long contentCid);
}
