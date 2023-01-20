package testng_Feautures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	@Test
	public void software_Testing() {
		
    System.out.println("Software Testing");

	}
	@Test@Ignore
	public void java() {
		System.out.println("Java");
	}
	@Test(enabled=false)
	public void selenium() {
		System.out.println("Selenium");
	}
	@Test
	public void project() {
		System.out.println("project");
	}
	
	@Test
	public void ipt_Class() {
		System.out.println("Ipt Class");
	}
	@Test
	public void placement() {
		System.out.println("Placement");
	}
}
	
	
