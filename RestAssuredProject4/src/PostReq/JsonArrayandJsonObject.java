package PostReq;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonArrayandJsonObject {

	@Test()
	
	public void postreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		JSONObject obj = new JSONObject();
		obj.put("firstName", "makduya");
		obj.put("lastName", "ravichandkuej");
		obj.put("email", "yazhrav@gmail.com");
		obj.put("programme", "Financial Analysis");
		JSONArray arr = new JSONArray();
		arr.put("Accounting");
		arr.put("Statistics");
		obj.put("courses", arr);
		
		
		Response resp = given().contentType(ContentType.JSON).log().body().body(obj.toString()).post();
		
		resp.prettyPrint();
	}
	
	
}
