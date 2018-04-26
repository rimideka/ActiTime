package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class LoginPage extends Basepage 
{
	//Declaration
		@FindBy (id="username")
		private WebElement usernameTB;
		
		@FindBy (name="pwd")
		private WebElement passwordTB;
		
		@FindBy (xpath="//div[.='Login ']")
		private WebElement loginBTN;
		
		@FindBy (xpath="//nobr[contains(text(),'actiTIME')]")
		private WebElement version;
		
		@FindBy (xpath="//span[contains(.,'invalid')]")
		private WebElement errMsg;
		
		
		
		public LoginPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver,this);
		}
		
		
	//Utilization
		
		public void enterUserName(String un)
		{
			usernameTB.sendKeys(un);
		}
		
		public void enterPassword(String pw)
		{
			passwordTB.sendKeys(pw);
		}
		
		public void clickLogin()
		{
			loginBTN.click();
		}
		
		
		public void verifyTheTitle(String eTitle)
		{
			verifyTitle(eTitle);
		}
		
		
		public String verifyErrorMessage()
		{
			verifyElement(errMsg);
			String actualerrMsg=errMsg.getText();
			return actualerrMsg;
		}
		
		public String verifyVersion()
		{
			String aversion=version.getText();
			return aversion;
		}
		
		
	}