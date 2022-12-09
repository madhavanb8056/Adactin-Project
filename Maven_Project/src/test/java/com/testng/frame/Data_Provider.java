package com.testng.frame;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	
	
	@Test(dataProvider = "provider")
	private void data(String mail, int pass) {
     System.out.println("mail Id : "+ mail);
		System.out.println("pass : "+ pass);
	}
	@DataProvider
	private Object[][] provider() {
       
		return new Object[][] {
			{"maddy@123", 123},
			{"mani@123",234}			
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
