package com.gobuy.service;

import com.gobuy.pojo.EUTreeNode;

import java.util.List;

/**
 * Created by ldb on 2017/5/6.
 */
public interface ItemCatService {

    List<EUTreeNode> getItemCatList(Long parentId) throws Exception;
}
