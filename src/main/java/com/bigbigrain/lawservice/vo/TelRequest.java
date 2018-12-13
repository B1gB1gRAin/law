package com.bigbigrain.lawservice.vo;

import java.util.List;

public class TelRequest {
	private String clientId;
	private UserInfo userInfo;
	private TelEvaluate evaluate;
	private List<SecondEvaluate> secondEvaluate;
	public TelRequest() {
		super();
	}
	public TelRequest(String clientId) {
		super();
		this.clientId = clientId;
	}
	public TelRequest(String clientId, UserInfo userInfo, TelEvaluate evaluate, List<SecondEvaluate> secondEvaluate) {
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
	public TelEvaluate getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(TelEvaluate evaluate) {
		this.evaluate = evaluate;
	}
	public List<SecondEvaluate> getSecondEvaluate() {
		return secondEvaluate;
	}
	public void setSecondEvaluate(List<SecondEvaluate> secondEvaluate) {
		this.secondEvaluate = secondEvaluate;
	}
}
