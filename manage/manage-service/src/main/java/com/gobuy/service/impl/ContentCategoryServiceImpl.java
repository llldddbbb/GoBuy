package com.gobuy.service.impl;

        import com.gobuy.common.pojo.EUTreeNode;
        import com.gobuy.mapper.ContentCategoryMapper;
        import com.gobuy.pojo.ContentCategory;
        import com.gobuy.service.ContentCategoryService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
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
}
