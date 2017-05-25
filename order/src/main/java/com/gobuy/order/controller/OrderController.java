package com.gobuy.order.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.ExceptionUtil;
import com.gobuy.order.pojo.Order;
import com.gobuy.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/24.
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public GoBuyResult createOrder(@RequestBody  Order order){
        try{
            GoBuyResult result=orderService.addOrder(order,order.getOrderItems(),order.getOrderShipping());
            return  result;
        }catch (Exception e){
            e.printStackTrace();
            return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

}
