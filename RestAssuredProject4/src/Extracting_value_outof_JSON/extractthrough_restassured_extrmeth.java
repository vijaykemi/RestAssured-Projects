package Extracting_value_outof_JSON;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class extractthrough_restassured_extrmeth {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
//ArrayList<String> firstnameslist = given().contentType(ContentType.JSON).log().all().get("/list").then().extract().path("firstName");

String firstname = given().contentType(ContentType.JSON).log().all().get("/96").then().extract().path("firstName");
String lastname = given().contentType(ContentType.JSON).log().all().get("/96").then().extract().path("lastName");
int id = given().contentType(ContentType.JSON).log().all().get("/96").then().extract().path("id");
String email = given().contentType(ContentType.JSON).log().all().get("/96").then().extract().path("email");
ArrayList<String> courses = given().contentType(ContentType.JSON).log().all().get("/96").then().extract().path("courses");

		//resp.prettyPrint();

//System.out.println(firstnameslist);
System.out.println("Firstname of student 96 is "+ firstname);
System.out.println("Lastname of student 96 is "+ lastname);
System.out.println("id of student 96 is "+ id);
System.out.println("email of student 96 is "+ email);
System.out.println("courses of student 96 is "+ courses);

	}
	
}