package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Maven_Project.Baseclass;
import com.Pom.Page_Object_Manager;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass {
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	@Given("^user Must Launch \"([^\"]*)\"$")
	public void user_Must_Launch(String url) throws Throwable {
		 urlLaunch(url);
	}

	@When("^user Enter The \"([^\"]*)\"In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		 passInput(pom.getInstanceLogin().getUsername(), username); 
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		passInput(pom.getInstanceLogin().getPassword(), password);
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
		}
	@When("^user Select Location As In Location Dropdown$")
	public void user_Select_Location_As_In_Location_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getLocation(), ("London"));
		}

	@When("^user Select Hotel As In Hotel Dropdown$")
	public void user_Select_Hotel_As_In_Hotel_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getHotel(), ("Hotel Sunshine"));
	}

	@When("^user Select Room Type As In Room Type Dropdown$")
	public void user_Select_Room_Type_As_In_Room_Type_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getRoom(), ("Super Deluxe"));
	}

	@When("^user Select Number Of Rooms As In Dropdown$")
	public void user_Select_Number_Of_Rooms_As_In_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getRoomNum(), ("3-Three"));
	}

	@When("^user Enter Checkin Date Later Than The Checkout Date Field As In Textbox$")
	public void user_Enter_Checkin_Date_Later_Than_The_Checkout_Date_Field_As_In_Textbox() throws Throwable {
		passInput(pom.getInstanceSearch().getCheckIn(), ("11/07/2017"));
		passInput(pom.getInstanceSearch().getCheckOut(), ("12/07/2017"));
	}

	@When("^user Select Number Of Adults As In Dropdown$")
	public void user_Select_Number_Of_Adults_As_In_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getAduRoom(), ("2-Two"));
	}

	@When("^user Select Number Of Children As In Dropdown$")
	public void user_Select_Number_Of_Children_As_In_Dropdown() throws Throwable {
		passInput(pom.getInstanceSearch().getChildrenRoom(), ("2-Two"));  
	}

	@Then("^user Click On Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSerch());
	}

	@When("^user Select The Hotel For Using Radiobutton$")
	public void user_Select_The_Hotel_For_Using_Radiobutton() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getSelect());
		}

	@Then("^user Click On Continue Button And It Navigate To The Book A HotelPage$")
	public void user_Click_On_Continue_Button_And_It_Navigate_To_The_Book_A_HotelPage() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getContinue());
	}

	@When("^user Enter Your First Name In The  First Name Textbox$")
	public void user_Enter_Your_First_Name_In_The_First_Name_Textbox() throws Throwable {
		passInput(pom.getInstanceBook().getFirstName(), ("SINDHU"));
	}

	@When("^user Enter Your Last Name In The Last Name Textbox$")
	public void user_Enter_Your_Last_Name_In_The_Last_Name_Textbox() throws Throwable {
		passInput(pom.getInstanceBook().getLastName(), ("BASKER"));
	}

	@When("^user Enter Your AddresssIn The Billing Address TextBox$")
	public void user_Enter_Your_AddresssIn_The_Billing_Address_TextBox() throws Throwable {
		passInput(pom.getInstanceBook().getAddress(), ("7\312, Main Road, Kavalkinaru, Tirunelveli"));
	}

	@When("^user Enter Your Credit Card Number In The Credit Card Textbox$")
	public void user_Enter_Your_Credit_Card_Number_In_The_Credit_Card_Textbox() throws Throwable {
		passInput(pom.getInstanceBook().getCreditCard(), ("1234567890123456"));   
	}

	@When("^user Select Your Credit Card Type In The Credit Card Type Dropdown$")
	public void user_Select_Your_Credit_Card_Type_In_The_Credit_Card_Type_Dropdown() throws Throwable {
		selectByVisibleText(pom.getInstanceBook().getCardType(), ("VISA")); 
	}

	@When("^user Select Credit Card Expiry Month And Expiry Year In Expiry Date Dropdown$")
	public void user_Select_Credit_Card_Expiry_Month_And_Expiry_Year_In_Expiry_Date_Dropdown() throws Throwable {
		selectByVisibleText(pom.getInstanceBook().getSelMonth(), ("May"));
		selectByValue(pom.getInstanceBook().getSelYear(), ("2015"));
	}

	@When("^user Enter Your CVV Number As In CVV Number Textbox$")
	public void user_Enter_Your_CVV_Number_As_In_CVV_Number_Textbox() throws Throwable {
		passInput(pom.getInstanceBook().getCVVNum(), ("1234"));
	}

	@Then("^user Click On Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Click_On_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getInstanceBook().getBookNow());  
	}

	@When("^Screenshot Will Be Taken$")
	public void screenshot_Will_Be_Taken() throws Throwable {
		takeScreenshot("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\pom.png");
	         
	}

	@Then("^User Click On Logout Button And It Navigate To The Logout Page$")
	public void user_Click_On_Logout_Button_And_It_Navigate_To_The_Logout_Page() throws Throwable {
		 clickOnElement(pom.getInstanceLogout().getLogOut());
	       
	}



}
