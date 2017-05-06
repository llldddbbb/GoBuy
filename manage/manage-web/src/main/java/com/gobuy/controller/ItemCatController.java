package com.gobuy.controller;

import com.gobuy.pojo.EUTreeNode;
import com.gobuy.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ldb on 2017/5/6.
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    //如果id为null是使用默认值，也就是parentid为0的分类列表
    public List categoryList(@RequestParam(value="id", defaultValue="0") Long parentId) throws Exception {
        //查询数据库
        List<EUTreeNode> list = itemCatService.getItemCatList(parentId);
        return list;
    }


}
