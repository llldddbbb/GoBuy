package com.gobuy.portal.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.HttpClientUtil;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.pojo.Order;
import com.gobuy.portal.service.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class OrderServiceImpl implements OrderService {
	
	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER_CREATE_URL}")
	private String ORDER_CREATE_URL;
	

	@Override
	public String createOrder(Order order) {
		String json = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER_CREATE_URL, JsonUtils.objectToJson(order));
		//把json转换成Result
		GoBuyResult result = GoBuyResult.format(json);
		if (result.getStatus() == 200) {
			Object orderId = result.getData();
			return orderId.toString();
		}
		return "";
	}

}