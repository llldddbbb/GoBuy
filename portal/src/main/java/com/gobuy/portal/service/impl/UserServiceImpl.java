package com.gobuy.portal.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.pojo.User;
import com.gobuy.portal.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	
	@Value("${SSO_BASE_URL}")
	public String SSO_BASE_URL;
	@Value("${SSO_USER_TOKEN}")
	private String SSO_USER_TOKEN;
	@Value("${SSO_PAGE_LOGIN}")
	public String SSO_PAGE_LOGIN;
	
	
	@Override
	public User getUserByToken(String token) {
		try {
			//调用sso系统的服务，根据token取用户信息
			String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_TOKEN + token);
			//把json转换成GoBuyResult
			GoBuyResult result = GoBuyResult.formatToPojo(json, User.class);
			if (result.getStatus() == 200) {
				User user = (User) result.getData();
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
