package com.bigbigrain.lawservice.vo;

import java.util.List;

public class EntityRequest {
	private String clientId;
	private UserInfo userInfo;
	private EntityEvaluate evaluate;
	private List<SecondEvaluate> secondEvaluate;
	public EntityRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntityRequest(String clientId) {
		super();
		this.clientId = clientId;
	}
	public EntityRequest(String clientId, UserInfo userInfo, EntityEvaluate evaluate, List<SecondEvaluate> secondEvaluate) {
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
	public EntityEvaluate getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(EntityEvaluate evaluate) {
		this.evaluate = evaluate;
	}
	public List<SecondEvaluate> getSecondEvaluate() {
		return secondEvaluate;
	}
	public void setSecondEvaluate(List<SecondEvaluate> secondEvaluate) {
		this.secondEvaluate = secondEvaluate;
	}
}
