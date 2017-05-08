package com.gobuy.controller;

import com.gobuy.common.pojo.EUDateGridResult;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.Item;
import com.gobuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/8.
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody
    public GoBuyResult addItem(Item item,String desc){
        return itemService.addItem(item,desc);
    }

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EUDateGridResult listItem(int page,int rows){
        return itemService.getItemList(page,rows);
    }


}
