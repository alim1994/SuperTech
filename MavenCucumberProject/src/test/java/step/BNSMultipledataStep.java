package step;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BNSPage;

public class BNSMultipledataStep extends AbstractClass{
	BNSPage bnsp=PageFactory.initElements(driver,BNSPage.class );
	@Given("User is on BNS login form page")
	public void user_is_on_BNS_login_form_page() {
	   driver.get("https://bnscorporation.com/demo-website/");
	}

	@When("User Enter firstname {string}  lastname {string} email {string} password {string} phone number {string}")
	public void user_Enter_firstname_lastname_email_password_phone_number(String fn, String Ln, String Em, String pw, String pn) {
	    bnsp.enterFirstName(fn);
	    bnsp.enterLastName(Ln);
	    bnsp.enterEmail(Em);
	    bnsp.enterPassword(pw);
	    bnsp.enterPhoneNumber(pn);
	}

	@When("User Select month {string} day {string} year {string}")
	public void user_Select_month_day_year(String MN, String DY, String YR) {
	    bnsp.selectMonth(MN);
	    bnsp.selectDay(DY);
	    bnsp.selectYear(YR);
	}

	@When("User will Click on {string} radio button")
	public void user_will_Click_on_radio_button(String Gender) {
		if(Gender.equalsIgnoreCase("Male")) {
	    bnsp.clickOnMalebutton();
		}
		else if(Gender.equalsIgnoreCase("Female")) {
			bnsp.clickOnFemalebutton();
		}
	}

	@When("User will Click submit button")
	public void user_will_Click_submit_button() throws InterruptedException {
	    bnsp.clickOnSubmitbutton();
	    Thread.sleep(3000);
	}

	@Then("User should see {string}")
	public void user_should_see(String message) {
	    bnsp.verifyTextmessage(message);
	}


}
