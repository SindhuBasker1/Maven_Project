package testng_Feautures;

import org.testng.annotations.Test;

public class Timeout_Concepts {
    @Test(timeOut=7000)
	public void foodOrder() throws InterruptedException {
    	Thread.sleep(1000);
    	System.out.println("Open the Website");
    	
    	Thread.sleep(2000);
    	System.out.println("Search your Menu List");
    	
    	Thread.sleep(2000);
    	System.out.println("Select your Food");
    	
    	Thread.sleep(1000);
    	System.out.println("Pay the Money");
    	
    	Thread.sleep(2000);
    	System.out.println("Free delivery or Cash on delivery");
    	
    	Thread.sleep(1000);
    	System.out.println("Review");
    	

}
}
