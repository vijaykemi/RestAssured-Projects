package CRUDOperations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetStudentbyID {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		Response resp = given().contentType(ContentType.JSON).log().all().get("/96");
		
		given().contentType(ContentType.JSON).log().all().get("/96").then().log().all();
		resp.prettyPrint();
	}
	
}