package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Pom.Page_Object_Manager;


import Page_Object_Model.Book_Hotel;
import Page_Object_Model.Log_Out;
import Page_Object_Model.Login_Page;
import Page_Object_Model.Search_Hotel;
import Page_Object_Model.Select_Hotel;

public class RunnerClass extends Baseclass {
	public static WebDriver driver = browserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws IOException {
	
	    urlLaunch("http://adactinhotelapp.com/");
        passInput(pom.getInstanceLogin().getUsername(), "SINDHUBASKER");
        passInput(pom.getInstanceLogin().getPassword(), "Sindhu");
		clickOnElement(pom.getInstanceLogin().getLogin());

		
		passInput(pom.getInstanceSearch().getLocation(), ("London"));
		passInput(pom.getInstanceSearch().getHotel(), ("Hotel Sunshine"));
		passInput(pom.getInstanceSearch().getRoom(), ("Super Deluxe"));
		passInput(pom.getInstanceSearch().getRoomNum(), ("3-Three"));
		passInput(pom.getInstanceSearch().getCheckIn(), ("11/07/2017"));
		passInput(pom.getInstanceSearch().getCheckOut(), ("12/07/2017"));
		passInput(pom.getInstanceSearch().getAduRoom(), ("2-Two"));
		passInput(pom.getInstanceSearch().getChildrenRoom(), ("2-Two"));
		clickOnElement(pom.getInstanceSearch().getSerch());

	    clickOnElement(pom.getInstanceSelect().getSelect());
		clickOnElement(pom.getInstanceSelect().getContinue());

	    passInput(pom.getInstanceBook().getFirstName(), ("SINDHU"));
		passInput(pom.getInstanceBook().getLastName(), ("BASKER"));
		passInput(pom.getInstanceBook().getAddress(), ("7\312, Main Road, Kavalkinaru, Tirunelveli"));
		passInput(pom.getInstanceBook().getCreditCard(), ("1234567890123456"));
		selectByVisibleText(pom.getInstanceBook().getCardType(), ("VISA"));
		selectByVisibleText(pom.getInstanceBook().getSelMonth(), ("May"));
		selectByValue(pom.getInstanceBook().getSelYear(), ("2015"));
		passInput(pom.getInstanceBook().getCVVNum(), ("1234"));
		clickOnElement(pom.getInstanceBook().getBookNow());
		
       takeScreenshot("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\pom.png");
       
       clickOnElement(pom.getInstanceLogout().getLogOut());
       
        closeTab();

	}

}
	
		
	

		
	

	
		



