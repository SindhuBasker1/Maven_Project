package testng_Feautures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Analyser_Concept {

	@Test
	public void phonenumber() {
		int exp = 123456789;
		int act = 123456789;
		Assert.assertEquals(exp, act);
	}

	@Test(retryAnalyzer = Rerun.class)
	public void fullname() {
		String exp = "Manishabasker";
		String act = "Mathijenesh";
		Assert.assertEquals(exp, act);
	}

}
