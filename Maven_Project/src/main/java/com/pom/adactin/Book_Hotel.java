package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id=\"address\"]")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id=\"cc_num\"]")
	private WebElement cardnumber;
	
	@FindBy(xpath = "//select[@id=\"cc_type\"]")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@id=\"cc_exp_month\"]")
	private WebElement expstartdate;
	
	@FindBy(xpath = "//select[@id=\"cc_exp_year\"]" )
	private WebElement expyear;
	
	@FindBy(xpath = "//input[@id=\"cc_cvv\"]")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@id=\"book_now\"]")
	private WebElement booknowbtn;
	
	
	
	public Book_Hotel(WebDriver driver4) {
         this.driver = driver4;
         PageFactory.initElements(driver4, this);         
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpstartdate() {
		return expstartdate;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknowbtn() {
		return booknowbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
