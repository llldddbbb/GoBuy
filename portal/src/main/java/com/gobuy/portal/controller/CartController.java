package com.gobuy.portal.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.portal.pojo.CartItem;
import com.gobuy.portal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ldb on 2017/5/23.
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/add/{itemId}")
    @ResponseBody
    public GoBuyResult addCartItem(@PathVariable long itemId, @RequestParam(defaultValue = "1") Integer num, HttpServletResponse response, HttpServletRequest request){
        return cartService.addCartService(itemId,num,request,response);
    }

    @RequestMapping("/cart")
    public String showCart(HttpServletRequest request, HttpServletResponse response, Model model){
        List<CartItem> cartItemList = cartService.getCartItemList(request, response);
        model.addAttribute("cartList",cartItemList);
        return "cart";
    }

}
