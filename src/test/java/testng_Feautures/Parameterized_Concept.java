package testng_Feautures;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	@Test
	@Parameters({ "firstname", "lastname" })

	public void reservationForm( String firstname, String lastname) {

		System.out.println("First Name is  :" + firstname);

		System.out.println("Last Name is :" + lastname);

	}

}
