package com.bigbigrain.lawservice.vo;

import java.util.List;

public class OrgRequest {
	private String clientId;
	private UserInfo userInfo;
	private OrgEvaluate evaluate;
	private List<SecondEvaluate> secondEvaluate;
	public OrgRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgRequest(String clientId) {
		super();
		this.clientId = clientId;
	}
	public OrgRequest(String clientId, UserInfo userInfo, OrgEvaluate evaluate, List<SecondEvaluate> secondEvaluate) {
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
	public OrgEvaluate getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(OrgEvaluate evaluate) {
		this.evaluate = evaluate;
	}
	public List<SecondEvaluate> getSecondEvaluate() {
		return secondEvaluate;
	}
	public void setSecondEvaluate(List<SecondEvaluate> secondEvaluate) {
		this.secondEvaluate = secondEvaluate;
	}
}
