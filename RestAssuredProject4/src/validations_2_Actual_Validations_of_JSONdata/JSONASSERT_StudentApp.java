package validations_2_Actual_Validations_of_JSONdata;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class JSONASSERT_StudentApp {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/1";
		
	String expected = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+File.separator+"SingleStudent.JSON")));
		
		String actual = given().contentType(ContentType.JSON).log().all().get().asString();
		
		System.out.println("Expected_Result " + expected);
		System.out.println("Actual_Result " + actual);
		JSONAssert.assertEquals(expected, actual, JSONCompareMode.NON_EXTENSIBLE);
	}	
}