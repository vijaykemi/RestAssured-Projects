package com.studentapp.cucumber.steps;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import static org.hamcrest.Matchers.hasValue;
import static org.junit.Assert.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.studentapp.TestBase.BaseTest;
import com.studentapp.TestUtils.ReusableSpecifications;
import com.studentapp.TestUtils.Testutils;
import com.studentapp.cucumber.serenity.StudentSerenitySteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class StudentSteps extends BaseTest{
	
	@Steps
	StudentSerenitySteps steps;
	static String email;
	
	@When("^User sends a GET request to the endpoint, they must get a valid status code 200$")
	public void verify_statuscode_200_for_listendpoint(){
		
		SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec())
		.when().get("/list").then().statusCode(200);
	}
	
	@When ("^I create a new student by providing the information firstName(.*) lastName(.*) email(.*) programme(.*) courses(.*)$")
	
public void createstudent(String firstName,String lastName,String _email,String programme,String course){
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(course);
		email = Testutils.getRandownvalue()+_email;
		
		steps.createstudent(firstName, lastName, email, programme, courses)
		.assertThat()
		.statusCode(201);
	}
	
//	I create a new student by providing the information firstName<firstName> lastName<lastName> email<email> programme<programme> course1<course1> course2<course2> using Objectmapper
	@When ("^I create a new student by providing the information firstName(.*) lastName(.*) email(.*) programme(.*) course1(.*) course2(.*) using Objectmapper$")	
public void createstudentusiobjmapp(String firstName,String lastName,String _email,String programme,String course1,String course2) throws JsonProcessingException{
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(course1);
		courses.add(course2);
		email = Testutils.getRandownvalue()+_email;
		
		steps.createstudentusingobjmapp(firstName, lastName, email, programme, courses)
		.assertThat()
		.statusCode(201);
	}
	
//	I create a new student by providing the information firstName<firstName> lastName<lastName> email<email> programme<programme> course1<course1> course2<course2> using ObjectmapperwithJSON
	@When ("^I create a new student by providing the information firstName(.*) lastName(.*) email(.*) course1(.*) course2(.*) using ObjectmapperStudentwithJSON$")	
public void createstudentusiobjmappwithJSON(String firstName,String lastName,String _email,String course1,String course2) throws IOException{
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add(course1);
		courses.add(course2);
		email = Testutils.getRandownvalue()+_email;
		
		//steps.createstudentusingobjmappwithJSON(firstName, lastName, email, programme, courses)
		steps.createstudentusingobjmappwithJSON(firstName, lastName, email, courses)
		.assertThat()
		.statusCode(201);
	}
	
	
	@Then ("^I verify that the student with (.*) is created$")
	
	public void verifyifstudentadded(String emailID){
		HashMap<String,Object> actualValue = steps.GetStudentinfobyEmailId(email);
		
		assertThat(actualValue,hasValue(email));
	}
}
