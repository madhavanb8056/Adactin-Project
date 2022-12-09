package com.api.automate;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Retrive_Response {

	@Test
	public void single_user() {
         
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		ResponseBody body = response.getBody();
		
		String asString = body.asString();
		
		System.out.println("Response body : "+ asString );
		
		String statusLine = response.getStatusLine();
		
		System.out.println("Statusline : "+ statusLine);
		
        int statusCode = response.getStatusCode();
        
        Assert.assertEquals(200, statusCode);
        
        System.out.println("Status code : "+ statusCode);
        
        System.out.println("Validation successful");
		
	}
	
	@Test
	public void multiple_User() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response response = req.get("api/users?page=2");
		ResponseBody body = response.getBody();
		String asString = body.asString();
		System.out.println("Response body : "+ asString);
		String statusLine = response.getStatusLine();
		System.out.println("statusline : "+statusLine);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);
		System.out.println("statuscode : "+ statusCode);
		System.out.println("Validation successful");
		
		
	}
	
	
	
	
}
