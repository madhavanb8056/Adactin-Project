package com.adactin.stepdefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.adactin.runner.Adactin_Runner;
import com.base.classes.Base_Class;
import com.pom.adactin.Book_Hotel;
import com.pom.adactin.Login_page;
import com.pom.adactin.Search_Hotel;
import com.pom.adactin.Select_Hotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defenition extends Base_Class {
    
	public static WebDriver driver = Adactin_Runner.driver;
	public static Login_page login = new Login_page(driver);
	
	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url() {
        url(driver, "https://adactinhotelapp.com/index.php");
	}

	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {
         send_keys(login.getUser_Name(), "madhavan12345");
	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
         send_keys(login.getPassword(), "Maddewfreekz@1");
	}

	@Then("user Click The Login Button")
	public void user_click_the_login_button() {
          click(login.getLogin_Btn());
	}
    
	public static Search_Hotel search = new Search_Hotel(driver);
	
	@When("user Select The Location In Location Dropdown")
	public void user_select_the_location_in_location_dropdown() {
		selectbyvalue(search.getLocation(), "Sydney");
	}

	@When("user Select The Hotels In Hotels Dropdown")
	public void user_select_the_hotels_in_hotels_dropdown() {
		selectbyvalue(search.getHotels(), "Hotel Creek");
	}

	@When("user Select The Roomtype In Roomtype Dropdown")
	public void user_select_the_roomtype_in_roomtype_dropdown() {
		selectbyvalue(search.getRoomtype(), "Standard");
	}

	@When("user Select The Number Of Rooms In Number Of Room Dropdown")
	public void user_select_the_number_of_rooms_in_number_of_room_dropdown() {
		selectbyindex(search.getNumberofrooms(), 1);
	}

	@When("user Enter The Check In Date In Check In Date Field")
	public void user_enter_the_check_in_date_in_check_in_date_field() {
		send_keys(search.getCheckindate(), "8/12/2022");
	}

	@When("user Enter The Check Out Date In Chect Out Date Field")
	public void user_enter_the_check_out_date_in_chect_out_date_field() {
		send_keys(search.getCheckoutdate(), "12/12/2022");
	}

	@When("user Select The Adults Per Room In Adults Per Room Dropdown")
	public void user_select_the_adults_per_room_in_adults_per_room_dropdown() {
		selectbyindex(search.getAdultsperroom(), 1);
	}

	@When("user Select The Childrens Per Room In Childrens Per Room Dropdown")
	public void user_select_the_childrens_per_room_in_childrens_per_room_dropdown() {
		selectbyindex(search.getChildperroom(), 1);
	}

	@Then("user Click The Search Button")
	public void user_click_the_search_button() {
		click(search.getSearchbtn());
	}

	public static Select_Hotel select = new Select_Hotel(driver);
	
	@When("user Select The Option in Select Column")
	public void user_select_the_option_in_select_column() {
		click(select.getSelect());
	}

	@Then("user Click The Continue Button")
	public void user_click_the_continue_button() {
		click(select.getSearchbtn2());
	}

	public static Book_Hotel book = new Book_Hotel(driver);
	
	@When("user Enter The First Name In First Name Field")
	public void user_enter_the_first_name_in_first_name_field() {
		send_keys(book.getFirstname(), "Madhavan");
	}
	

	@When("user Enter The Last Name In Last Name Field")
	public void user_enter_the_last_name_in_last_name_field() {
		send_keys(book.getLastname(), "b");
	}

	@When("user Enter The Billing Address In Billing Address Field")
	public void user_enter_the_billing_address_in_billing_address_field() {
		send_keys(book.getAddress(), "chennai");
	}

	@When("user Enter The Credit Card No In Credit Card No Field")
	public void user_enter_the_credit_card_no_in_credit_card_no_field() {
		send_keys(book.getCardnumber(), "7894561237894561");
	}

	@When("user Select The Credit Card Type In Credit Card Type Dropdown")
	public void user_select_the_credit_card_type_in_credit_card_type_dropdown() {
		selectbyvalue(book.getCardtype(), "VISA");
	}

	@When("user Select The Expiry Month In Expiry Month Dropdown")
	public void user_select_the_expiry_month_in_expiry_month_dropdown() {
		selectbyindex(book.getExpstartdate(), 1);
	}

	@When("user Select The Expiry Year In Expiry Year Dropdown")
	public void user_select_the_expiry_year_in_expiry_year_dropdown() {
		selectbyvalue(book.getExpyear(), "2022");
	}

	@When("user Enter The Cvv Number In Cvv Number Field")
	public void user_enter_the_cvv_number_in_cvv_number_field() {
		send_keys(book.getCvv(), "123");
	}

	@Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		click(book.getBooknowbtn());
	}
	
	

	
	

}
