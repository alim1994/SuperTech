package step;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BMICalculatorPage;

public class BMICalculatorStep extends AbstractClass {
	BMICalculatorPage bmip=PageFactory.initElements(driver, BMICalculatorPage.class);
	
	@Given("User BMI Calculator Webpage")
	public void user_BMI_Calculator_Webpage() {
	    driver.get("file:///C:/ITTraining/WebSite/WebSite/JavaScript/BMI.html");
	}

	@When("User Enter Height {string}")
	public void user_Enter_Height(String ht) {
	   bmip.enterHeight(ht);
	}

	@When("User Enter Weight {string}")
	public void user_Enter_Weight(String wt) {
	   bmip.enterWeight(wt);
	}

	@When("User click Calculate button")
	public void user_click_Calculate_button() {
	    bmip.clickOnCaculate();
	}

	@Then("User Should get Message {string}")
	public void user_Should_get_Message(String message) {
	   bmip.verifyErrorMessage(message);
	}

	

	@Then("User will see BMI index {string}")
	public void user_will_see_BMI_index(String bmiIn) {
	    bmip.verifyBmiInex(bmiIn);
	}

	@Then("User will see Category {string}")
	public void user_will_see_Category(String bmiCate) {
	   bmip.verifyBmiCategory(bmiCate);
	}
}
