package Mockservicesexamples;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class sample {
	
	@Test
	public void test001() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "/search";

		Response resp = given().get();
		
		int lim =given().get().then().extract().path("limit");
		System.out.println("Total number of limit is "+lim);
		
		resp.prettyPrint();
	}
}
