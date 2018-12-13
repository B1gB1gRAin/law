package com.bigbigrain.lawservice.vo;

import java.util.List;

public class NetRequest {
	private String clientId;
	private UserInfo userInfo;
	private NetEvaluate evaluate;
	private List<SecondEvaluate> secondEvaluate;
	public NetRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NetRequest(String clientId) {
		super();
		this.clientId = clientId;
	}
	public NetRequest(String clientId, UserInfo userInfo, NetEvaluate evaluate, List<SecondEvaluate> secondEvaluate) {
		super();
		this.clientId = clientId;
		this.userInfo = userInfo;
		this.evaluate = evaluate;
		this.secondEvaluate = secondEvaluate;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public NetEvaluate getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(NetEvaluate evaluate) {
		this.evaluate = evaluate;
	}
	public List<SecondEvaluate> getSecondEvaluate() {
		return secondEvaluate;
	}
	public void setSecondEvaluate(List<SecondEvaluate> secondEvaluate) {
		this.secondEvaluate = secondEvaluate;
	}
}
