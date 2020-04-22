package com.studentapp.model;

import java.util.List;



public class pojofordataarchive {
	
    private String firstName;

    private String lastName;

    private String email;

    private String programme;

    private List<String> courses;
    
    public pojofordataarchive(String FirstName,String lastName,String email,String programme,List<String> courses){
    
    	this.firstName=FirstName;
    	this.lastName=lastName;
    	this.email=email;
    	this.programme=programme;
    	this.courses=courses;
    	
    	
    }
    //introducing dummy constructor remove this constructor if we are running without JSON
    public pojofordataarchive(){

    }
    
    
	public List<String> getCourses() {
		return courses;
	}



	public void setCourses(List<String> string) {
		this.courses = string;
	}


	public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setProgramme(String programme){
        this.programme = programme;
    }
    
    public String getProgramme(){
        return this.programme;
    }
    

}

