package com.ajp.model;

public class LoginPageModel {
	String loginId;
	String password;
	
	public LoginPageModel() {
		super();
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginPageModel(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	
}
