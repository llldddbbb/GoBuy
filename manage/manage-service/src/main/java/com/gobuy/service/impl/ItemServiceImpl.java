package com.gobuy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gobuy.common.pojo.EUDateGridResult;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.IDUtils;
import com.gobuy.mapper.ItemDescMapper;
import com.gobuy.mapper.ItemMapper;
import com.gobuy.pojo.Item;
import com.gobuy.pojo.ItemDesc;
import com.gobuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by ldb on 2017/5/8.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemDescMapper itemDescMapper;

    @Override
    public GoBuyResult addItem(Item item,String desc) {
        Long itemId= IDUtils.genItemId();
        item.setId(itemId);
        //商品状态 1:上架 2:下架 3:删除
        item.setStatus((byte)1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        int itemResultNum = itemMapper.insert(item);
        int itemDescResultNum=addItemDesc(itemDescMapper,item.getId(),desc);
        if(itemResultNum>0&&itemDescResultNum>0){
            return GoBuyResult.ok();
        }else{
            return GoBuyResult.build(500,"添加失败!");
        }
    }

    private int addItemDesc(ItemDescMapper itemDescMapper, Long id, String desc) {
        ItemDesc itemDesc=new ItemDesc();
        itemDesc.setItem_id(id);
        itemDesc.setItem_desc(desc);
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        int resultNum = itemDescMapper.insert(itemDesc);
        return resultNum;
    }

    @Override
    public EUDateGridResult getItemList(int page, int rows) {
        EUDateGridResult result=new EUDateGridResult();
        //设置分页
        PageHelper.startPage(page,rows);
        List<Item> itemList = itemMapper.selectAll();
        //获取总记录数
        PageInfo<Item> pageInfo=new PageInfo<>(itemList);

        result.setTotal(pageInfo.getTotal());
        result.setRows(itemList);
        return result;
    }
}
