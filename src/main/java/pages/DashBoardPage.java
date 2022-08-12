package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	
	
	@FindBy(xpath =  "//*[@type='button']")
	WebElement getstartedbutton;
	
	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement searchbox;
	
	@FindBy(xpath = "//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	WebElement buybutton;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement finalbuybutton;

	WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchshares()
	{
		getstartedbutton.click();
		searchbox.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void buyShare()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		buybutton.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		finalbuybutton.click();
		
	}
	
	public String expectedtext()
	{
		String expected = "Error";
		return expected;
	}
	
	
}
