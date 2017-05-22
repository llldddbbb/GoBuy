package com.gobuy.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldb on 2017/5/22.
 */
@Controller
@RequestMapping("/user")
public class PageController {

    @RequestMapping("showRegister")
    public String showRegister(){
        return "register";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }
}
