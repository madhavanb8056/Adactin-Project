package com.testng.frame;

import org.testng.annotations.Test;

public class Invocationcount_Test {

	@Test
	private void one() {
		System.out.println("one");
	}

	@Test(invocationCount = 2)
	private void two() {
		System.out.println("two");
	}

	@Test(invocationCount = 3)
	private void three() {
		System.out.println("three");
	}

	@Test(invocationCount = 4)
	private void four() {
		System.out.println("four");
	}

	@Test(invocationCount = 5)
	private void five() {
		System.out.println("five");
	}
}
