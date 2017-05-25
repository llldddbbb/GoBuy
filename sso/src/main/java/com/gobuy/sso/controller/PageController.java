package com.gobuy.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldb on 2017/5/22.
 */
@Controller
public class PageController {

    @RequestMapping("/user/showRegister")
    public String showRegister(){
        return "register";
    }

    @RequestMapping("/user/showLogin")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/page/login")
    public String showLogin(String redirect, Model model) {
        model.addAttribute("redirect", redirect);
        return "login";
    }


}
