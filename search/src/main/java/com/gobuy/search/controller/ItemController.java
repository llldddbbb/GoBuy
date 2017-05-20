package com.gobuy.search.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.search.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/19.
 */
@Controller
@RequestMapping("/manage")
public class ItemController {

    @Autowired
    private ItemService itemService;


    /**
     * 导入商品数据到索引库
     */
    @RequestMapping("/importAll")
    @ResponseBody
    public GoBuyResult importAllItem(){
        GoBuyResult goBuyResult = itemService.importAllItem();
        return goBuyResult;
    }

}
