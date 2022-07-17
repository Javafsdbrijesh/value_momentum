package com.javafsd.jwt.model;

public class JwtRequest {
 private String userName;
 private String password;
/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}
/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
public JwtRequest() {
	
}
@Override
public String toString() {
	return "JwtRequest [userName=" + userName + ", password=" + password + "]";
}
 
}
