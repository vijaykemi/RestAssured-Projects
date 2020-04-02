package com.studentapp.junit.positiveandnegative;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Pending;

@RunWith(SerenityRunner.class)
public class FirstserenityTest {

	@BeforeClass
	public static void init(){
		
		RestAssured.baseURI="http://localhost:8080/student";
	}
	
	@Test
	public void getAllstudents() {
		
		SerenityRest.given().when().get("/list").then().log().all();
				
	}
	@Test
	public void getStudentWithID001() {
		
		SerenityRest.given().when().get("87").then().log().all().statusCode(234);
				
	}
	
	@Ignore
	@Test
	public void ignoredtest() {
		
		SerenityRest.given().when().get("87").then().log().all().statusCode(443);
				
	}

	@Test
	public void getStudentWithID003() {
		
		System.out.println(4/0);
				
	}
	
	@Pending
	@Test
	public void PendingTest() {
		
		SerenityRest.given().when().get("90").then().log().all();
				
	}
	
	@Test
	public void CompromisedTest() throws FileNotFoundException {
		
		File f = new File("deriee//werewiruw");
		FileReader fr = new FileReader(f);
				
	}
	
}
