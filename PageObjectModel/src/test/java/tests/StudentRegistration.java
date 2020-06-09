package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class StudentRegistration  extends BaseClass {
		@Test
		public void Student() {
		test=report.createTest("Student registration");
	    driver.manage().window().maximize();	
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/StudentRegistration.html");
		driver.findElement(By.id("firstname")).sendKeys("mashurul");
		driver.findElement(By.id("lastname")).sendKeys("alim");
		}
}
