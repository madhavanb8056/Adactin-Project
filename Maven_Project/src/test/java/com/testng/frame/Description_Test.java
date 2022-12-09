package com.testng.frame;

import org.testng.annotations.Test;

public class Description_Test {


	@Test
	private void one() {
       System.out.println("one");
	}
	@Test(description = "its a second method")
	private void two() {
       System.out.println("two");
	}
	@Test(description = "its a third method")
	private void three() {
       System.out.println("three");
	}
	@Test(description = "its a fourth method")
    private void four() {
       System.out.println("four");
	}
	@Test(description = "its a fifth method")
	private void five() {
       System.out.println("five");
	}
	
}
