package com.gobuy.rest.service.impl;

import com.gobuy.common.util.JsonUtils;
import com.gobuy.mapper.ItemCatMapper;
import com.gobuy.pojo.Content;
import com.gobuy.pojo.ItemCat;
import com.gobuy.rest.dao.JedisClient;
import com.gobuy.rest.pojo.CatNode;
import com.gobuy.rest.pojo.CatResult;
import com.gobuy.rest.service.ItemCatService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Autowired
    private JedisClient jedisClient;

    @Value("${INDEX_ITEM_CAT_REDIS_KEY}")
    private String INDEX_ITEM_CAT_REDIS_KEY;

    @Override
    public CatResult getItemCatList() {
        //从缓存中读取数据
        try {
            String redisResult=jedisClient.hget(INDEX_ITEM_CAT_REDIS_KEY,INDEX_ITEM_CAT_REDIS_KEY);
            if(!StringUtils.isBlank(redisResult)){
                CatResult catResult= JsonUtils.jsonToPojo(redisResult,CatResult.class);
                return catResult;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        CatResult catResult=new CatResult();
        catResult.setData(getCatList(0));

        //向缓存中添加内容
        try {
            String str= JsonUtils.objectToJson(catResult);
            jedisClient.hset(INDEX_ITEM_CAT_REDIS_KEY,INDEX_ITEM_CAT_REDIS_KEY,str);
        }catch (Exception e){
            e.printStackTrace();
        }

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
                if(count>=14){
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
