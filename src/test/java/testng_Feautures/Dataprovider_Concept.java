package testng_Feautures;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Dataprovider_Concept {

	@Test(dataProvider = "input")
	public void reservationForm(String firstname, String lastname) {

		System.out.println("First Name is  :" + firstname);

		System.out.println("Last Name is :" + lastname);

	}

	@DataProvider
	public Object[][] input() {
		return new Object[][] { { "sha", "basker" }, { "diya", "jenesh" } };

	}

}
