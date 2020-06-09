package step;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FundTransferPage;

public class FundTransferStep extends AbstractClass {
	
	FundTransferPage ftp=PageFactory.initElements(driver,  FundTransferPage.class);
	
	@Given("User is on fund transfer webpage")
	public void user_is_on_fund_transfer_webpage() {
		driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/FundTransfer.html");
	   
	}

	@When("User select payee {string}")
	public void user_select_payee(String pye) {
	   ftp.selectPayee(pye);
	}

	@When("User enter amount {string}")
	public void user_enter_amount(String amt) {
	    ftp.enterAmount(amt);
	}

	@When("User click on transfer button")
	public void user_click_on_transfer_button() throws InterruptedException {
		ftp.clickOnTransfer();
		Thread.sleep(3000);
	   
	}

	@Then("User should check balance {string}")
	public void user_should_check_balance(String bln) {
	   ftp.verifyBalance(bln);
	}

	@Then("User should get message {string}")
	public void user_should_get_message(String mgs) {
	    ftp.verifyMessage(mgs);
	}

}
