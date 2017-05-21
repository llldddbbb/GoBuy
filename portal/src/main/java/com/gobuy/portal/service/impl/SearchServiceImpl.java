package com.gobuy.portal.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.portal.pojo.SearchResult;
import com.gobuy.portal.service.SearchService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ldb on 2017/5/21.
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Value("${SEARCH_BASE_URL}")
    private String searchURL;

    @Override
    public SearchResult search(String q, int page) {
        //封装查询参数
        Map<String, String> param = new HashMap<>();
        param.put("q", q);
        param.put("page", page + "");
        try {
            String json = HttpClientUtil.doGet(searchURL, param);
            GoBuyResult goBuyResult = GoBuyResult.formatToPojo(json, SearchResult.class);
            if (goBuyResult.getStatus() == 200) {
                SearchResult result = (SearchResult) goBuyResult.getData();
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
