package com.gobuy.portal.service;

import com.gobuy.portal.pojo.SearchResult;

/**
 * Created by ldb on 2017/5/21.
 */
public interface SearchService {

    SearchResult search(String q,int page);

}
