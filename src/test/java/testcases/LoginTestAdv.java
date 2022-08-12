package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import listners.TestNGListeners;
import utility.ReadConfiFileMethod;

public class LoginTestAdv extends TestNGListeners {
	
	@Test(priority = 1)
	public void validatelogin() throws IOException
	{
		test.info("Entering Credentials");
		lpa.loginpageadv(ReadConfiFileMethod.Readconfigurefile("username"), ReadConfiFileMethod.Readconfigurefile("password"));
		test.info("Entered Credentials "+ReadConfiFileMethod.Readconfigurefile("username")+" "+ReadConfiFileMethod.Readconfigurefile("password"));
		
	}
	
	@Test(priority = 2)
	public void validatepin() throws IOException
	{
		lpa.enterpin(ReadConfiFileMethod.Readconfigurefile("pin"));
		test.info("Entering Credentials");
	}
	
	@Test(priority = 3)
	public void validatetitle()
	{
		String actual = lpa.titleofpage();
		String expected = "Kite - Zerodha's fast and elegant flagship trading platform";
		Assert.assertEquals(actual, expected);
		test.info("Title Page Validation Done");
	}
	

}
