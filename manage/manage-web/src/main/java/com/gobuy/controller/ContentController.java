package com.gobuy.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.Content;
import com.gobuy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/11.
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/save")
    @ResponseBody
    public GoBuyResult insertContent(Content content){
        return contentService.insertContent(content);
    }

}
