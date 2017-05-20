package com.gobuy.search.service.impl;

import com.gobuy.search.dao.SearchDAO;
import com.gobuy.search.pojo.SearchResult;
import com.gobuy.search.service.SearchService;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldb on 2017/5/20.
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchDAO searchDAO;

    @Override
    public SearchResult search(String q, int page, int rows) throws Exception {
        SolrQuery query=new SolrQuery();
        //设置查询条件
        query.setQuery(q);
        //设置分页
        query.setStart((page-1)*rows);
        query.setRows(rows);
        //设置默认搜索域
        query.set("df","item_keywords");
        //设置高亮
        query.setHighlight(true);
        query.addHighlightField("item_title");
        query.setHighlightSimplePre("<em style='color:red'>");
        query.setHighlightSimplePost("</em>");
        //执行查询
        SearchResult searchResult = searchDAO.search(query);
        //计算查询结果总页数
        long recordCount=searchResult.getRecordCount();
        long pageCount=recordCount%rows==0?recordCount/rows:recordCount/rows+1;
        searchResult.setPageCount(pageCount);
        searchResult.setCurPage(page);
        return searchResult;
    }
}
