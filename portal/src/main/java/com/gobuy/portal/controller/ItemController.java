package com.gobuy.portal.controller;

import com.gobuy.portal.pojo.ItemInfo;
import com.gobuy.portal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/21.
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    public String getItem(@PathVariable long itemId,Model model){
        ItemInfo itemInfo = itemService.getItemById(itemId);
        model.addAttribute("item",itemInfo);
        return "item";
    }

    @RequestMapping(value="/item/desc/{itemId}",produces = MediaType.TEXT_HTML_VALUE+";charset=utf-8")
    @ResponseBody
    public String getItemDesc(@PathVariable long itemId){
        return  itemService.getItemDescById(itemId);
    }

    @RequestMapping(value="/item/param/{itemId}",produces = MediaType.TEXT_HTML_VALUE+";charset=utf-8")
    @ResponseBody
    public String getItemParam(@PathVariable long itemId){
        return  itemService.getItemParamById(itemId);
    }

}
