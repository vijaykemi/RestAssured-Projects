package com.Retail.App.Testcase;

import org.testng.annotations.Test;

import com.Retail.App.Data.Session;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class LoginReq {

	@Test
	public void test001(){
		
		RestAssured.baseURI = "http://localhost:8080";
		
		RestAssured.basePath = "Retail_App_Rest/retail/admin/login";
		
		Session s = new Session();
		s.setUsername("admin");
	s.setPassword("whizdom");
		
	//	s.setUsername("vijaykemi@gmail.com");
	//	s.setPassword("XYTbxK3");
	//	s.setUsername("abhinvkaushik@gmail.com");
	//	s.setPassword("123456");
		
		Response resp = given().contentType(ContentType.JSON).log().all().when().body(s).post();
		
		resp.prettyPrint();
		
		String sessionid = resp.headers().getValue("sessionid");
		
		System.out.println("Session id is : "+ sessionid);
		
		System.out.println("All the headers : "+ resp.getHeaders());
		
	}
	
	
}
