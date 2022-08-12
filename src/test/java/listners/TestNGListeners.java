package listners;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;
import utility.ScreenShot;

public class TestNGListeners extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReportsGen.ExtentReportGenerator();;
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case :"+result.getMethod().getMethodName()+" has  been  started");
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case :"+result.getMethod().getMethodName()+" has  been  passed");	
		
		test.log(Status.PASS, "Test Case is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case :"+result.getMethod().getMethodName()+" has  been  failed");	
		
		test.fail(result.getThrowable());
		
			try 
			{
			ScreenShot.CapScreeShot(driver, result.getMethod().getMethodName());
			} 
			catch (IOException e)
			{
			System.out.println("Exception arrived catch is executing");
			}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case :"+result.getMethod().getMethodName()+" has  been  skipped");	
	
		test.log(Status.SKIP, "Test Case Has Been Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
System.out.println("Test Tag "+context.getName()+" has been started");		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Tag "+context.getName()+" has been finished");		
		extent.flush();
	}
	
}
