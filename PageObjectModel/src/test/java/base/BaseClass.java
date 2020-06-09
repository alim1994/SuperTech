package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	protected static WebDriver driver;
	
	protected static ExtentHtmlReporter exthtmlreport;
	protected static ExtentTest test;
	protected static ExtentReports report;
	
	@BeforeTest
	public void setup() {
		
		exthtmlreport=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReport\\ExtentReport.html");
		exthtmlreport.config().setDocumentTitle("Automation Testing Report");
		exthtmlreport.config().setReportName("Extent Report");
		exthtmlreport.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(exthtmlreport);
		
		report.setSystemInfo("Host Name", "Local Host");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser Name", "Chrome");
		report.setSystemInfo("Tester Name", "Alim M");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void testStatus(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "Failed Test is : "+result.getName());
			test.log(Status.FAIL, "Cause of Fail : "+result.getThrowable());
			String screenshotpath=getScreenShot(result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test is : "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Passed test is : "+result.getName());
		}
		
	}
	public static String getScreenShot(String screenName) throws IOException {
		String dateName=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\ScreenShots\\"+screenName+"-"+dateName+".png";
		FileUtils.copyFile(f, new File(destination));
		return destination;
	}

	@AfterTest
	public void teardown() {
		report.flush();
		driver.quit();
	}

}
