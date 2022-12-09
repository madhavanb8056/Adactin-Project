package com.testng.frame;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Annotation {

	@BeforeSuite
	private void eat() {
		System.out.println("BS");
	}

	@BeforeTest
	private void dog() {
		System.out.println("BT");
	}
	
	@BeforeClass
    private void cat() {
		System.out.println("BC");
	}

	@BeforeMethod
	private void ball() {
		System.out.println("BM");
	}

	@Test
	private void AND() {
		System.out.println("Test");
	}
	
	@Test
	private void glass() {
		System.out.println("Test2");

	}

	@AfterMethod
	private void fly() {
		System.out.println("AM");
	}

	@AfterClass
	private void gate() {
		System.out.println("AC");
	}

	@AfterTest
	private void hall() {
		System.out.println("AT");
	}

	@AfterSuite
	private void ice() {
		System.out.println("AS");
	}

}
