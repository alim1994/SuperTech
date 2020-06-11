package step;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FaceBookPage;


public class FaceBookStep extends AbstractClass {
	FaceBookPage fbp=PageFactory.initElements(driver, FaceBookPage.class);
	@Given("User is on Facebook webpage")
	public void user_is_on_Facebook_webpage() {
	    driver.get("https://www.facebook.com/");
	}

	@When("User enter firstname {string}  lastname {string} email {string} Re enter email {string} password {string}")
	public void user_enter_firstname_lastname_email_Re_enter_email_password(String fn, String Ln, String Em, String Cem, String Pw) {
	    fbp.enterFirstName(fn);
	    fbp.enterLastName(Ln);
	    fbp.enterEmail(Cem);
	    fbp.enterConfirmemail(Cem);
	    fbp.enterPassword(Pw);
	}

	@When("User Chose month {string} day {string} year {string}")
	public void user_Chose_month_day_year(String MN, String DY, String YR) {
	   fbp.selectMonth(MN);
	   fbp.selectDay(DY);
	   fbp.selectYear(YR);
	}

	@When("User select on male radio button")
	public void user_select_on_male_radio_button() {
	  fbp.clickOnMalebutton();
	}

	@When("User will click SignUp button")
	public void user_will_click_SignUp_button() {
	    fbp.clickOnSingUpbutton();
	}

	@Then("User Will see his Facebook account")
	public void user_Will_see_his_Facebook_account() {
	    
	}


}
