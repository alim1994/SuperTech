package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FundTransferPage;

public class FundTransferPageTest extends BaseClass {
	
	
	@Test
	public void ValidPayeeNoAmount() throws InterruptedException {
		FundTransferPage ftp=PageFactory.initElements(driver, FundTransferPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/FundTransfer.html");
		ftp.selectPayee("Jim");
		ftp.enterAmount(" ");
		Thread.sleep(3000);
		ftp.clickOnTransfer();
		ftp.verifyBalance("5000.00");
		ftp.verifyMessage("Please a valid amount");
	}
	@Test
	public void ValidPayeeValidAmount() throws InterruptedException {
		FundTransferPage ftp=PageFactory.initElements(driver, FundTransferPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/FundTransfer.html");
		ftp.selectPayee("Jim");
		ftp.enterAmount("2000 ");
		Thread.sleep(3000);
		ftp.clickOnTransfer();
		ftp.verifyBalance("3000.00");
		ftp.verifyMessage("$2000 transferred successfully to Jim!!");
	}
	@Test
	public void ValidPayeeInvalidAmount() throws InterruptedException {
		FundTransferPage ftp=PageFactory.initElements(driver, FundTransferPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/FundTransfer.html");
		ftp.selectPayee("Tim");
		ftp.enterAmount("6000 ");
		Thread.sleep(3000);
		ftp.clickOnTransfer();
		ftp.verifyBalance("5000.00");
		ftp.verifyMessage("Transfer failed!! account cannot be overdrawn");
	}
	@Test
	public void InvalidPayeevalidAmount() throws InterruptedException {
		FundTransferPage ftp=PageFactory.initElements(driver, FundTransferPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/FundTransfer.html");
		ftp.selectPayee("John");
		ftp.enterAmount("2000 ");
		Thread.sleep(3000);
		ftp.clickOnTransfer();
		ftp.verifyBalance("5000.00");
		ftp.verifyMessage("Transfer failed!! 'John' is not approved. Please contact your branch");
	}


}
