package com.edge.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Practice{

	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/"); 
		
		WebElement deals = driver.findElement(By.xpath("//a[@class=\"nav-a  \"][3]"));
		deals.click();
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
