package com.Pom;

import org.openqa.selenium.WebDriver;

import Page_Object_Model.Book_Hotel;
import Page_Object_Model.Log_Out;
import Page_Object_Model.Login_Page;
import Page_Object_Model.Search_Hotel;
import Page_Object_Model.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;
	private Login_Page lp;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Login_Page getInstanceLogin() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}

		return lp;

	}

	private Search_Hotel sh;

	public Search_Hotel getInstanceSearch() {
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	private Select_Hotel se;

	public Select_Hotel getInstanceSelect() {
		if (se == null) {
			se = new Select_Hotel(driver);
		}
		return se;
	}

	private Book_Hotel bh;

	public Book_Hotel getInstanceBook() {
		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	private Log_Out lg;

	public Log_Out getInstanceLogout() {
		if (lg == null) {
			lg = new Log_Out(driver);
		}
		return lg;
	}

}
