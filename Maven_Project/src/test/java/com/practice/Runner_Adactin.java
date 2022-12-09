package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.classes.Base_Class;

public class Runner_Adactin extends Base_Class {

	
	public static void main(String[] args) throws InterruptedException {
		
		browser_Launch("chrome");
		maximize(driver);
		url(driver, "https://adactinhotelapp.com/index.php");
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		send_keys(username, "madhavan12345");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		send_keys(password, "Maddewfreekz@1");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id=\"login\"]"));
		click(loginbtn);
		
		WebElement location = driver.findElement(By.xpath("//select[@id=\"location\"]"));
		selectbyvalue(location, "Sydney");
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
		selectbyvalue(hotels, "Hotel Creek");
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@id=\"room_type\"]"));
		selectbyvalue(roomtype, "Standard");
		
		WebElement numberofrooms = driver.findElement(By.xpath("//select[@id=\"room_nos\"]"));
		selectbyvalue(numberofrooms, "2");
		
		WebElement checkindate = driver.findElement(By.xpath("//input[@id=\"datepick_in\"]"));
		send_keys(checkindate, "11/9/2022");
		
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@id=\"datepick_out\"]"));
		send_keys(checkoutdate, "15/9/2022");
		
		WebElement adultsperroom = driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		selectbyvalue(adultsperroom, "2");
		
		WebElement childperroom = driver.findElement(By.xpath("//select[@id=\"child_room\"]"));
		selectbyvalue(childperroom, "1");
		
		WebElement submitbtn = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
		actions_click(driver, submitbtn);
		
		WebElement select = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]"));
		click(select);
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		click(searchbtn);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		send_keys(firstname, "madhavan");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		send_keys(lastname, "b");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id=\"address\"]"));
		send_keys(address, "chennai");
		
		WebElement cardnumber = driver.findElement(By.xpath("//input[@id=\"cc_num\"]"));
		send_keys(cardnumber, "7894561237894561");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
		selectbyvalue(cardtype, "AMEX");
		
		WebElement expstartdate = driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"]"));
		selectbyvalue(expstartdate, "1");
		
		WebElement expyear = driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"]"));
		selectbyvalue(expyear, "2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id=\"cc_cvv\"]"));
	    send_keys(cvv, "456");
	    
	    WebElement booknowbtn = driver.findElement(By.xpath("//input[@id=\"book_now\"]"));
		click(booknowbtn);
		
		Thread.sleep(7000);
		
		WebElement logoutbtn = driver.findElement(By.xpath("//input[@id=\"logout\"]"));
		click(logoutbtn);
		
		Thread.sleep(2000);
		
		close(driver);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
