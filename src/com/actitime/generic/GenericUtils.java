package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {

public static void getScreenShot (WebDriver driver, String name)

{
	try 
	{
		TakesScreenshot t = (TakesScreenshot) driver; 
		File src = t.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File ("./screenshot"+name+".png"));
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		
}

//Actions Class

public static void draganddrop(WebElement source, WebElement target, WebDriver driver) {
	
	Actions act = new Actions(driver);

	act.dragAndDrop(source, target).perform();
	
}

public static void doubleclic(WebDriver driver) {
	Actions act = new Actions(driver);
	act.doubleClick();
	
}

public static void dropdownmanue(WebDriver driver, WebElement target) {
	
	Actions act = new Actions(driver);
	act.moveToElement(target);
	
}


//SelectClas


public static void selectByIndex(WebElement element, int Index)
{
	Select sel = new Select (element);
	sel.selectByIndex(Index);
}

public static void selectByValue(WebElement element, String value)
{
	Select sel = new Select (element);
	sel.selectByValue(value);
}
public static void selectByVisibleText(WebElement element, String text)
{
	Select sel = new Select (element);
	sel.selectByVisibleText(text);
}

public static List<WebElement> getOptions(WebElement element)
{
	Select sel = new Select (element);
	List<WebElement> alloptions = sel.getOptions();
	return alloptions;
}

public static void contextClick(WebElement target, WebDriver driver) {

Actions act = new Actions(driver);
act.contextClick(target).perform();

}
public static void doubleClick(WebDriver driver) {
Actions act = new Actions(driver);
act.doubleClick().perform();
	
}








}



