package com.gobuy.service;

import com.gobuy.common.pojo.EUDateGridResult;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.Item;

;

/**
 * Created by ldb on 2017/5/8.
 */
public interface ItemService {

    GoBuyResult addItem(Item item,String desc,String itemParams);

    EUDateGridResult getItemList(int page,int rows);
}
