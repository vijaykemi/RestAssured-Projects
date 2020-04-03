package PostReq1;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonUsingCollections {

	@Test()
	
	public void postreqtest() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		
		Map <String, Object> map = new HashMap <String, Object>();
		
	//	JSONObject obj = new JSONObject();
		map.put("firstName", "daneriu");
		map.put("lastName", "murugaesakuej");
		map.put("email", "yazmurweugav@gmail.com");
		map.put("programme", "Financial Analysis");
	//	JSONArray arr = new JSONArray();
		List <String> list = new ArrayList <String>();
		list.add("Accounting");
		list.add("C++");
		map.put("courses", list);
		
		
		Response resp = given().contentType(ContentType.JSON).log().body().body(map).post();
		
		resp.prettyPrint();
	}
	
	
}
