package com.gobuy.service;

import com.gobuy.common.pojo.EUDateGridResult;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.ItemParam;

/**
 * Created by ldb on 2017/5/9.
 */
public interface ItemParamService {

    GoBuyResult getItemParamByCId(long cid);

    GoBuyResult insertItemParam(ItemParam itemParam);

    EUDateGridResult getItemParamList(int page,int rows);
}
