Feature: Validate A Hotel Booking Functionality In Hotel Booking Application
@st1
Scenario: Login Page
Given user Launch The Adactin Url
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button
@st2
Scenario: Search Hotel
When user Select The Location In Location Dropdown
And user Select The Hotels In Hotels Dropdown
And user Select The Roomtype In Roomtype Dropdown
And user Select The Number Of Rooms In Number Of Room Dropdown
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Chect Out Date Field
And user Select The Adults Per Room In Adults Per Room Dropdown
And user Select The Childrens Per Room In Childrens Per Room Dropdown
Then user Click The Search Button
@st3
Scenario: Select Hotel
When user Select The Option in Select Column
Then user Click The Continue Button
@st4
Scenario: Book A Hotel
When user Enter The First Name In First Name Field 
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Select The Credit Card Type In Credit Card Type Dropdown
And user Select The Expiry Month In Expiry Month Dropdown
And user Select The Expiry Year In Expiry Year Dropdown
And user Enter The Cvv Number In Cvv Number Field
Then user Click The Book Now Button
@st5
Scenario: Booking Confirmation
Then user Click The Logout Button