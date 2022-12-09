package com.testng.frame;

import org.testng.annotations.Test;

public class Group_Test {

	
	@Test(groups = "odd")
	private void one() {
       System.out.println("one");
	}
	@Test(groups = "even")
	private void two() {
       System.out.println("two");
	}
	@Test(groups = "odd")
	private void three() {
       System.out.println("three");
	}
	@Test(groups = "even")
    private void four() {
       System.out.println("four");
	}
	@Test(groups = "odd")
	private void five() {
       System.out.println("five");
	}
	@Test(groups = "decimal")
	private void six() {
        System.out.println("6.6");
	}
	@Test(groups = "decimal")
	private void seven() {
        System.out.println("7.3");
	}
	
	
	
	
	
	
	
	
	
}
