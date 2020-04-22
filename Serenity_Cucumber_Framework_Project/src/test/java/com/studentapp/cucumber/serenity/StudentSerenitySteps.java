package com.studentapp.cucumber.serenity;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studentapp.TestUtils.ReusableSpecifications;
import com.studentapp.model.StudentClass;
import com.studentapp.model.pojofordata;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class StudentSerenitySteps {
	
	@Step("Creating Student with firstName : {0}, lastName : {1}, email : {2}, Programme : {3}, courses : {4}")
	public ValidatableResponse createstudent(String firstName,String lastName,String email,String Programme,List<String> course){
		
		StudentClass stu = new StudentClass();
		
				stu.setFirstName(firstName);
				stu.setLastName(lastName);
				stu.setEmail(email);
				stu.setProgramme(Programme);
				stu.setCourses(course);
				
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
				.when().body(stu).post().then();
	}
	
	@Step("Creating Student with firstName : {0}, lastName : {1}, email : {2}, Programme : {3}, course1 : {4}, course2 : {5} ")
	public ValidatableResponse createstudentusingobjmapp(String firstName,String lastName,String email,String Programme,List<String> courses) throws JsonProcessingException{
		
		pojofordata pojo = new pojofordata(firstName,lastName,email,Programme,courses);
		
			ObjectMapper ObjMap = new ObjectMapper();
			
			String mydata = ObjMap.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
				.when().body(mydata).post().then();
							
	}
	
	@Step("Creating Student with firstName : {0}, lastName : {1}, email : {2}, Programme : {3}, course1 : {4}, course2 : {5} ")
	public ValidatableResponse createstudentusingobjmappwithJSON(String firstName,String lastName,String email,List<String> courses) throws IOException{
		
		
		
			ObjectMapper ObjMap = new ObjectMapper();
				
			pojofordata mydata = ObjMap.readValue(new File ("src/test/resources/JSONs/studentdetails.json"), pojofordata.class);
			
			mydata.setFirstName(firstName);
			mydata.setLastName(lastName);
			mydata.setEmail(email);
		//	mydata.setProgramme(Programme);
			mydata.setCourses(courses);
			
			
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
				.when().body(mydata).post().then();
							
	}
	
	@Step(" Getting the Student with firstName : {0}")
	public HashMap<String,Object> GetStudentinfobyFirstname(String firstName){
		
		String p1="find{it.firstName=='";
		String p2="'}";
		
		
		System.out.println("newly added student is "+p1+firstName+p2);
		
		
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
				.when().get("/list").then().extract().path(p1+firstName+p2);
								
	}	
		
	@Step("Updating Student Information with Studentid : {0},firstName : {1}, lastName : {2}, email : {3}, Programme : {4}, courses : {5}")
	public ValidatableResponse updatestudent (int Studentid,String firstName,String lastName,String email,String Programme,List<String> courses){
		
		StudentClass stu = new StudentClass();
		
				stu.setFirstName(firstName);
				stu.setLastName(lastName);
				stu.setEmail(email);
				stu.setProgramme(Programme);
				stu.setCourses(courses);
				
				//Updating the Student information using put
			return	SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
				.when().body(stu).put("/"+Studentid).then().log().all();
						
	}
	
	@Step("Deleting newly added student with Studentid : {0}")
	public void Deletestudent (int Studentid){
		
		//Deleting the newly added/updated Student using delete()
		SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
		.when().delete("/"+Studentid);
						
	}
	
	@Step("Verify Status code using Deleted Studentid : {0}")
	public void verifystatuscodeusingdelstudentid (int Studentid){
		
		//Verifying deleted student is there or not(we will get 404 as response code if the student it not there)
		SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec()).log().all()
		.when().get("/"+Studentid).then().statusCode(406);	
						
	}
	
	@Step("Getting information of the student with ID: {0}")
	public ValidatableResponse getStudentByid(int studentId){
				
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec())
				//.log().all()
				.when().get("/"+studentId).then();
								
	}
	
	@Step(" Getting the Student with EmailId : {0}")
	public HashMap<String,Object> GetStudentinfobyEmailId(String email){
		
		String p1="findAll{it.email=='";
		String p2="'}.get(0)";
		
		//System.out.println();
		System.out.println("email id is ---------- "+p1+email+p2);
		
		
		return SerenityRest.given().spec(ReusableSpecifications.getGenReqSpec())
				//.log().all()
				.when().get("/list").then().extract().path(p1+email+p2);
								
	}



}
