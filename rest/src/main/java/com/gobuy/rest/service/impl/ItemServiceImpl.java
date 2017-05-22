package com.gobuy.rest.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.mapper.ItemDescMapper;
import com.gobuy.mapper.ItemMapper;
import com.gobuy.mapper.ItemParamItemMapper;
import com.gobuy.mapper.ItemParamMapper;
import com.gobuy.pojo.Item;
import com.gobuy.pojo.ItemDesc;
import com.gobuy.pojo.ItemParam;
import com.gobuy.pojo.ItemParamItem;
import com.gobuy.rest.dao.JedisClient;
import com.gobuy.rest.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ldb on 2017/5/21.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    
    @Autowired
    private ItemDescMapper itemDescMapper;

    @Autowired
    private ItemParamItemMapper itemParamItemMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_ITEM_KEY}")
    private String REDIS_ITEM_KEY;

    @Value("${REDIS_ITEM_EXPIRE}")
    private int REDIS_ITEM_EXPIRE;

    @Override
    public GoBuyResult getItemBaseInfo(long itemId) {
        //从缓存中读取商品信息
        try{
            String json = jedisClient.get(REDIS_ITEM_KEY + ":" + itemId + ":base");
            if(StringUtils.isNotBlank(json)){
                Item item=JsonUtils.jsonToPojo(json,Item.class);
                return  GoBuyResult.ok(item);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
        //根据商品Id查询商品信息
        Item item = itemMapper.selectByPrimaryKey(itemId);
        //写入redis缓存
        try{
            jedisClient.set(REDIS_ITEM_KEY+":"+itemId+":base", JsonUtils.objectToJson(item));
            //设置key的有效时间
            jedisClient.expire(REDIS_ITEM_KEY+":"+itemId+":base",REDIS_ITEM_EXPIRE);
        }catch(Exception e){
            e.printStackTrace();
        }
        //使用GoBuyResult包装
        return GoBuyResult.ok(item);
    }

    @Override
    public GoBuyResult getItemDesc(long itemId) {
        //从缓存中读取商品信息
        try{
            String json = jedisClient.get(REDIS_ITEM_KEY + ":" + itemId + ":desc");
            if(StringUtils.isNotBlank(json)){
                ItemDesc itemDesc=JsonUtils.jsonToPojo(json,ItemDesc.class);
                return  GoBuyResult.ok(itemDesc);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //根据商品Id查询商品信息
        ItemDesc itemDesc = itemDescMapper.selectByPrimaryKey(itemId);
        //写入redis缓存
        try{
            jedisClient.set(REDIS_ITEM_KEY+":"+itemId+":desc", JsonUtils.objectToJson(itemDesc));
            //设置key的有效时间
            jedisClient.expire(REDIS_ITEM_KEY+":"+itemId+":desc",REDIS_ITEM_EXPIRE);
        }catch(Exception e){
            e.printStackTrace();
        }
        //使用GoBuyResult包装
        return GoBuyResult.ok(itemDesc);
    }

    @Override
    public GoBuyResult getItemParam(long itemId) {
        //从缓存中读取商品信息
        try{
            String json = jedisClient.get(REDIS_ITEM_KEY + ":" + itemId + ":param");
            if(StringUtils.isNotBlank(json)){
                ItemParamItem itemParamItem=JsonUtils.jsonToPojo(json,ItemParamItem.class);
                return  GoBuyResult.ok(itemParamItem);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //根据商品Id查询商品信息
        ItemParamItem example=new ItemParamItem();
        example.setItem_id(itemId);
        List<ItemParamItem> list = itemParamItemMapper.select(example);
        if(list!=null&&list.size()>0){
            ItemParamItem itemParamItem=list.get(0);
            //写入redis缓存
            try{
                jedisClient.set(REDIS_ITEM_KEY+":"+itemId+":param", JsonUtils.objectToJson(itemParamItem));
                //设置key的有效时间
                jedisClient.expire(REDIS_ITEM_KEY+":"+itemId+":param",REDIS_ITEM_EXPIRE);
            }catch(Exception e){
                e.printStackTrace();
            }
            //使用GoBuyResult包装
            return GoBuyResult.ok(itemParamItem);
        }
        return  GoBuyResult.build(400,"无商品规格参数!");

    }


}
