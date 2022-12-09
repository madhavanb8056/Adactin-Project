package com.adactin1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_practice2 {

	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");
		
		WebDriver mad = new ChromeDriver();
		
		mad.manage().window().maximize();
		
		mad.get("https://adactinhotelapp.com/index.php");
		
		
		WebElement login = mad.findElement(By.xpath("//input[@name=\"username\"]"));
		login.sendKeys("madhavan12345");
		
		WebElement pass = mad.findElement(By.xpath("//input[@name=\"password\"]"));
		pass.sendKeys("Maddewfreekz@1");
		
		WebElement loginbtn = mad.findElement(By.xpath("//input[@id=\"login\"]"));
		loginbtn.click();
		
		
		WebElement loc= mad.findElement(By.xpath("//select[@name=\"location\"]"));
	    Select q1 = new Select(loc);
	    q1.selectByVisibleText("Paris");
		
	    WebElement hot = mad.findElement(By.xpath("//select[@name=\"hotels\"]"));
	    Select q2 = new Select(hot);
	    q2.selectByVisibleText("Hotel Hervey");
	    
	    WebElement room = mad.findElement(By.xpath("//select[@name=\"room_type\"]"));
	    Select q3 = new Select(room);
	    q3.selectByVisibleText("Deluxe");
		
		WebElement roomnos = mad.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select q4 = new Select(roomnos);
		q4.selectByVisibleText("3 - Three");
		
		WebElement checkin = mad.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
		checkin.sendKeys("26/10/2022");
		
		WebElement checkout = mad.findElement(By.xpath("//input[@name=\"datepick_out\"]"));
		checkout.sendKeys("30/10/2022");
		
		WebElement adults = mad.findElement(By.xpath("//select[@name=\"adult_room\"]"));
		Select q5 = new Select(adults);
		q5.selectByVisibleText("3 - Three");
				
		WebElement child = mad.findElement(By.xpath("//select[@name=\"child_room\"]"));
		Select q6 = new Select(child);
		q6.selectByVisibleText("2 - Two");
		
		WebElement submit = mad.findElement(By.xpath("//input[@name=\"Submit\"]"));
		submit.click();
		
		WebElement clic = mad.findElement(By.xpath("//input[@name=\"radiobutton_0\"]"));
		clic.click();
		
		WebElement count = mad.findElement(By.xpath("//input[@name=\"continue\"]"));
		count.click();
		
		WebElement first = mad.findElement(By.xpath("//input[@name=\"first_name\"]"));
		first.sendKeys("maddy");
		
		WebElement last = mad.findElement(By.xpath("//input[@name=\"last_name\"]"));
		last.sendKeys("b");
		
		WebElement add = mad.findElement(By.xpath("//textarea[@name=\"address\"]"));
		add.sendKeys("12a");
		
		WebElement card = mad.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		card.sendKeys("1234567891234564");
		
		WebElement typ = mad.findElement(By.xpath("//select[@name=\"cc_type\"]"));
		Select q7 = new Select(typ);
		q7.selectByVisibleText("Master Card");
		
		WebElement start = mad.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		Select q8 = new Select(start);
		q8.selectByVisibleText("March");
		
		WebElement end = mad.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		Select q9 = new Select(end);
		q9.selectByVisibleText("2014");
		
		WebElement cvv = mad.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
		cvv.sendKeys("741");
		
		WebElement book = mad.findElement(By.xpath("//input[@name=\"book_now\"]"));
		book.click();
		
		Thread.sleep(7000);
		
		WebElement logout = mad.findElement(By.xpath("//input[@name=\"logout\"]"));
		logout.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) mad;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File out = new File("C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\screenshot\\adactinTs.png");
		FileUtils.copyFile(screenshotAs, out);
		
		
		Robot ref = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(screenSize);
		BufferedImage createScreenCapture = ref.createScreenCapture(rec);
		File des = new File("C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\screenshot\\adactinrobot.png");
		ImageIO.write(createScreenCapture, "png", des);
		
		
		
		
		
	}
	
	
	
	
	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
}
