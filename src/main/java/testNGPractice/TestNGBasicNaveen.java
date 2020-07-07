package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicNaveen {
	
	//the purpose of @before
	//Pre conditions -- starting with @Before
	 
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login method");
	}
	
	//test cases -- starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	//after my test condition is done i want
	//post conditions -- starting with @After
	
	@AfterMethod
	public void logout() {
		System.out.println("logout method");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delet all cookies");
	}
	
//	@AfterSuite
//	public void generateTestReport() {
//		System.out.println("generate test report");
//	}
	
	
	
	

}
