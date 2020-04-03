package Extracting_value_outof_JSON;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class extractthrough_restassured_extrmeth_extractingallstufirsname {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		ArrayList<String> firstnameslist = given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("firstName");																	
		System.out.println(firstnameslist);																	


	}
	
}