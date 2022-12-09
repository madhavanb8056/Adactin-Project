package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.classes.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue = "com.adactin.stepdefenition",
monochrome = true ,
dryRun = false,
publish = true,
plugin = {"html:Report/rpe.html","pretty"}
	)

public class Adactin_Runner {
        
	public static WebDriver driver;
	
	@BeforeClass
	public static void start(){
		driver = Base_Class.browser_Launch("chrome");	//edge
		Base_Class.maximize(driver);
	}
	
	
    @AfterClass
    public static void end() throws InterruptedException {
    	 Thread.sleep(5000);
         driver.close();
         
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
