package com.gobuy.service.impl;

import com.gobuy.mapper.ItemCatMapper;
import com.gobuy.common.pojo.EUTreeNode;
import com.gobuy.pojo.ItemCat;
import com.gobuy.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by ldb on 2017/5/6.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<EUTreeNode> getItemCatList(Long parentId) throws Exception {
        List<EUTreeNode> resultList=new ArrayList<>();

        ItemCat example=new ItemCat();
        //根据parentid查询子节点
        example.setParent_id(parentId);
        //返回子节点列表
        List<ItemCat> list = itemCatMapper.select(example);

        for (ItemCat itemCat : list) {
            EUTreeNode node=new EUTreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            //如果是父节点的话就设置成关闭状态，如果是叶子节点就是open状态
            node.setState(itemCat.getIs_parent()?"closed":"open");
            resultList.add(node);
        }
        return resultList;
    }
}
