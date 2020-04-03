package PostReqJSON3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
			
public class mapinsmapsinsecmplist {

	@Test()
	
	public void postreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		
		Student stu = new Student("jansdhi","rani","janshi.rani@commodoauctor.org","Financial Analysis");
		
		courses ob1 = stu.addcourse("java", "32");
		ob1.addtopics("oops");
		ob1.addtopics("collections");
		ob1.addtopics("packages");
		
		courses ob2 = stu.addcourse("c sharp", "52");
		ob2.addtopics("nunit");
		ob2.addtopics("collections");
		ob2.addtopics("packages");

		Response resp = given().contentType(ContentType.JSON).log().body().body(stu).post();
		
		System.out.println("------------Response--------------------");
		
		resp.prettyPrint();
	}
}