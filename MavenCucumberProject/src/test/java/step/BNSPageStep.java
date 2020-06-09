package step;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BNSPage;

public class BNSPageStep extends AbstractClass {
	BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);

	@Given("User is on BNS login form webpage")
	public void user_is_on_BNS_login_form_webpage() {
	    driver.get("https://bnscorporation.com/demo-website/");
	 }

	@When("User enter firstname {string}  lastname {string} email {string} password {string} phone number {string}")
	public void user_enter_firstname_lastname_email_password_phone_number(String fn, String Ln, String Em, String pw, String pn) {
	    bnsp.enterFirstName(fn);
	    bnsp.enterLastName(Ln);
	    bnsp.enterEmail(Em);
	    bnsp.enterPassword(pw);
	    bnsp.enterPhoneNumber(pn);
	}

	@When("User select month {string} day {string} year {string}")
	public void user_select_month_day_year(String MN, String DY, String YR) {
	   bnsp.selectMonth(MN);
	   bnsp.selectDay(DY);
	   bnsp.selectYear(YR);
	}

	@When("User will click on male radio button")
	public void user_will_click_on_male_radio_button() throws InterruptedException {
	   bnsp.clickOnMalebutton();
	   Thread.sleep(3000);
	}

	@When("User will click submit button")
	public void user_will_click_submit_button() {
	    bnsp.clickOnSubmitbutton();
	}

	@Then("User should verify message {string}")
	public void user_should_verify_message(String message) {
	   bnsp.verifyTextmessage(message);
	}


	
}
