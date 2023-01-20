package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(id="location")	
	private WebElement	location;

	@FindBy(id="hotels")
	private WebElement	hotel;
	
	@FindBy(id="room_type")
	private WebElement	room;
	
	@FindBy(id="room_nos")
	private WebElement	roomNum;
	
	@FindBy(id="datepick_in")
	private WebElement	checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement	checkOut;
	
	@FindBy(id="adult_room")
	private WebElement	aduRoom;
	
	@FindBy(id="child_room")
	private WebElement	childrenRoom;
	
	@FindBy(id="Submit")
	private WebElement	serch;
		
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}
	
		
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNum() {
		return roomNum;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAduRoom() {
		return aduRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSerch() {
		return serch;
	}

	
		
	}




