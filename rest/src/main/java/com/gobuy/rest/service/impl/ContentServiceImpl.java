package com.gobuy.rest.service.impl;

import com.gobuy.common.util.JsonUtils;
import com.gobuy.mapper.ContentMapper;
import com.gobuy.pojo.Content;
import com.gobuy.rest.dao.JedisClient;
import com.gobuy.rest.dao.JedisClientSingle;
import com.gobuy.rest.service.ContentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
    private ContentMapper contentMapper;

	@Autowired
	private JedisClient jedisClient;

	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;

	@Override
	public List<Content> getContentList(long contentCid) {
		//从缓存中读取数据
		try {
			String redisResult=jedisClient.hget(INDEX_CONTENT_REDIS_KEY,contentCid+"");
			if(!StringUtils.isBlank(redisResult)){
				List<Content> resultList = JsonUtils.jsonToList(redisResult, Content.class);
				return resultList;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		//根据内容分类id查询内容列表
		Content example=new Content();
		example.setCategory_id(contentCid);
		//执行查询
		List<Content> list = contentMapper.select(example);

		//向缓存中添加内容
		try {
			String str= JsonUtils.objectToJson(list);
			jedisClient.hset(INDEX_CONTENT_REDIS_KEY,contentCid+"",str);
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}

}
