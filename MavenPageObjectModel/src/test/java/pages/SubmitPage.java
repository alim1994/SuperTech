package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class SubmitPage {
	
	
	
	
	@FindBy(how=How.XPATH, using="//*[contains(text(), 'Submitted')]")
	WebElement sumbmitText;
	public void verifyTextmessage(String mess) {
		String actualText=sumbmitText.getText();
		Assert.assertEquals(actualText, mess);
	}

}
