package com.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	
	@Test
	public void  validLoginLogout(WebDriver driver)
	{
		
		String loginTitle=ExcelData.getData("./data/input.xlsx", "login", 1, 2);
		String user=ExcelData.getData("./data/input.xlsx", "login", 1, 0);
		String pass= ExcelData.getData("./data/input.xlsx", "login", 1, 1);
		String timeTrackTitle=ExcelData.getData("./data/input.xlsx", "enterTimeTrack", 1, 0);
	
	
	LoginPage lp=new LoginPage(driver);
	EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
	
	
	lp.verifyTheTitle(loginTitle);
	lp.enterUserName(user);
	lp.enterPassword(pass);
	lp.clickLogin();
	lp.verifyTheTitle(timeTrackTitle);
	ep.clickOnHelp();
	lp.verifyTheTitle(loginTitle);
	}
}



