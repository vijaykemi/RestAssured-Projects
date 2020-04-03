package Extracting_value_outof_JSON;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class extractthrough_restassured_JsonPath {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
Response resp = given().contentType(ContentType.JSON).log().all().get("/86");

		resp.prettyPrint();

//		JsonPath ext=  given().contentType(ContentType.JSON).log().all().get("/86").jsonPath();
		JsonPath ext = resp.jsonPath();
		String firstname = ext.get("firstName");
		String lastname = ext.getString("lastName");

System.out.println("Firstname of student 96 is using json path "+ firstname);
System.out.println("Lastname of student 96 is using json path  "+ lastname);


	}
	
}