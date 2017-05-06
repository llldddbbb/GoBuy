package com.gobuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldb on 2017/5/6.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";

    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
