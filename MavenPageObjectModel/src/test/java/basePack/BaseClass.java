package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	protected static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\ITTraining\\AllDriver\\geckodriver.exe");
		//driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\ITTraining\\AllDriver\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();


	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
