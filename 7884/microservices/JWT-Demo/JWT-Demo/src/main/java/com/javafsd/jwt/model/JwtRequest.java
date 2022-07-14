package com.javafsd.jwt.model;

public class JwtRequest {
	private String userName;
	private String Password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public JwtRequest() {

	}
	public JwtRequest(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	public void setPassword(String password) {
		Password = password;
	
	}
	@Override
	public String toString() {
		return "JwtRequest [userName=" + userName + ", Password=" + Password + "]";
	}

}
