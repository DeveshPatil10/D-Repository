package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.LoginPageadv;

public class BaseTest {
	public static WebDriver driver;
	public LoginPage lp;
	public DashBoardPage dbt;
	public LoginPageadv lpa;
	@BeforeSuite
	public void browser()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");	
	}

	@BeforeClass
	public void CreateObject()
	{
		lp = new LoginPage(driver);
		dbt = new DashBoardPage(driver);
		lpa = new LoginPageadv(driver);
		
	}
	
	
	

}
