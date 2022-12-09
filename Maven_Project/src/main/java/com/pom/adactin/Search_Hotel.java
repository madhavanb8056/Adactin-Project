package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id=\"location\"]")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id=\"hotels\"]")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id=\"room_nos\"]")
	private WebElement numberofrooms;
	
	@FindBy(xpath = "//input[@id=\"datepick_in\"]")
	private WebElement checkindate;
	
	@FindBy(xpath = "//input[@id=\"datepick_out\"]")
	private WebElement checkoutdate;
	
	@FindBy(xpath = "//select[@id=\"adult_room\"]")
	private WebElement adultsperroom;
	
	@FindBy(xpath = "//select[@id=\"child_room\"]")
	private WebElement childperroom;
	
	@FindBy(xpath = "//input[@id=\"Submit\"]")
	private WebElement searchbtn;

	public Search_Hotel(WebDriver driver2) {
           this.driver = driver2;
           PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
