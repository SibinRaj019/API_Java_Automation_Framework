package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.SignUpRequestBody;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class SignUpTest {
	@Test(description = "Verify create account test")
	public static void signUp() {
		AuthenticationService authenticationService = new AuthenticationService();
		SignUpRequestBody signUpRequestBody = new SignUpRequestBody.Builder()
				.username("basha124")
				.email("bashaManik@hotmail.com")
				.firstName("Basha")
				.password("Manik123")
				.lastName("Manik")
				.mobileNumber("9717171718")
				.build();	
		Response response = authenticationService.signUp(signUpRequestBody);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(),"User registered sucessfully!");
	}
}
