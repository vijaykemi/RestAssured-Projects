package Extracting_value_outof_JSON;
import static io.restassured.RestAssured.given;
import java.util.List;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class extractthrough_restassured_extrmeth_extractingallstufirsname2_betterway {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		Response resp = given().contentType(ContentType.JSON).log().all().get("/list");
		List<Integer> ids = resp.then().extract().path("id");
		List<String> firstName = resp.then().extract().path("firstName");
		List<String> lastName = resp.then().extract().path("lastName");
		List<String> email = resp.then().extract().path("email");
		List<String> programme = resp.then().extract().path("programme");
		
		for (int i=0;i<ids.size();i++){
			System.out.println(ids.get(i));		
			System.out.println(firstName.get(i));																	
			System.out.println(lastName.get(i));
			System.out.println(email.get(i));
			System.out.println(programme.get(i));
			System.out.println("-------------------------------------");
		}


		
		
	}
	
}