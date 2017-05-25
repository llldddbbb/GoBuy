package com.gobuy.portal.controller;

import com.gobuy.portal.pojo.Order;
import com.gobuy.portal.pojo.CartItem;
import com.gobuy.portal.service.CartService;
import com.gobuy.portal.service.OrderService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ldb on 2017/5/25.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;


    @RequestMapping("/order-cart")
    public String showOrderCart(HttpServletRequest request, HttpServletResponse response, Model model){
        //取购物车商品列表
        List<CartItem> list = cartService.getCartItemList(request, response);
        //传递给页面
        model.addAttribute("cartList", list);
        return "order-cart";
    }

    @RequestMapping("/create")
    public String createOrder(Order order, Model model, HttpServletRequest request) {
        try {
            //调用服务
            String orderId = orderService.createOrder(order);
            model.addAttribute("orderId", orderId);
            model.addAttribute("payment", order.getPayment());
            model.addAttribute("date", new DateTime().plusDays(3).toString("yyyy-MM-dd"));
            return "success";

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "创建订单出错。请稍后重试！");
            return "error/exception";
        }
    }

}
