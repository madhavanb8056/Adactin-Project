package com.testng.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Test {

	
	@Test
	private void adactin_chrome() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://adactinhotelapp.com/SearchHotel.php");
	
	}
	@Test
	private void amazon_edge() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/"); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
