package com.gobuy.portal.service;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.portal.pojo.CartItem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ldb on 2017/5/23.
 */
public interface CartService {

    GoBuyResult addCartService(long itemId, int num, HttpServletRequest request, HttpServletResponse response);

    List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);

}
