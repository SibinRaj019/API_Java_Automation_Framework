package com.api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.LoginRequestBody;
import com.api.models.response.LoginResponseBody;

import io.restassured.response.Response;

public class LoginTest {

	@Test(description = "Verify login Test")
	public static void LoginTest() {
		AuthenticationService authenticationService = new AuthenticationService();
		LoginRequestBody loginRequestBody = new LoginRequestBody("sibinrajash@gmail.com", "sibin@SDET");
		Response response = authenticationService.login(loginRequestBody);
		LoginResponseBody loginResponseBody = response.as(LoginResponseBody.class);
		System.out.println(loginResponseBody.getToken());
		Assert.assertTrue(loginResponseBody.getToken() != null);
		Assert.assertEquals(loginResponseBody.getUsername(),"sibinrajash@gmail.com");
	}
}
