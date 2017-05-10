package com.gobuy.rest.service.impl;

import com.gobuy.mapper.ItemCatMapper;
import com.gobuy.pojo.ItemCat;
import com.gobuy.rest.pojo.CatNode;
import com.gobuy.rest.pojo.CatResult;
import com.gobuy.rest.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldb on 2017/5/10.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public CatResult getItemCatList() {
        CatResult catResult=new CatResult();
        catResult.setData(getCatList(0));
        return catResult;
    }

    public List<?> getCatList(long parentId) {
        ItemCat example=new ItemCat();
        example.setParent_id(parentId);
        List<ItemCat> itemCatList = itemCatMapper.select(example);
        List resultList=new ArrayList<>();
        int count=0;
        for (ItemCat itemCat : itemCatList) {
            //判断是否为父节点
            if (itemCat.getIs_parent()) {
                CatNode catNode = new CatNode();
                if (parentId == 0) {
                    catNode.setName("<a href='/products/"+itemCat.getId()+".html'>"+itemCat.getName()+"</a>");
                } else {
                    catNode.setName(itemCat.getName());
                }
                catNode.setUrl("/products/"+itemCat.getId()+".html");
                //递归
                catNode.setItem(getCatList(itemCat.getId()));

                resultList.add(catNode);
                count++;
                if(count>14){
                    break;
                }
                //如果是叶子节点
            } else {
                resultList.add("/products/"+itemCat.getId()+".html|" + itemCat.getName());
            }
        }
        return resultList;
    }
}
