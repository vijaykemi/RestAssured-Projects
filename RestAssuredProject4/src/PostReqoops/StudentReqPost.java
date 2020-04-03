package PostReqoops;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
			
public class StudentReqPost {

	@Test()
	
	public void postreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		
		Student stu = new Student("RAMKUAR","kaushir","rakuwear.kaush@gmail.com","Financial Analysis");
		stu.setCourses("java");
		stu.setCourses("c++");
		stu.setCourses("c");
		
		Response resp = given().contentType(ContentType.JSON).log().body().body(stu).post();
		
		resp.prettyPrint();
	}
}