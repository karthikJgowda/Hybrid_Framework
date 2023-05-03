package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class implements Framework_constant 
{
	public WebDriver driver;
	@BeforeMethod
	public void oppApp()
	{
		System.setProperty(gecko_key,gecko_value);
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
		
	}

}
