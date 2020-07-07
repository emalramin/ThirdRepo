package com.parameters.Nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestClassNav {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailId"})
	public void amazomLoginTest(String url, String emailId) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).clear();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		


		
	}
	
	
	

}
