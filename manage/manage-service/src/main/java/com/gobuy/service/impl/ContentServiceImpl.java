package com.gobuy.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.mapper.ContentMapper;
import com.gobuy.pojo.Content;
import com.gobuy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by ldb on 2017/5/11.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;

    @Value("${REST_CONTENT_SYNC_URL}")
    private String REST_CONTENT_SYNC_URL;



    @Override
    public GoBuyResult insertContent(Content content) {
        content.setCreated(new Date());
        content.setUpdated(new Date());
        contentMapper.insert(content);

        //添加缓存同步逻辑
        try{
            HttpClientUtil.doGet(REST_BASE_URL+REST_CONTENT_SYNC_URL+"/"+content.getCategory_id());
        }catch (Exception e){
            e.printStackTrace();
        }

        return GoBuyResult.ok();
    }
}
