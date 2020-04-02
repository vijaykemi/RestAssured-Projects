package com.studentapp.junit.serenitywithstudentid;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;

@RunWith(SerenityRunner.class)
public class GetStudentbyID17 {

	@BeforeClass
	public static void init(){
		
		RestAssured.baseURI="http://localhost:8080/student";
	}
	
	@Test
	public void getStudentWthID001() {
		
		SerenityRest.given().when().get("17").then().log().all();
				
	}
	
	
}
