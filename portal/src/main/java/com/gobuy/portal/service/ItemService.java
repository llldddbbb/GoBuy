package com.gobuy.portal.service;

import com.gobuy.portal.pojo.ItemInfo;

/**
 * Created by ldb on 2017/5/21.
 */
public interface ItemService {

    ItemInfo getItemById(long itemId);

    String getItemDescById(long itemId);

    String getItemParamById(long itemId);
}
