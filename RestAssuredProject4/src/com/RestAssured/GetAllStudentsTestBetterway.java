package com.RestAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllStudentsTestBetterway {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/list";
		
		Response resp = given().contentType(ContentType.JSON).header("X","Y").log().all().get();
		
		resp.prettyPrint();
	}
	
}