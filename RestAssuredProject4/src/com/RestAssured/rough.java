package com.RestAssured;

import java.io.FileInputStream;
import java.util.Properties;


public class rough {

	public static void main(String[] args) throws Exception {
		
		Properties config = null;
		Properties OR = null;
	//	WebDriver driver = null;
		
		config = new Properties();
		FileInputStream fn = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\Config\\config.properties");
		config.load(fn);
		// OR property file
		OR = new Properties();
		fn = new FileInputStream(System.getProperty("user.dir") + "\\src\\Config\\OR.properties");
		OR.load(fn);
	}
	
}