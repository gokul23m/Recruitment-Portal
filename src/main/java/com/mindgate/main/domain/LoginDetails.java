package com.mindgate.main.domain;

public class LoginDetails {
	private int loginId;
	private String password;
	private String designation;

	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String password, String designation) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.designation = designation;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", password=" + password + ", designation=" + designation + "]";
	}
}
