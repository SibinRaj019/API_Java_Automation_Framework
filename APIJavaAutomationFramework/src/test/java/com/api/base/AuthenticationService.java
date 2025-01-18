package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequestBody;
import com.api.models.request.SignUpRequestBody;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	
	private static final String BASE_PATH = "/api/auth/";

	/**
	 * api/auth/login
	 * @param payload
	 * @return
	 */
	public Response login(LoginRequestBody payload)
	{
		return PostRequest(payload,BASE_PATH+"login");
	}
	
	/**
	 * api/auth/signup
	 * @param payload
	 * @return
	 */
	public Response signUp(SignUpRequestBody payload)
	{
		return PostRequest(payload,BASE_PATH+"signup");
	}
	
	/**
	 * api/auth/forgot-password
	 * @param emailAddress
	 * @return
	 */
	public Response forgotPassword(String emailAddress)
	{
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email",emailAddress);
		return PostRequest(payload,BASE_PATH+"forgot-password");
	}
	
	/**
	 * Reset password needs reading mail box - not covered 
	 */
	public void resetPassword()
	{
		
	}
}
