package com.bigbigrain.lawservice.vo;

public class ResultVo {
	private Response response;

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResultVo [response=" + response + "]";
	} 
}
