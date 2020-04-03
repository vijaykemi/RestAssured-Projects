package Mockservicesexamples;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class bigJSONdataextraction {

	/*
	@Test
	public void bigJSON() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "/search";

		Response resp = given().get();
		
		String id =given().get().then().extract().path("results[2].id");
		System.out.println("The ID is "+id);
		
		resp.prettyPrint();
	}
	
@Test
public void tc002() {

	RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
	RestAssured.basePath = "/search";

	Response resp = given().get();
	
	HashMap<String,String> map=given().get().then().extract().path("results[2].name");
	System.out.println("The map is "+ map);
	
	resp.prettyPrint();
}

	
	@Test
	public void tc003() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "/search";

		Response resp = given().get();
		
		int i=given().get().then().extract().path("results.size()");
		System.out.println("Total number of results "+ i);
		
		resp.prettyPrint();
	}
	*/
	@Test
	public void tc004() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "/search";

		Response resp = given().get();
		
		List<HashMap<String,Object>> list=given().get().then().extract().path("results.findAll{it.id='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}");
		System.out.println("informations about speaker  "+ list);
		
		resp.prettyPrint();
	}
	
	/*
	@Test
	public void tc005() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "/search";

		Response resp = given().get();
		
		String orderHint=given().get().then().extract().path("results.find{it.id='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}.orderHint");
		System.out.println("name of orderHint  "+ orderHint);
		
		LinkedHashMap<String,String> ancestors=given().get().then().extract().path("results.find{it.id='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}.description");
		System.out.println("name of ancestors  "+ ancestors);
		
		resp.prettyPrint();
	}
	*/
}