package com.bigbigrain.lawservice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.bigbigrain.lawservice.utils.HttpClientUtil;

public class HttpClientUtilTest {
	@Test
	public void testDoGet() {
		String result = HttpClientUtil.doGet("http://www.baidu.com");
		System.out.println(result);
	}
	
	@Test
	public void testDoPost() {
		Map<String,Object> json = new HashMap<String,Object>();
		json.put("clientId", "5ADC9994E4644FF5A539C8B7CDA314AF");
		String result = HttpClientUtil.doPostJson("http://www.12348.gov.cn/sfbapi/api/token", JSON.toJSONString(json));
		System.out.println(result);
	}
}
