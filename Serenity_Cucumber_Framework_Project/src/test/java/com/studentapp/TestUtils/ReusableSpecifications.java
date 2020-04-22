package com.studentapp.TestUtils;

//import class not interface
import static org.hamcrest.Matchers.lessThan;

import java.util.concurrent.TimeUnit;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class ReusableSpecifications {
	
	public static RequestSpecBuilder reqspecBuld;
	public static RequestSpecification reqspecification;
	
	public static ResponseSpecBuilder respspecBuld;
	public static ResponseSpecification respspecification;
	
	
	public static RequestSpecification getGenReqSpec(){
		
		reqspecBuld = new RequestSpecBuilder();
		reqspecBuld.setBaseUri("http://localhost:8080");
		reqspecBuld.setBasePath("/student");
		reqspecBuld.setContentType(ContentType.JSON);
		reqspecification = reqspecBuld.build();
		
		return reqspecification;
	}
	
		public static ResponseSpecification getGenRespSpec(){
			
			respspecBuld = new ResponseSpecBuilder();
			respspecBuld.expectHeader("Content-Type", "application/json;charset=UTF-8");
			respspecBuld.expectHeader("Transfer-Encoding", "chunked");
			respspecBuld.expectResponseTime(lessThan(5L),TimeUnit.SECONDS);
			respspecification = respspecBuld.build();
			
			return respspecification;	
			
			
}
}