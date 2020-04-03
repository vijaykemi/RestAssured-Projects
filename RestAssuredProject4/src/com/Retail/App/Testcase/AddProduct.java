package com.Retail.App.Testcase;

import org.testng.annotations.Test;

import com.Retail.App.Data.Category;
import com.Retail.App.Data.Session;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AddProduct {

	@Test
	public void test001(){
		
		RestAssured.baseURI = "http://localhost:8080";
		
		RestAssured.basePath = "/Retail_App_Rest/retail/admin/product/add";

		
		Response resp = given().contentType(ContentType.JSON).headers("sessionid","el4swD9tQl")
				.log().body().body("").post();
		
		resp.prettyPrint();
		
		//String sessionid = resp.headers().getValue("sessionid");
		
	//	System.out.println("Session id is : "+ sessionid);
		
		//System.out.println("All the headers : "+ resp.getHeaders());
		
	}
	
	
}
