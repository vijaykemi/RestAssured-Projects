package com.oauth2.paypal.base;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Baseclass {
	
	public static String accesstokenid;
	
	public static String clientId ="AX-aSs3Av_3KEF2Mv-_yjEAaI0RcVJELAF2I6atoUB32i6O4N5p7o0t04HkkSO_tnDeXFN-JwwIw_Oqm";
	public static String clientsecretId ="EBSH_FeC0yNf3lpvIzUhTBfHG-sWevVrSCHoRWwOwxUMOAtLL3x7q0UDiPBDTcIs7BntTddKw47KVnnB";
	
	
	
	@BeforeClass
	
	public void beforetest(){
		
		RestAssured.baseURI="https://api.sandbox.paypal.com";
		RestAssured.basePath = "";
		
	}
	
	@Test()
	
	public void retrieveaccesstoken() throws Exception {
		
		//to log all the details
	/*	
		String accesstoken = given().params("grant_type", "client_credentials").auth().preemptive()
		.basic(clientId, clientsecretId)
		.when().post().then().log().all().toString();
		
		System.out.println(accesstoken);
	*/	
		
		accesstokenid= given().params("grant_type", "client_credentials").auth().preemptive()
			.basic(clientId, clientsecretId)
			.when().post("/v1/oauth2/token").then().extract().path("access_token").toString();
		
		System.out.println("AccessTokenis : " + accesstokenid);
	}
	
}