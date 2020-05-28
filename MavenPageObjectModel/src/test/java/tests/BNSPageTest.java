package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePack.BaseClass;
import pages.BNSPage;
import pages.SubmitPage;

public class BNSPageTest extends BaseClass{
	
	
	
	@Test
	public void bnsSignup() throws InterruptedException {
		
		BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);
		
		driver.get("file:///C:/ITTraining/MyWebsite/MyWebSite.html");
		
		bnsp.enterFirstName("Mashurul");
		bnsp.enterLastName("Alim");
		bnsp.enterEmail("alim123@gmail.com");
		bnsp.enterPassword("alim123");
		bnsp.enterPhoneNumber("2036580716");
		bnsp.selectMonth("May");
		bnsp.selectDay("10");
		bnsp.selectYear("2003");
		bnsp.clickOnMalebutton();
		bnsp.clickOnDLcheckbox();
		bnsp.clickOnSubmitbutton();
		Thread.sleep(4000);
		bnsp.verifyTextmessage("Submitted Form Data");
	}

}
