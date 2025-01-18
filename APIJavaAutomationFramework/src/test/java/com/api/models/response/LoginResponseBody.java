package com.api.models.response;

import java.util.List;

public class LoginResponseBody {

	public LoginResponseBody() {

	}

	private String type;
	private String token;
	private String bearer;
	private String id;
	private String username;
	private String email;
	private List<String> roles;
	public LoginResponseBody(String type, String token, String bearer, String id, String username, String email,
			List<String> roles) {
		super();
		this.type = type;
		this.token = token;
		this.bearer = bearer;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "LoginResponseBody [type=" + type + ", token=" + token + ", bearer=" + bearer + ", id=" + id
				+ ", username=" + username + ", email=" + email + ", roles=" + roles + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBearer() {
		return bearer;
	}
	public void setBearer(String bearer) {
		this.bearer = bearer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
