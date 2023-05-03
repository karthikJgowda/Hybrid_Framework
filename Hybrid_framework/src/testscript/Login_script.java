package testscript;

import org.testng.annotations.Test;

import generic.Generic_class;
import pom.Pom;

public class Login_script extends Generic_class 
{
	@Test
	public void test1()
	{
		Pom p = new Pom(driver);
		p.username();
		p.password();
		p.login_btn();
		
	}

}
