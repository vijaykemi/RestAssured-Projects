package PostReqJSON1;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
			
public class Passingmapinsdmap {

	@Test()
	
	public void postreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		
		Student stu = new Student("mary","gary","mary.gary@gmail.com","Financial Analysis");
		
		courses course = new courses("java", "32");
		stu.setCourse(course);

		Response resp = given().contentType(ContentType.JSON).log().body().body(stu).post();
		
		System.out.println("------------Response--------------------");
		
		resp.prettyPrint();
	}
}