package CRUDOperations;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteReqTest {

	@Test()
	
	public void Delreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		File JSON = new File("C://Users//vijay//workspace//RestAssuredProject4//student.json");
		
		Response resp = given().contentType(ContentType.JSON).log().all().delete("/103");
		
		resp.prettyPrint();
	}
	
	
}
