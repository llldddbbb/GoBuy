package com.gobuy.search.dao.impl;

import com.gobuy.search.dao.SearchDAO;
import com.gobuy.search.pojo.Item;
import com.gobuy.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ldb on 2017/5/20.
 */
@Repository
public class SearchDAOImpl implements SearchDAO{

    @Autowired
    private SolrServer solrServer;

    @Override
    public SearchResult search(SolrQuery query) throws Exception {
        SearchResult result=new SearchResult();
        //从索引库查询
        QueryResponse response = solrServer.query(query);
        SolrDocumentList documents = response.getResults();
        //封装查询数
        result.setRecordCount(documents.getNumFound());
        //商品列表
        List<Item> itemList = new ArrayList<>();
        //取高亮显示
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

        for (SolrDocument document : documents) {
            //创建一商品对象
            Item item = new Item();
            item.setId((String) document.get("id"));
            //取高亮显示的结果
            List<String> list = highlighting.get(document.get("id")).get("item_title");
            String title = "";
            if (list != null && list.size()>0) {
                title = list.get(0);
            } else {
                title = (String) document.get("item_title");
            }
            item.setTitle(title);
            item.setImage((String) document.get("item_image"));
            item.setPrice((long) document.get("item_price"));
            item.setSell_point((String) document.get("item_sell_point"));
            item.setCategory_name((String) document.get("item_category_name"));
            //添加的商品列表
            itemList.add(item);
        }
        result.setItemList(itemList);
        return result;

    }
}
