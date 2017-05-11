package com.gobuy.portal.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.pojo.Content;
import com.gobuy.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ldb on 2017/5/12.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;

    @Value("${REST_INDEX_AD_URL}")
    private String REST_INDEX_AD_URL;

    @Override
    public String getContentList() {
        String result=HttpClientUtil.doGet(REST_BASE_URL+REST_INDEX_AD_URL);
        //把字符串转换成GoBuyResult
        GoBuyResult goBuyResult = GoBuyResult.formatToList(result, Content.class);
        List<Content> contentList= (List<Content>) goBuyResult.getData();
        List<Map> resultList = new ArrayList<>();
        //创建一个jsp页码要求的pojo列表
        for (Content content : contentList) {
            Map map = new HashMap<>();
            map.put("src", content.getPic());
            map.put("height", 240);
            map.put("width", 670);
            map.put("srcB", content.getPic2());
            map.put("widthB", 550);
            map.put("heightB", 240);
            map.put("href", content.getUrl());
            map.put("alt", content.getSub_title());
            resultList.add(map);
        }
        return JsonUtils.objectToJson(resultList);
    }
}
