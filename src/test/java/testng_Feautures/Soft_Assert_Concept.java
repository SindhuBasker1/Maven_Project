package testng_Feautures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	@Test
	public void eample1() {
		int a = 123;
		int b = 321;
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, b);
		System.out.println("Process Completed");

	}

}
