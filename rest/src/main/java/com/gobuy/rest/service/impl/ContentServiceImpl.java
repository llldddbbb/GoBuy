package com.gobuy.rest.service.impl;

import com.gobuy.mapper.ContentMapper;
import com.gobuy.pojo.Content;
import com.gobuy.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
    private ContentMapper contentMapper;
	@Override
	public List<Content> getContentList(long contentCid) {
		//根据内容分类id查询内容列表
		Content example=new Content();
		example.setCategory_id(contentCid);
		//执行查询
		List<Content> list = contentMapper.select(example);
		return list;
	}

}
