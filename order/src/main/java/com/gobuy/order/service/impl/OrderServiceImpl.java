package com.gobuy.order.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.mapper.OrderItemMapper;
import com.gobuy.mapper.OrderMapper;
import com.gobuy.mapper.OrderShippingMapper;
import com.gobuy.order.dao.JedisClient;
import com.gobuy.order.service.OrderService;
import com.gobuy.pojo.Order;
import com.gobuy.pojo.OrderItem;
import com.gobuy.pojo.OrderShipping;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by ldb on 2017/5/24.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Autowired
    private OrderShippingMapper orderShippingMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${ORDER_GEN_KEY}")
    private String ORDER_GEN_KEY;

    @Value("${ORDER_INIT_ID}")
    private String ORDER_INIT_ID;

    @Value("${ORDER_DETAIL_GEN_KEY}")
    private String ORDER_DETAIL_GEN_KEY;

    @Override
    public GoBuyResult addOrder(Order order, List<OrderItem> orderItemList, OrderShipping shipping) {
        //获得订单号
        String s = jedisClient.get(ORDER_GEN_KEY);
        if(StringUtils.isBlank(s)){
            jedisClient.set(ORDER_GEN_KEY,ORDER_INIT_ID);
        }
        long orderId=jedisClient.incr(ORDER_GEN_KEY);
        //补全pojo
        order.setOrderId(orderId+"");
        order.setStatus(1);//1是未付款
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        order.setBuyerRate(0);//未评价;
        //添加order
        orderMapper.insert(order);
        //商品明细表
        for (OrderItem orderItem : orderItemList) {
            //订单明细id
            long orderDetailId=jedisClient.incr(ORDER_DETAIL_GEN_KEY);
            //补全订单明细
            orderItem.setId(orderDetailId+"");
            orderItem.setOrderId(orderId+"");
            //添加orderItem
            orderItemMapper.insert(orderItem);
        }
        //物流信息
        shipping.setOrderId(orderId+"");
        shipping.setCreated(new Date());
        shipping.setUpdated(new Date());
        orderShippingMapper.insert(shipping);
        return GoBuyResult.ok(orderId);
    }
}
