package com.oauth2.paypal.examples;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.oauth2.paypal.base.Baseclass;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class oauthexamplepayment extends Baseclass{

	/*
	@Test()
	
	public void captureautorizationpayment() {
		
		String body = "{   \"amount\": {     \"value\": \"10.99\",     \"currency_code\": \"USD\"   },   \"invoice_id\": \"INVOICE-123\",   \"final_capture\": true }";
		
		//given().contentType(ContentType.JSON).header("PayPal-Request-Id","123e4567-e89b-12d3-a456-426655440010")
		given().contentType(ContentType.JSON)
		.auth().oauth2(accesstokenid).when().body(body)
		//.post("/v2/payments/authorizations/0VF52814937998046/capture").then().log().all();
		.post("v2/payments/captures/2GG279541U471931P").then().log().all();
		
		given().contentType(ContentType.JSON)
		.auth().oauth2(accesstokenid).when()
		.get("v2/payments/authorizations/0VF52814937998046")
		.then().log().all();
		
String body = "{   \"name\": \"OverrideAgreement\",   \"description\": \"PayPalpaymentagreementthatoverridesmerchantpreferencesandshippingfeeandtaxinformation.\",   \"start_date\": \"2020-04-22T09:13:49Z\",   \"payer\": {     \"payment_method\": \"paypal\",     \"payer_info\": {       \"email\": \"payer@example.com\"     }   },   \"plan\": {     \"id\": \"P-1WJ68935LL406420PUTENA2I\"   },   \"shipping_address\": {     \"line1\": \"HotelStaybridge\",     \"line2\": \"CrookeStreet\",     \"city\": \"SanJose\",     \"state\": \"CA\",     \"postal_code\": \"95112\",     \"country_code\": \"US\"   },   \"override_merchant_preferences\": {     \"setup_fee\": {       \"value\": \"3\",       \"currency\": \"GBP\"     },     \"return_url\": \"https://example.com/\",     \"cancel_url\": \"https://example.com/cancel\",     \"auto_bill_amount\": \"YES\",     \"initial_fail_amount_action\": \"CONTINUE\",     \"max_fail_attempts\": \"11\"   },   \"override_charge_models\": [     {       \"charge_id\": \"CHM-8373958130821962WUTENA2Q\",       \"amount\": {         \"value\": \"1\",         \"currency\": \"GBP\"       }     }   ] }";
		
		//given().contentType(ContentType.JSON).header("PayPal-Request-Id","123e4567-e89b-12d3-a456-426655440010")
		given().contentType(ContentType.JSON)
		.auth().oauth2(accesstokenid).when().body(body)
		//.post("/v2/payments/authorizations/0VF52814937998046/capture").then().log().all();
		.post("v1/payments/billing-agreements/").then().log().all();
			
	}
	*/

@Test()
	
	public void Listdisputes() {
	
	given().contentType(ContentType.JSON)
	.auth().oauth2(accesstokenid).when()
	.get("/v1/customer/disputes/").then().log().all();
	//.post("v1/payments/billing-agreements/").then().log().all();
	
	Response Resp = given().contentType(ContentType.JSON)
			.auth().oauth2(accesstokenid).when()
			.get("/v1/customer/disputes/");
	System.out.println("Status code is "+Resp.statusCode());
}
	
}
