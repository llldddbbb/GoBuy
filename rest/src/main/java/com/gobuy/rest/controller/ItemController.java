package com.gobuy.rest.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/21.
 */
@Controller
@RequestMapping("/rest/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/info/{itemId}")
    @ResponseBody
    public GoBuyResult getItemBaseInfo(@PathVariable long itemId){
        return itemService.getItemBaseInfo(itemId);
    }

    @RequestMapping("/desc/{itemId}")
    @ResponseBody
    public GoBuyResult getItemDesc(@PathVariable long itemId){
        return itemService.getItemDesc(itemId);
    }

    @RequestMapping("/param/{itemId}")
    @ResponseBody
    public GoBuyResult getItemParam(@PathVariable long itemId){
        return itemService.getItemParam(itemId);
    }

}
