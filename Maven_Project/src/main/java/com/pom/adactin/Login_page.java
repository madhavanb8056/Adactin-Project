package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id=\"username\"]")
	private WebElement user_Name;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id=\"login\"]")
	private WebElement login_Btn;

	
	
	
	
	public Login_page(WebDriver driver1) {
         this.driver = driver1;
         PageFactory.initElements(driver1, this);	 
	}

	public WebElement getUser_Name() {
		return user_Name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
