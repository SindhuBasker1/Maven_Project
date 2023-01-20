package testng_Feautures;


import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
        @BeforeSuite
		public void testing() {
			System.out.println("Testing");
			}
	   @BeforeTest
		public void types_Of_Testing() {
			System.out.println("Manual Testing,Automation Testing");
		}
	   @BeforeClass
	   public void manual_Automation () {
			System.out.println("Functional,Non_Functional_Maintanence");
		}
	   @BeforeMethod
		public void Sotware_Testing_Levels() {
			System.out.println("Software Testing Levels");
		}
	   @Test(invocationCount=2)
		public void unit_Testing() {
	       System.out.println("Toolds,Junit,Nunit");
	       }
	    @Test(priority=-2)
		public void Integration_Testing() {
			System.out.println("Login Page,Mail Box,Delete emails");
	    }
	    @Test(priority=-3)
		public void System_Testing() {
			Set<String> set1 = new TreeSet<String>();
	        set1.add("Smoke Test");
			set1.add("Sanity Test");
			set1.add("Regression Test");
			set1.add("Black Box");
			set1.add("White Box");
			set1.add("User Acceptance Test");
			System.out.println(set1);
			}
	    @AfterMethod
		public void test_Scenario() {
	        System.out.println("Test Scenario");
		}
	   @AfterClass
	   public void test_Cases() {
	        System.out.println("Test Cases");
		}
	   @AfterTest
		public void verification_Validation() {
	       System.out.println("Verification Validation");
		}
	   @AfterSuite
		public void criteria() {
	       System.out.println("Criteria");
		}

	}

	 

