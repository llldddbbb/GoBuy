package com.gobuy.controller;

import com.gobuy.common.pojo.EUDateGridResult;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.ItemParam;
import com.gobuy.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ldb on 2017/5/9.
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("/query/itemcatid/{cid}")
    @ResponseBody
    public GoBuyResult getItemParamByCId(@PathVariable long cid){
        return itemParamService.getItemParamByCId(cid);
    }

    @RequestMapping("/save/{cid}")
    @ResponseBody
    public GoBuyResult insertItemParam(@PathVariable long cid,String paramData){
        ItemParam itemParam=new ItemParam();
        itemParam.setItem_cat_id(cid);
        itemParam.setParam_data(paramData);
        return  itemParamService.insertItemParam(itemParam);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDateGridResult getItemParamList(int page,int rows){
        return itemParamService.getItemParamList(page,rows);
    }



}
