package com.testng.frame;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test
	private void one() {
       System.out.println("one");
	}
	@Test(priority = 1)
	private void two() {
       System.out.println("two");
	}
	@Test(priority = 0)
	private void three() {
       System.out.println("three");
	}
	@Test(priority = -1)
    private void four() {
       System.out.println("four");
	}
	@Test(priority = -2)
	private void five() {
       System.out.println("five");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
