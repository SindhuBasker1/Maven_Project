package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
		
	
	public static WebDriver driver;
	public static Select s;
	
		
	
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
				+"\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+
				"\\Driver\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	else if (browsername.equalsIgnoreCase("internet explorer")) {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+
				"\\Driver\\chromedriver.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
		return driver;
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);
		
	}
	public static void closeTab(){
		driver.close();
		
	}
	public static void terminateBrowser() {
		driver.quit();
		
	}
	public static void passInput(WebElement element,String input) {
		element.sendKeys(input);
		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
		
	}
	public static void clearofElement(WebElement element) {
		element.clear();
		
	}
	public static void selectByIndex(WebElement element ,int i) {
		s=new Select(element);
		s.selectByIndex(i);
		
	}
	public static void selectByValue(WebElement element ,String value) {
		s=new Select(element);
		s.selectByValue(value);
		
	}
	public static void selectByVisibleText(WebElement element ,String text) {
		s=new Select(element);
		s.selectByVisibleText(text);
		
	}
	public static void takeScreenshot(String folderPath)throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(folderPath);
		FileUtils.copyFile(src,dest);
		
	}
	public static void mouseActions(int buttons) throws AWTException{
		Robot rob = new Robot();
		rob.mousePress(buttons);
		rob.mouseRelease(buttons);
		
		
	}
	public static void keyPress(int keycode) throws AWTException{
		Robot rob = new Robot();
		rob.keyPress(keycode);
		
		}
		public static void keyRelease(int keycode) throws AWTException{
			Robot rob = new Robot();
			rob.keyRelease(keycode);{
			
			}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		

}
}
