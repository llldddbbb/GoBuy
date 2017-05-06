package com.gobuy.service.impl;

import com.gobuy.mapper.TbItemCatMapper;
import com.gobuy.pojo.TbItemCat;
import com.gobuy.pojo.TbItemCatExample;
import com.gobuy.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ldb on 2017/5/6.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<TbItemCat> getItemCatList(Long parentId) throws Exception {

        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        //根据parentid查询子节点
        criteria.andParent_idEqualTo(parentId);
        //返回子节点列表
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        return list;
    }
}
