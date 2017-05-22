package com.gobuy.rest.service;

import com.gobuy.common.pojo.GoBuyResult;

/**
 * Created by ldb on 2017/5/21.
 */
public interface ItemService {

    GoBuyResult getItemBaseInfo(long itemId);

    GoBuyResult getItemDesc(long itemId);

    GoBuyResult getItemParam(long itemId);
}
