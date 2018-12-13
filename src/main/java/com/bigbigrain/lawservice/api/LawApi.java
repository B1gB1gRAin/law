package com.bigbigrain.lawservice.api;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.bigbigrain.lawservice.utils.HttpClientUtil;
import com.bigbigrain.lawservice.vo.EntityRequest;
import com.bigbigrain.lawservice.vo.NetRequest;
import com.bigbigrain.lawservice.vo.OrgRequest;
import com.bigbigrain.lawservice.vo.ResultVo;
import com.bigbigrain.lawservice.vo.TelRequest;

public class LawApi {
	/**
	 * 获取token
	 * @param clientId 客户端id
	 * @return
	 */
	public static ResultVo getToken(String clientId) {
		String url = "http://www.12348.gov.cn/sfbapi/api/token";
		Map<String,Object> json = new HashMap<String,Object>();
		json.put("clientId", clientId);
		String result = HttpClientUtil.doPostJson(url, JSON.toJSONString(json));
		return JSON.parseObject(result, ResultVo.class);
	}
	
	/**
	 * 机关履职满意度评价信息同步接口
	 * @return
	 */
	public static ResultVo synEvaluateOrg(String token, OrgRequest requestParam) {
		String url = "http://www.12348.gov.cn/sfbapi/api/evaluate/org";
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("token", token);
		String result = HttpClientUtil.doPostJson(url, JSON.toJSONString(requestParam), headers);
		return JSON.parseObject(result, ResultVo.class);
	}
	
	/**
	 * 工作业务满意度评价参数（网络平台）
	 * @param token
	 * @param requestParam
	 * @return
	 */
	public static ResultVo synEvaluateNet(String token, NetRequest requestParam) {
		String url = "http://www.12348.gov.cn/sfbapi/api/evaluate/net";
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("token", token);
		String result = HttpClientUtil.doPostJson(url, JSON.toJSONString(requestParam), headers);
		return JSON.parseObject(result, ResultVo.class);
	}
	
	/**
	 * 工作业务满意度评价参数（热线平台）
	 * @param token
	 * @param requestParam
	 * @return
	 */
	public static ResultVo synEvaluateTel(String token, TelRequest requestParam) {
		String url = "http://www.12348.gov.cn/sfbapi/api/evaluate/tel";
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("token", token);
		String result = HttpClientUtil.doPostJson(url, JSON.toJSONString(requestParam), headers);
		return JSON.parseObject(result, ResultVo.class);
	}
	
	/**
	 * 工作业务满意度评价参数（实体平台）
	 * @param token
	 * @param requestParam
	 * @return
	 */
	public static ResultVo synEvaluateEntity(String token, EntityRequest requestParam) {
		String url = "http://www.12348.gov.cn/sfbapi/api/evaluate/entity";
		Map<String,String> headers = new HashMap<String,String>();
		headers.put("token", token);
		String result = HttpClientUtil.doPostJson(url, JSON.toJSONString(requestParam), headers);
		return JSON.parseObject(result, ResultVo.class);
	}
}
