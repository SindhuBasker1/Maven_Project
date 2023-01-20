package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {
public WebDriver driver;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement	LogOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogOut() {
		return LogOut;
	}
	

	public Log_Out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}
}
