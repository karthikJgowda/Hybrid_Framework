package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Generic_class;

public class Pom extends Generic_class 
{
	@FindBy(id = "email")
	private WebElement un;
	@FindBy(id = "pass")
	private WebElement pwd;
	@FindBy(name = "login")
	private WebElement lgn_btn;
	
	public Pom(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		un.sendKeys("abc");
	}
	public void password()
	{
		pwd.sendKeys("123");
	}
	public void login_btn()
	{
		lgn_btn.click();
	}

}
