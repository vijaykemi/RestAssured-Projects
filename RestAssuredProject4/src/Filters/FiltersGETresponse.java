package Filters;

import static io.restassured.RestAssured.given;

import java.io.PrintStream;
import java.io.StringWriter;

import org.apache.commons.io.output.WriterOutputStream;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FiltersGETresponse {
	
	public static StringWriter requestWriter;
	public static PrintStream requestCapture;
	
	public static StringWriter responseWriter;
	public static PrintStream responseCapture;

	@BeforeClass
	public void BeforeEachmethod(){
		
		requestWriter = new StringWriter();
		requestCapture = new PrintStream(new WriterOutputStream(requestWriter),true);
		
		responseWriter = new StringWriter();
		responseCapture = new PrintStream(new WriterOutputStream(responseWriter),true);
	}
	
	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		given().filter(new RequestLoggingFilter(requestCapture)).filter(new ResponseLoggingFilter(responseCapture)).when().get("/10");
		
		String Requestlogs = requestWriter.toString();
		String Responselogs = responseWriter.toString();
		
		System.out.println("==================REQUEST=======================");
		System.err.println(Requestlogs);
		
		System.out.println("==================RESPONSE=======================");
		System.err.println(Responselogs);
	}
	
}