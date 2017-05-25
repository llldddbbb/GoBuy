package com.gobuy.order.pojo;

import com.gobuy.pojo.OrderItem;
import com.gobuy.pojo.OrderShipping;

import java.util.List;

/**
 * Created by ldb on 2017/5/24.
 */
public class Order extends com.gobuy.pojo.Order{
    private List<OrderItem> orderItems;
    private OrderShipping orderShipping;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public OrderShipping getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(OrderShipping orderShipping) {
        this.orderShipping = orderShipping;
    }
}
