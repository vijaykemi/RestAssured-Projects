package Logging;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requestloggingexample {

	/*
	@Test()
	
// Logging all the informations in the REQUEST	
	public void test001() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		Response resp = given().contentType(ContentType.JSON).log().all().get("/96");
		
		resp.prettyPrint();
	}
	
	
	@Test()
	
	// Logging header informations from the REQUEST	
		public void test002() throws Exception {
			
			RestAssured.baseURI="http://localhost";
			RestAssured.port = 8080;
			RestAssured.basePath = "/student";
			
			Response resp = given().headers("x","Y").log().headers().get("/96");
			
			resp.prettyPrint();
		}
		
		
	@Test()
	
	// Logging parameters informations from the REQUEST	
		public void test003() throws Exception {
			
			RestAssured.baseURI="http://localhost";
			RestAssured.port = 8080;
			RestAssured.basePath = "/student";
			
			Response resp = given().param("programme", "computer science").log().params().get("/list");
			
			resp.prettyPrint();
		}

	
	@Test()
	
	// Logging body informations from the REQUEST	
		public void test004() throws Exception {
			
			RestAssured.baseURI="http://localhost";
			RestAssured.port = 8080;
			RestAssured.basePath = "/student";
			
			File JSON = new File("C://Users//vijay//workspace//RestAssuredProject4//student.json");
			
			Response resp = given().contentType(ContentType.JSON).log().body().body(JSON).post();
			
			resp.prettyPrint();
		}
	
	*/
	
	@Test()
	
	// Logging body informations from the REQUEST	
		public void test005() throws Exception {
			
			RestAssured.baseURI="http://localhost";
			RestAssured.port = 8080;
			RestAssured.basePath = "/student";
			
			File JSON = new File("C://Users//vijay//workspace//RestAssuredProject4//student.json");
			
			 Response resp = given().contentType(ContentType.JSON).log().body().body(JSON).post();
				resp.prettyPrint();
				
				System.out.println("-------------------------------------------------");
			
	 given().contentType(ContentType.JSON).log().ifValidationFails().body(JSON).post().then().statusCode(500);
			

		}
	
}