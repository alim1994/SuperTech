package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage {
	
	@FindBy(name="firstname")
	WebElement firstname;
	public void enterFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	@FindBy(name="lastname")
	WebElement Lastname;
	public void enterLastName(String Ln) {
	Lastname.sendKeys(Ln);
	}
	@FindBy(xpath="//*[@id=\"u_0_v\"]")
	WebElement Email;
	public void enterEmail(String Em) {
	Email.sendKeys(Em);
	}
	@FindBy(xpath="//*[@id=\"u_0_y\"]")
	WebElement Confirmemail;
	public void enterConfirmemail(String Cem) {
	Confirmemail.sendKeys(Cem);
	}
	@FindBy(xpath="//*[@id=\"u_0_10\"]")
	WebElement Password;
	public void enterPassword(String Pw) {
	Password.sendKeys(Pw);
	}
}