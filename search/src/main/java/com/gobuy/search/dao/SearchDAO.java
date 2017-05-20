package com.gobuy.search.dao;

import com.gobuy.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by ldb on 2017/5/20.
 */
public interface SearchDAO {

    SearchResult search(SolrQuery query) throws Exception;

}
