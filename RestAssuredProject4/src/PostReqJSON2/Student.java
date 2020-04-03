package PostReqJSON2;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public String firstName;
	public String lastName;
	public String email;
	public String programme;
	public List<courses> curs;
	
	
	public Student(String firstName,String lastName,String email,String programme){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.programme=programme;
		curs = new ArrayList<courses>(); 
		
		
		
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getProgramme() {
		return programme;
	}


	public void setProgramme(String programme) {
		this.programme = programme;
	}


	public List<courses> getCurs() {
		return curs;
	}


	public void setCurs(List<courses> curs) {
		this.curs = curs;
	}


	public void addcourse(String name, String score) {
		curs.add(new courses(name, score));
	}



	
	
	
}