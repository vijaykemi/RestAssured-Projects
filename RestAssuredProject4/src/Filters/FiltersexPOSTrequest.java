package Filters;

import static io.restassured.RestAssured.given;

import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.output.WriterOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;

public class FiltersexPOSTrequest {
	
	public static StringWriter requestWriter;
	public static PrintStream requestCapture;

	@BeforeClass
	public void BeforeEachmethod(){
		
		requestWriter = new StringWriter();
		requestCapture = new PrintStream(new WriterOutputStream(requestWriter),true);
	}
	
	@Test()
	
	public void getallStudents() throws Exception {
		
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
		
		given().filter(new RequestLoggingFilter(requestCapture)).body(obj.toString()).post();
		
		String Requestlogs = requestWriter.toString();
		
		System.err.println(Requestlogs);
	}
	
}