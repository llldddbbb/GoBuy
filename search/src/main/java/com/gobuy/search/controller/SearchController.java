package com.gobuy.search.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.ExceptionUtil;
import com.gobuy.search.pojo.SearchResult;
import com.gobuy.search.service.SearchService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/20.
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @ResponseBody
    public GoBuyResult search(String q, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "60") int rows){
        if(StringUtils.isBlank(q)){
            return GoBuyResult.build(400,"查询条件不能为空!");
        }
        SearchResult searchResult;
        try {
            //处理乱码
            q=new String(q.getBytes("ISO-8859-1"),"utf-8");
            searchResult = searchService.search(q, page, rows);
        } catch (Exception e) {
            e.printStackTrace();
            return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        return GoBuyResult.ok(searchResult);
    }

}
