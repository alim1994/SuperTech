package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	protected static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();


	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
