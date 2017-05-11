package com.gobuy.service;

import com.gobuy.common.pojo.EUTreeNode;

import java.util.List;

/**
 * Created by ldb on 2017/5/11.
 */
public interface ContentCategoryService {

    List<EUTreeNode> getContentCategoryList(long parentId);
}
