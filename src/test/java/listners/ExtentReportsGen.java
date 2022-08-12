package listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsGen {
	
	static  ExtentReports extent;
	
	public static ExtentReports ExtentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\Reports\\kitezerodhareport.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Zerodha Execution Report");
			extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Kite Zerodha");
		extent.setSystemInfo("Executed By", "Devesh Patil");
		extent.setSystemInfo("Enviornment", "Staging");
		return extent;
	}

}
