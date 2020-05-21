package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	
	@FindBy(name="q")
	WebElement searchbox;
	public void enterInSearchbox(String searchItem) {
		searchbox.sendKeys(searchItem);
		
	}

}
