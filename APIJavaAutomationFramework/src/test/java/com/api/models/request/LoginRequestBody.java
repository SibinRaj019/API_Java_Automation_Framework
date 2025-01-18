package com.api.models.request;

public class LoginRequestBody {
	
	String username;
	String password;
	
	public LoginRequestBody(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginRequestBody [username=" + username + ", password=" + password + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
