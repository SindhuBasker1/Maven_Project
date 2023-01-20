package testng_Feautures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

	@Test
	public void example() {
		int a = 123;
		int b = 321;
		Assert.assertEquals(a, b);
		System.out.println("Process Completed");

	}

}
