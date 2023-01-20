package testng_Feautures;

import org.testng.annotations.Test;

public class Grouping_Concept {
	@Test(groups = "Shopping Mall")
	public void phoenix_Marketcity() {
		System.out.println("Phoenix Marketcity");
	}

	@Test(groups = "Shopping Mall")
	public void spencer_Plaza() {
		System.out.println("Spencer Plaza");
	}

	@Test(groups = "Shopping Mall")
	public void alsa_Mall() {
		System.out.println("Alsa Mall");
	}

	@Test(groups = "IT Companies")
	public void capgemini() {
		System.out.println("Capgemini");
	}

	@Test(groups = "IT Companies")
	public void zoho() {
		System.out.println("Zoho");
	}

	@Test(groups = "IT Companies")
	public void ust_Global() {
		System.out.println("UST Global");
	}

	@Test(groups = "Best Cafes")
	public void ciclo() {
		System.out.println("ciclo");
	}

	@Test(groups = "Best Cafes")
	public void starbucks() {
		System.out.println("starbucks");
	}

	@Test(groups = "Best Cafes")
	public void cappuccino() {
		System.out.println("cappuccino");
	}

}
