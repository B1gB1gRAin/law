package com.bigbigrain.lawservice.vo;

public class Response {
	/**
	 * 状态码
	 */
	private String code;
	/**
	 * 风格
	 */
	private String message;
	private String token;
	private String description;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", token=" + token + ", description=" + description
				+ "]";
	}
	
	
}
