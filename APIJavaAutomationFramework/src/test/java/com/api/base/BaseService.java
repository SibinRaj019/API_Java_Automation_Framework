package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	/**
	 * Executed only once
	 */
	static {
        RestAssured.filters(new LoggingFilter());
    }
	/**
	 * Class contains common properties and method
	 */
	private static final String BASE_URI = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;

	/**
	 * Constructor is used to Initialize - Instance variable
	 */
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URI);
	}

	/**
	 * How to attach authentication token
	 * 
	 * @param token
	 */
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}

	/**
	 * How to make post request
	 * 
	 * @param payload
	 * @param endpoint
	 * @return
	 */
	protected Response PostRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	/**
	 * How to make get request
	 * 
	 * @param endpoint
	 * @return
	 */
	protected Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}

	/**
	 * How to make put request
	 * 
	 * @param payload
	 * @param endpoint
	 * @return
	 */
	protected Response PutRequest(Object payload, String endpoint) {
		System.out.println(payload.toString());
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
}
