package com.Serenity.Framework;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;



//@RunWith(SerenityRunner.class)

public class Serenity {

	
	@Test
	
public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost/8080";
		RestAssured.basePath = "/student";
		
		SerenityRest.given().contentType(ContentType.JSON).get("/list");
		
		//Response resp = given().contentType(ContentType.JSON).header("X","Y").log().all().get();
		
		//resp.prettyPrint();
	}
	
}
