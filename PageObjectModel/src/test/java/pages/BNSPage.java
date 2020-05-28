package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BNSPage {
	
	
	@FindBy(xpath="html/body/div/div[2]/form/input[1]")
	WebElement firstname;
	public void enterFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	@FindBy(xpath="//*[@id=\"LN\"]")
	WebElement lastname;
	public void enterLastName(String Ln) {
		lastname.sendKeys(Ln);
	}
	@FindBy(xpath="//*[@id=\"EM\"]")
	WebElement Email;
	public void enterEmail(String Em) {
		Email.sendKeys(Em);
	}
	@FindBy(xpath="//*[@id=\"PW\"]")
	WebElement Password;
	public void enterPassword(String pw) {
		Password.sendKeys(pw);
	}
	//@FindBy(xpath="//*[@id=\"PH\"]")
	@FindBy(how=How.XPATH, using="//*[@id='PH']")
	WebElement PhoneNumber;
	public void enterPhoneNumber(String pn) {
		PhoneNumber.sendKeys(pn);
	}
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/form/select[1]")
	WebElement monthname;
	public void selectMonth(String MN) {
		Select monthSelect=new Select(monthname);
		monthSelect.selectByVisibleText(MN);
	
	}
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/form/select[2]")
	WebElement Dayname;
	public void selectDay(String DY) {
		Select DaySelect=new Select(Dayname);
		DaySelect.selectByVisibleText(DY);
	
	}
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/form/select[3]")
	WebElement Year;
	public void selectYear(String YR) {
		Select YearSelect=new Select(Year);
		YearSelect.selectByVisibleText(YR);
	
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"ml\"]")
	WebElement male;
	public void clickOnMalebutton() {
		male.click();
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"fl\"]")
	WebElement Female;
	public void clickOnFemalebutton() {
		Female.click();
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"dl\"]")
	WebElement DLcheckbox;
	public void clickOnDLcheckbox() {
		DLcheckbox.click();
	}
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/form/input[11]")
	WebElement Submitbutton;
	public void clickOnSubmitbutton() {
		Submitbutton.click();
	}
	@FindBy(how=How.XPATH, using="//*[contains(text(), 'Submitted')]")
	WebElement sumbmitText;
	public void verifyTextmessage(String mess) {
		String actualText=sumbmitText.getText();
		Assert.assertEquals(actualText, mess);
	}
	


}
