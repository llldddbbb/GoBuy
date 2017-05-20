package com.gobuy.search.service;

import com.gobuy.search.pojo.SearchResult;

/**
 * Created by ldb on 2017/5/20.
 */
public interface SearchService {

    SearchResult search(String q,int page,int rows) throws Exception;
}
