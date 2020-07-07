package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirsttestNGTest {
	
	@Test(priority=1,description="This test case will login to account")
	public void loginApplication() {
		
		System.out.println("This is my first testNG class");
		
		Assert.assertEquals(20, 20);
	}
	
	@Test(priority=2,description="This test case will select item")
	public void selectItems() {
		
		System.out.println("This is my second testNG class");
	}
	
	@Test(priority=3,description="This test case will select dates")
	public void selectDates() {
		
		System.out.println("This is my third testNG class");
	}

}
