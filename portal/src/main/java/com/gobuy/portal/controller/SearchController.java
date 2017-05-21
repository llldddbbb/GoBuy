package com.gobuy.portal.controller;

import com.gobuy.portal.pojo.SearchResult;
import com.gobuy.portal.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;

/**
 * Created by ldb on 2017/5/21.
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    private String search(String q, @RequestParam(defaultValue = "1") int page, Model model){
        //解决乱码
        if (q != null) {
            try {
                q = new String(q.getBytes("iso8859-1"), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        SearchResult result = searchService.search(q, page);

        model.addAttribute("query",q);
        model.addAttribute("itemList",result.getItemList());
        model.addAttribute("page",page);
        model.addAttribute("totalPages",result.getPageCount());
        return "search";
    }

}
