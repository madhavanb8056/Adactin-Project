package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.classes.Base_Class;

public class Runner_Class extends Base_Class {
    
	public static WebDriver driver;
	
	public static void main(String[] args) {
	     
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");
        
		driver = new ChromeDriver();
		
    
	url(driver, "https://adactinhotelapp.com/index.php");
		
    maximize(driver);
    
    // page 1
    Login_page login = new Login_page(driver);
    
    send_keys(login.getUser_Name(), "madhavan12345");
    
    send_keys(login.getPassword(), "Maddewfreekz@1");
    
    click(login.getLogin_Btn());
    
    
    // page 2
    Search_Hotel search = new Search_Hotel(driver);
    
    selectbyvalue(search.getLocation(), "Sydney");
    
    selectbyvalue(search.getHotels(), "Hotel Creek");
    
    selectbyvalue(search.getRoomtype(), "Standard" );
    
    selectbyvalue(search.getNumberofrooms(), "2");
    
    send_keys(search.getCheckindate(), "11/9/2022");
    
    send_keys(search.getCheckoutdate(), "15/9/2022");
    
    selectbyvalue(search.getAdultsperroom(), "2");
    
    selectbyvalue(search.getChildperroom(), "1");
    
    click(search.getSearchbtn());
    
    
    // page 3
    Select_Hotel select = new Select_Hotel(driver);
    
    click(select.getSelect());
    
    click(select.getSearchbtn2());
    
    
    // page 4
    Book_Hotel book = new Book_Hotel(driver);
    
    send_keys(book.getFirstname(), "madhavan");
    
    send_keys(book.getLastname(), "b");
    
    send_keys(book.getAddress(), "chennai");
    
    send_keys(book.getCardnumber(), "7894561237894561");
    
    selectbyvalue(book.getCardtype(), "AMEX");
    
    selectbyvalue(book.getExpstartdate(), "1");
    
    selectbyvalue(book.getExpyear(), "2022");
    
    send_keys(book.getCvv(), "456");
    
    click(book.getBooknowbtn());
    		
	}
	
}
