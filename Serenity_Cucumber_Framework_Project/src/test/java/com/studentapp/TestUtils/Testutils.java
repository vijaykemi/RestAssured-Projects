package com.studentapp.TestUtils;

import java.util.Random;

public class Testutils {
	
	public static String getRandownvalue(){
		
		Random rnd = new Random();
		
		int randomval = rnd.nextInt(100000);
		
		return Integer.toString(randomval);
	}

}
