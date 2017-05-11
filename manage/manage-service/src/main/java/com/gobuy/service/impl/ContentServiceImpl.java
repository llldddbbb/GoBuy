package com.gobuy.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.mapper.ContentMapper;
import com.gobuy.pojo.Content;
import com.gobuy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by ldb on 2017/5/11.
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public GoBuyResult insertContent(Content content) {
        content.setCreated(new Date());
        content.setUpdated(new Date());
        contentMapper.insert(content);
        return GoBuyResult.ok();
    }
}
