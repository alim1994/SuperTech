package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.BMICalculatorPage;

public class BMICalculateTest extends BaseClass{
	
	
	@Test
	public void NoheightValue() throws InterruptedException {
		test=report.createTest("No Height Value");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("");
		bmip.enterWeight("50");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("");
		bmip.verifyBmiCategory("");
		bmip.verifyErrorMessage("Please enter Height");
		Thread.sleep(3000);
	}
	
	@Test
	public void NoweightValue() throws InterruptedException {
		test=report.createTest("No Weight Value");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("170");
		bmip.enterWeight(" ");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("");
		bmip.verifyBmiCategory("");
		bmip.verifyErrorMessage("Please enter Weight");
		Thread.sleep(3000);
	}
	@Test
	public void CategoryNormal() throws InterruptedException {
		test=report.createTest("Category Normal");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("170");
		bmip.enterWeight("60");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("20.8");
		bmip.verifyBmiCategory("Normal");
		
		Thread.sleep(3000);
	}
	@Test
	public void CategoryUnderweight() throws InterruptedException {
		test=report.createTest("Category Underweight");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("170");
		bmip.enterWeight("50");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("17.3");
		bmip.verifyBmiCategory("Underweight");
		
		Thread.sleep(3000);
	}
	@Test
	public void CategoryOverweight() throws InterruptedException {
		test=report.createTest("Category Overweight");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("170");
		bmip.enterWeight("80");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("27.7");
		bmip.verifyBmiCategory("Overweight");
		
		Thread.sleep(3000);
	}
	@Test
	public void CategoryObesity() throws InterruptedException {
		test=report.createTest("Category Obesity");
		BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
		bmip.enterHeight("170");
		bmip.enterWeight("90");
		bmip.clickOnCaculate();
		bmip.verifyBmiInex("31.0");
		bmip.verifyBmiCategory("Obesity");
		
		Thread.sleep(3000);
	}

}
