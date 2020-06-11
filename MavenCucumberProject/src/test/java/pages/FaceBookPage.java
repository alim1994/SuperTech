package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FaceBookPage {
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
	@FindBy(name="reg_email__")
	WebElement Email;
	public void enterEmail(String Em) {
	Email.sendKeys(Em);
	}
	@FindBy(name="")
	WebElement Confirmemail;
	public void enterConfirmemail(String Cem) {
	Confirmemail.sendKeys(Cem);
	}
	@FindBy(xpath="//*[@id=\"u_0_10\"]")
	WebElement Password;
	public void enterPassword(String Pw) {
	Password.sendKeys(Pw);
	}
	@FindBy(how=How.ID, using="month")
	WebElement monthname;
	public void selectMonth(String MN) {
		Select monthSelect=new Select(monthname);
		monthSelect.selectByVisibleText(MN);
	
	}
	@FindBy(how=How.ID, using="day")
	WebElement Dayname;
	public void selectDay(String DY) {
		Select DaySelect=new Select(Dayname);
		DaySelect.selectByVisibleText(DY);
	
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"year\"]")
	WebElement Year;
	public void selectYear(String YR) {
		Select YearSelect=new Select(Year);
		YearSelect.selectByVisibleText(YR);
	
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"u_0_13\"]/span[2]/label")
	WebElement male;
	public void clickOnMalebutton() {
		male.click();
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"u_0_17\"]")
	WebElement SingUpbutton;
	public void clickOnSingUpbutton() {
		SingUpbutton.click();
	}
}
