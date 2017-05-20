package com.gobuy.search.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.ExceptionUtil;
import com.gobuy.search.mapper.ItemSearchMapper;
import com.gobuy.search.pojo.Item;
import com.gobuy.search.service.ItemService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ldb on 2017/5/19.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemSearchMapper itemSearchMapper;

    @Autowired
    private SolrServer solrServer;

    @Override
    public GoBuyResult importAllItem(){
        List<Item> itemList = itemSearchMapper.getItemList();
        //把商品信息写入索引库
        for (Item item : itemList) {
            SolrInputDocument document=new SolrInputDocument();
            document.setField("id", item.getId());
            document.setField("item_title", item.getTitle());
            document.setField("item_sell_point", item.getSell_point());
            document.setField("item_price", item.getPrice());
            document.setField("item_image", item.getImage());
            document.setField("item_category_name", item.getCategory_name());
            document.setField("item_desc", item.getItem_des());
            //写入索引库
            try {
                solrServer.add(document);
            } catch (Exception e) {
                return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
            }

        }
        return GoBuyResult.ok();
    }
}
