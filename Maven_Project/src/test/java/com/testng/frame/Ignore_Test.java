package com.testng.frame;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {

	@Ignore    //testng annotation
	@Test
	private void one() {
       System.out.println("one");
	}
	@Test(enabled = false)
	private void two() {
       System.out.println("two");
	}
	
	@Test
	private void three() {
       System.out.println("three");
	}
	@Test
    private void four() {
       System.out.println("four");
	}
	
} 

