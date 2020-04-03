package com.oauth2.paypal.examples;

import com.oauth2.paypal.base.Baseclass;
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

public class oauth2_Createproduct_paypal_POST extends Baseclass{

@Test()
	
	public void Createproduct() {
	
	String body = "{   \"name\": \"VideoStreamingService\",   \"description\": \"Videostreamingservice\",   \"type\": \"SERVICE\",   \"category\": \"SOFTWARE\",   \"image_url\": \"https://example.com/streaming.jpg\",   \"home_url\": \"https://example.com/home\" }";
	
	given().contentType(ContentType.JSON)
	.auth().oauth2(accesstokenid).when().body(body)
	.post("/v1/catalogs/products").then().log().all();
	
	Response Resp = given().contentType(ContentType.JSON)
			.auth().oauth2(accesstokenid).when().body(body)
			.post("/v1/catalogs/products");
	System.out.println("Status code is "+Resp.statusCode());
}
	
}
