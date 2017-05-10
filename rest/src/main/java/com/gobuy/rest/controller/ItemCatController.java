package com.gobuy.rest.controller;

import com.gobuy.common.util.JsonUtils;
import com.gobuy.rest.pojo.CatResult;
import com.gobuy.rest.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/10.
 */
@Controller
@RequestMapping("/rest")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping(value="/itemcat/all",produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    @ResponseBody
    public String getItemCatList(String callback){
        CatResult catResult = itemCatService.getItemCatList();
        String json= JsonUtils.objectToJson(catResult);
        //拼装返回值
        String result=callback+"("+json+");";
        return result;
    }
}
