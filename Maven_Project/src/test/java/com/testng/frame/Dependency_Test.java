package com.testng.frame;

import org.testng.annotations.Test;

public class Dependency_Test {

	
	@Test(dependsOnMethods = "five")
	private void one() {
       System.out.println("one");
	}
	@Test
	private void two() {
       System.out.println("two");
	}
	@Test
	private void three() {
       System.out.println("three");
	}
	@Test(dependsOnMethods = "two")
    private void four() {
       System.out.println("four");
	}
	@Test
	private void five() {
       System.out.println("five");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
