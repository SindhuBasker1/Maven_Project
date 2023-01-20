package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement FirstName;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditCard() {
		return CreditCard;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getSelMonth() {
		return SelMonth;
	}
	public WebElement getSelYear() {
		return SelYear;
	}
	public WebElement getCVVNum() {
		return CVVNum;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy (id="cc_num")
	private WebElement CreditCard;
	@FindBy(id="cc_type")
	private WebElement CardType;
	@FindBy(id="cc_exp_month")
	private WebElement SelMonth;
	@FindBy(id="cc_exp_year")
	private WebElement SelYear;
	@FindBy(id="cc_cvv")
    private WebElement CVVNum;
	@FindBy(id="book_now")
    private WebElement BookNow;
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	

}
