package Filters;

import static io.restassured.RestAssured.given;

import java.io.PrintStream;
import java.io.StringWriter;

import org.apache.commons.io.output.WriterOutputStream;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FiltersGETerror {
	
	public static StringWriter requestWriter;
	public static PrintStream requestCapture;
	
	public static StringWriter responseWriter;
	public static PrintStream responseCapture;

	public static StringWriter errorWriter;
	public static PrintStream errorCapture;
	
	@BeforeClass
	public void BeforeEachmethod(){
		
		requestWriter = new StringWriter();
		requestCapture = new PrintStream(new WriterOutputStream(requestWriter),true);
		
		responseWriter = new StringWriter();
		responseCapture = new PrintStream(new WriterOutputStream(responseWriter),true);
		
		errorWriter = new StringWriter();
		errorCapture = new PrintStream(new WriterOutputStream(errorWriter),true);
	}
	
	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
		
		given().filter(new RequestLoggingFilter(requestCapture)).filter(new ResponseLoggingFilter(responseCapture)).filter(new ErrorLoggingFilter(errorCapture)).when().get("/1023");
		
		String Requestlogs = requestWriter.toString();
		String Responselogs = responseWriter.toString();
		String Errorlogs = errorWriter.toString();
	/*	
		System.out.println("==================REQUEST=======================");
		System.err.println(Requestlogs);
		
		System.out.println("==================RESPONSE=======================");
		System.err.println(Responselogs);
	*/	
		System.out.println("==================ERROR=======================");
		System.err.println(Errorlogs);
	
	}
	
}