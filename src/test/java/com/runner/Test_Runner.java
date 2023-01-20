package com.runner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature",glue="com.stepdefinition",plugin= {"html:Reports"})

public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		driver=Baseclass.browserLaunch("chrome");
	
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
		
	}
	
	

}
