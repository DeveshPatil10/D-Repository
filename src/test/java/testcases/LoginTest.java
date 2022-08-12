package testcases;

import org.testng.annotations.Test;

public class LoginTest extends  BaseTest{
	
	
	@Test(priority = 1)
	public void validatelogin()
	{
	    lp.LoginToApplication();
	}
	
	@Test(priority = 2)
	public void validateenterpin()
	{
		lp.EntePin();
	}
	
	@Test(priority = 3)
	public void validatetitle()
	{
		lp.GetTitlePage();
	}
}
