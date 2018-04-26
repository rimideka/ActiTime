package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public abstract class Basetest implements AutoConstant
	{
		public WebDriver driver;
		
		@BeforeMethod
		public void precondition() {
			System.setProperty(chrome_key1, chrome_value1);
			System.setProperty(gecko_key, gecko_value);
			
			
			
			driver = new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/login.do");
		}
		
		@AfterMethod
		public void postCondition(ITestResult res) {
			int status = res.getStatus();
			String name1 = res.getMethod().getMethodName();
			
			if (status==2) {
				
				GenericUtils.getScreenShot(driver, name1);
			}
			driver.close();
		}
		
	}
}
