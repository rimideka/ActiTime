package com.actitime.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;

public class VerifyBuildTest extends BaseTest {
	@Test
	public void testVerifyVersion(WebDriver driver) {
		

		String eBuild = ExcelData.getData("./data/input.xlsx", "login", 1,5);
		
		//LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		ep.clickOnHelp();
		
		
		String aBuild = ep.verifyTheBuild();
		Assert.assertEquals(aBuild, eBuild);
		Reporter.log("Build is matching:Actual build Is:"+aBuild,true);
	}

}
