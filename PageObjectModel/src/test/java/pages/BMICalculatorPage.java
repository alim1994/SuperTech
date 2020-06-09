package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BMICalculatorPage {
	
	
	
@FindBy(id="heightCMS")
WebElement heightTextBox;
public void enterHeight(String ht) {
	heightTextBox.sendKeys(ht);
}
@FindBy(id="weightKg")
WebElement weightTextBox;
public void enterWeight(String wt) {
	weightTextBox.sendKeys(wt);
}
@FindBy(id="Calculate")
WebElement calculateButton;
public void clickOnCaculate() {
	calculateButton.click();
}
@FindBy(id="bmi")
WebElement bmiIndex;
public void verifyBmiInex(String bmiIn) {
	String actualBmiIndex=bmiIndex.getAttribute("value");
	Assert.assertEquals(actualBmiIndex, bmiIn);
}
@FindBy(id="bmi_category")
WebElement bmiCategory;
public void verifyBmiCategory(String bmiCate) {
	String actualBmiCategory=bmiCategory.getAttribute("value");
	Assert.assertEquals(actualBmiCategory, bmiCate);
}
@FindBy(id="error")
WebElement errorMessage;
public void verifyErrorMessage(String message) {
	String actualMessage=errorMessage.getText();
	Assert.assertEquals(actualMessage, message);
}

}
