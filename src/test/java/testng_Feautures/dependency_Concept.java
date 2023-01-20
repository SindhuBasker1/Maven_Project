package testng_Feautures;

import org.testng.annotations.Test;

public class dependency_Concept {
	@Test
	public void methodOverloading() {
		System.out.println("Method_Overloading");
	}
	@Test
	public void abstraction() {
		System.out.println("Abstraction");
	}
	@Test(dependsOnMethods = "methodOverloading")
	
	public void polymorphism() {
		System.out.println("Polymorphism");
	}

}
