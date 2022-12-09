package com.adactin1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Adactin_practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/SearchHotel.php");

		WebElement loginid = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		loginid.sendKeys("madhavan12345");

		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("Maddewfreekz@1");

		WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"login\"]"));
		loginbtn.click();

		WebElement location = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select s = new Select(location);
		s.selectByVisibleText("Melbourne");

		WebElement hotel = driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");

		WebElement room = driver.findElement(By.xpath("//select[@id=\"room_type\"]"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Super Deluxe");

		WebElement room_nos = driver.findElement(By.xpath("//select[@id=\"room_nos\"]"));
		Select s3 = new Select(room_nos);
		s3.selectByValue("3");

		WebElement datein = driver.findElement(By.xpath("//input[@id=\"datepick_in\"]"));
		datein.sendKeys("20/10/2022");

		WebElement dateout = driver.findElement(By.xpath("//input[@id=\"datepick_out\"]"));
		dateout.sendKeys("21/10/2022");

		WebElement apr = driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		Select s4 = new Select(apr);
		s4.selectByValue("3");

		WebElement cpr = driver.findElement(By.xpath("//select[@id=\"child_room\"]"));
		Select s5 = new Select(cpr);
		s5.selectByValue("2");

		WebElement search = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
		search.click();

		WebElement oo = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		oo.click();

		WebElement cont = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		cont.click();

		WebElement first = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		first.sendKeys("Madhavan");

		WebElement last = driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		last.sendKeys("maddy");

		WebElement adress = driver.findElement(By.xpath("//textarea[@id=\"address\"]"));
		adress.sendKeys("12a velayutham nagar");

		WebElement card = driver.findElement(By.xpath("//input[@id=\"cc_num\"]"));
		card.sendKeys("1234567891234567");

		WebElement cartyp = driver.findElement(By.xpath("//select[@class=\"select_combobox\"]"));
		Select s6 = new Select(cartyp);
		s6.selectByVisibleText("VISA");

		WebElement startdate = driver.findElement(By.xpath("//select[@class=\"select_combobox2\"]"));
		Select s7 = new Select(startdate);
		s7.selectByValue("3");

		WebElement enddate = driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"]"));
		Select s8 = new Select(enddate);
		s8.selectByValue("2016");

		WebElement cvv = driver.findElement(By.xpath("//input[@id=\"cc_cvv\"]"));
		cvv.sendKeys("123");

		WebElement booknow = driver.findElement(By.xpath("//input[@id=\"book_now\"]"));
		booknow.click();
        
		Thread.sleep(6000);
		
		WebElement logout = driver.findElement(By.xpath("//input[@id=\"logout\"]"));
		logout.click();
		
		
	}

}
