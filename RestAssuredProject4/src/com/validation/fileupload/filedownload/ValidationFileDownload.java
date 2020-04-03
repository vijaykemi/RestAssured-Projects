package com.validation.fileupload.filedownload;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.testng.annotations.Test;
public class ValidationFileDownload {

@Test()
	
	public void FileDownload() {
	
	//File inputfile = new File (System.getProperty("user.dir")+File.separator+"DisableMonitor-G1.92.zip");
	
	File inputfile = new File ("C:\\Users\\vijay\\Desktop\\Desktop\\Vijay\\Selenium\\Rest Assured\\File_Download_Validation\\DisableMonitor-G1.92.zip");
	int expectedvalue = (int) inputfile.length();
	
	System.out.println("Expected Value : " + expectedvalue);
	
	byte[]actualvalue = given().get("https://github.com/Eun/DisableMonitor/releases/download/G1.92/DisableMonitor-G1.92.zip")
	.then().extract().asByteArray();
	
	System.out.println("actual Value : " + actualvalue.length);
	
	assertThat(expectedvalue,equalTo(actualvalue.length));
}
	
}
