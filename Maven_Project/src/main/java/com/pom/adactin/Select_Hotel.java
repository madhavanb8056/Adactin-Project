package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
    
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id=\"radiobutton_0\"]")
	private WebElement select;
	
	@FindBy(xpath = "//input[@id=\"continue\"]")
	private WebElement searchbtn2;

	
	
	
	public Select_Hotel(WebDriver driver3) {
         this.driver = driver3;  
         PageFactory.initElements(driver3, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getSearchbtn2() {
		return searchbtn2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
