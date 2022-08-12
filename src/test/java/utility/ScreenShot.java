package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void CapScreeShot( WebDriver driver , String Filename ) throws IOException
	{
	TakesScreenshot TS=(TakesScreenshot)driver;
	File source =   TS.getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir")+"\\ScreenShot\\"+Filename+".png";
	File destination = new File(path);
	FileHandler.copy(source, destination);
	}
		
}
