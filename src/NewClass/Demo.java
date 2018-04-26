package NewClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void getproperty5() throws FileNotFoundException, IOException
	{
		

	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Properties p=new Properties();
	p.load(new FileInputStream("D:\\ProjectManagement\\ActiTime\\config.properties"));
	driver.get(p.getProperty("url"));
	
		
	
	}
}
