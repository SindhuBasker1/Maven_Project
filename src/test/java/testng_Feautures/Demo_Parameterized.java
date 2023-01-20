package testng_Feautures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo_Parameterized {
	
	@Test
	@Parameters({ "phonenumber", "emailaddress" })

	public void reservationForm( String phonenumber, String emailaddress) {

		System.out.println("Phone Number is  :" + phonenumber);

		System.out.println("Email Address is :" + emailaddress);


}
}
