package com.RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllStudentsTest {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/list";
		
		RequestSpecification req = given();
		//Content type -jason/xml
		req=req.contentType(ContentType.JSON);
		//Setting the headers
		req=req.header("X","Y");
		
		//Logging
		req=req.log().all();
		
		Response resp = req.get();
		
	//	response.print();
		resp.prettyPrint();
		
		//Getting the Content type in response
		System.out.println("Content Type of RESPONSE is "+resp.getContentType());
		
		//Getting the headers in response
				System.out.println("headers in RESPONSE is "+resp.getHeaders());
				
		//Getting the response time
				System.out.println("RESPONSE Time is "+resp.time());
		
		//Getting the response time
				System.out.println("Status code is "+resp.statusCode());
	}
	
}