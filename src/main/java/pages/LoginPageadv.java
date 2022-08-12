package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageadv {
	
	@FindBy(xpath = "//*[@id='userid']")
	WebElement userinput ;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement userpassw;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement pininput;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement pinsubmitbtton;
	
	
	WebDriver driver;
	public LoginPageadv(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginpageadv(String username , String password)
	{
		userinput.sendKeys(username);
		userpassw.sendKeys(password);
		submit.click();
	}
	
	public void enterpin(String pin)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pininput.sendKeys(pin);
		pinsubmitbtton.click();
	}
	
	public String titleofpage()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	

}
