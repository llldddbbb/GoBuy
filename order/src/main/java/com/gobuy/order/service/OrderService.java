package com.gobuy.order.service;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.Order;
import com.gobuy.pojo.OrderItem;
import com.gobuy.pojo.OrderShipping;

import java.util.List;

/**
 * Created by ldb on 2017/5/24.
 */
public interface OrderService {

    GoBuyResult addOrder(Order order, List<OrderItem> orderItemList, OrderShipping shipping);
}
