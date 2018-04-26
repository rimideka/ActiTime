package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class EnterTimeTrackPage extends Basepage
{
	//Declaration
		@FindBy (id="logoutLink")
		private WebElement logoutBTN;
		
		@FindBy (xpath="//div[@onclick='openHelpAndSupportMenu(event)']")
		private WebElement helpIcon;
		
		
		@FindBy (xpath="//a[.='About your actiTIME']")
		private WebElement clickOnAbt;
		
		
		
		@FindBy (xpath="//span[(contains(text(),'build'))]")
		private WebElement buildtext;
		
		@FindBy(xpath="//img[@title='Close']")
		private WebElement closepop;
				
		
		
		
		public EnterTimeTrackPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public void clickOnLogout()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logoutBTN.click();
		}
		
		public void clickOnHelp()
		{
			helpIcon.click();
				
		}
		
		public void clickOnAbt()
		{
			clickOnAbt.click();
		}
		
		public String verifyTheBuild()
		{
					
			verifyElement(buildtext);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String abuildtxt=buildtext.getText();
			return abuildtxt;
			
		}
		
		public void closePopup()
		{
			closepop.click();
		}
}