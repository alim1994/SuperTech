package tests;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePack.BaseClass;
import pages.FacebookPage;


public class FacebookPageTest extends BaseClass {
	@Test
public void Facebookpage() throws InterruptedException  {
		
		FacebookPage fbp=PageFactory.initElements(driver, FacebookPage.class);
		
		driver.get("https://www.facebook.com/");
		fbp.enterFirstName("Mashurul");
		fbp.enterLastName("Alim");
		fbp.enterEmail("alim123@gmail.com");
		fbp.enterConfirmemail("alim123@gmail.com");
		fbp.enterPassword("alim123");
		
		Thread.sleep(4000);
		
	
	
	

}

	
		
	}
