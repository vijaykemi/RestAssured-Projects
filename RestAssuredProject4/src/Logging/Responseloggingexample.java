package Logging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Responseloggingexample {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
//ValidatableResponse resp = given().contentType(ContentType.JSON).get("/96").then().log().headers();
		
		given().contentType(ContentType.JSON).get("/196").then().log().ifError();
		
		//resp.prettyPrint();
	}
	
}