package com.testng.frame;

import org.testng.annotations.Test;

public class Expectedexception_Test {

	@Test(expectedExceptions = StringIndexOutOfBoundsException.class) // failed
	private void one() {
        throw new IndexOutOfBoundsException();
	}
	@Test(expectedExceptions = StringIndexOutOfBoundsException.class) // passed
	private void two() {
        throw new StringIndexOutOfBoundsException();
	}
	@Test
	private void three() {
       System.out.println("three");
	}
	
	
	
	
	
	
}
