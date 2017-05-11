package com.gobuy.rest.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.Content;
import com.gobuy.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ldb on 2017/5/12.
 */
@Controller
@RequestMapping("/rest/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/list/{contentCategoryId}")
    @ResponseBody
    public GoBuyResult getContentList(@PathVariable Long contentCategoryId) {
        List<Content> list = contentService.getContentList(contentCategoryId);
        return GoBuyResult.ok(list);
    }

}
