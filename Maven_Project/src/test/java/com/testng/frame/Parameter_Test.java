package com.testng.frame;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {

	
	
	@Test
	@Parameters({"username","password"})
	private void one(String a, int b) {
        System.out.println(a);
        System.out.println(b);
	}
	
	
	
	
	
	
	
	
}
