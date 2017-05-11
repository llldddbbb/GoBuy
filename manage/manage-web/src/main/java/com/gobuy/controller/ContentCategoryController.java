package com.gobuy.controller;

import com.gobuy.common.pojo.EUTreeNode;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ldb on 2017/5/11.
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    @Autowired
    private ContentCategoryService contentCateGoryService;

    @RequestMapping("/list")
    @ResponseBody
    private String getContentCategoryList(@RequestParam(value = "id",defaultValue = "0") long parentId){
        List<EUTreeNode> contentCategoryList = contentCateGoryService.getContentCategoryList(parentId);
        return JsonUtils.objectToJson(contentCategoryList);
    }

}
