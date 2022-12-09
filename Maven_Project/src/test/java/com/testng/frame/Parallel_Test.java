package com.testng.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	
	@Test
	private void adactin() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://adactinhotelapp.com/SearchHotel.php");
	
	}
	
	@Test
	private void fb() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
