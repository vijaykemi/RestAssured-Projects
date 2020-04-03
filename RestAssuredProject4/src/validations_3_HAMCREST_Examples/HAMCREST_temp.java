package validations_3_HAMCREST_Examples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HAMCREST_temp {

	@Test()
	
	public void Hardassert() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/10";
		
		given().contentType(ContentType.JSON).get().then().body("id", equalTo(12))
			.body("id", greaterThan(12));
			//.body("courses", hasItems("Accounting","Statistics"));
			//.body(hasitem("Vernon"));
			

	}
	
@Test()
	
	public void softasser() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student/10";
		
		System.out.println("---------------------------");
		given().contentType(ContentType.JSON)
				.get()
				.then()
				.body("id", equalTo(12),"id", greaterThan(12));
			
			//.body(hasitem("Vernon"));
			

	}
	
}