package testng_Feautures;

import org.testng.annotations.Test;

public class Expected_Exceptions_Concept {
	@Test(expectedExceptions = NumberFormatException.class)
	public void exceptions() {
		String s = "12@21";
		int value = Integer.parseInt(s);
		System.out.println(value);
		String valueof = String.valueOf(value);
		System.out.println(valueof);

	}

}
