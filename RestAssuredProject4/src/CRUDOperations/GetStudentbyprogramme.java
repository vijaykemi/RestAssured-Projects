package CRUDOperations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetStudentbyprogramme {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/list?programme=Financial%20Analysis&limit=2";
		
		Response resp = given().contentType(ContentType.JSON).log().all().get();
		
		resp.prettyPrint();
	}
	
}