package com.gobuy.service.impl;

import com.gobuy.common.pojo.EUTreeNode;
import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.mapper.ContentCategoryMapper;
import com.gobuy.pojo.ContentCategory;
import com.gobuy.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ldb on 2017/5/11.
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

    @Autowired
    private ContentCategoryMapper contentCategoryMapper;

    @Override
    public List<EUTreeNode> getContentCategoryList(long parentId) {
        List<EUTreeNode> resultList=new ArrayList<>();
        ContentCategory example=new ContentCategory();
        example.setParent_id(parentId);
        List<ContentCategory> contentCategoryList = contentCategoryMapper.select(example);
        for (ContentCategory contentCategory : contentCategoryList) {
            EUTreeNode euTreeNode=new EUTreeNode();
            euTreeNode.setText(contentCategory.getName());
            euTreeNode.setId(contentCategory.getId());
            euTreeNode.setState(contentCategory.getIs_parent()?"closed":"open");
            resultList.add(euTreeNode);
        }
        return resultList;
    }

    @Override
    public GoBuyResult insertContentCategory(long parentId, String name) {
        ContentCategory contentCategory=new ContentCategory();
        contentCategory.setParent_id(parentId);
        contentCategory.setName(name);
        contentCategory.setIs_parent(false);
        //状态1为正常，状态2为删除
        contentCategory.setStatus(1);
        contentCategory.setSort_order(1);
        contentCategory.setCreated(new Date());
        contentCategory.setUpdated(new Date());
        contentCategoryMapper.insert(contentCategory);
        //查看父节点的is_parent是否为true，如果是false则修改为ture
        ContentCategory parentCat=contentCategoryMapper.selectByPrimaryKey(parentId);
        if(!parentCat.getIs_parent()){
            parentCat.setIs_parent(true);
            contentCategoryMapper.updateByPrimaryKey(parentCat);
        }
        return GoBuyResult.ok(contentCategory);
    }


}
