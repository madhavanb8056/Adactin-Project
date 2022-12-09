package com.automation.practive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");

		WebDriver auto = new ChromeDriver();
		

		auto.manage().window().maximize();

		auto.get("http://automationpractice.com/index.php");
		
		auto.manage().window().minimize();

		WebElement women = auto.findElement(By.xpath("//a[@title=\"Women\"]"));
		women.click();
		Thread.sleep(7000);

		WebElement img = auto.findElement(By.xpath("(//a[@title=\"Faded Short Sleeve T-shirts\"])[1]"));
		img.click();
		Thread.sleep(7000);
		WebElement add = auto.findElement(By.xpath("//button[@name=\"Submit\"]"));
		add.click();

	}

}
