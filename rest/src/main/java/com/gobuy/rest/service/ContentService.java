package com.gobuy.rest.service;

import com.gobuy.pojo.Content;

import java.util.List;

/**
 * Created by ldb on 2017/5/12.
 */
public interface ContentService {

   List<Content> getContentList(long contentCid);
}
