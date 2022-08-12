package testcases;

import org.testng.annotations.Test;

import listners.TestNGListeners;

public class DashboardTest extends TestNGListeners {
	
	@Test(priority = 4)
	public void  searchsharesTest()
	{
		test.info("Searching Shares");
		dbt.searchshares();
		
	}
	
	@Test(priority = 5)
	public void validatebuysell()
	{
		test.info("Buying Shares");
		dbt.buyShare();
	}
}
