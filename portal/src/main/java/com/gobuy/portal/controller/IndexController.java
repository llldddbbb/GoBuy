package com.gobuy.portal.controller;

import com.gobuy.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ldb on 2017/5/10.
 */
@Controller
public class IndexController {
    
    @Autowired
    private ContentService contentService;

    @RequestMapping("/index")
    public String showIndex(Model model){
        String contentList = contentService.getContentList();
        model.addAttribute("ad1",contentList);
        return "index";
    }

}
