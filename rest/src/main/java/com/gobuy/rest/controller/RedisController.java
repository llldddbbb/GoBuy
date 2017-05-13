package com.gobuy.rest.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/13.
 */
@Controller
@RequestMapping("/rest/cache/sync")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/content/{contentCid}")
    @ResponseBody
    public GoBuyResult contentCacheSync(@PathVariable Long contentCid){
        return redisService.syncContent(contentCid);
    }

}
