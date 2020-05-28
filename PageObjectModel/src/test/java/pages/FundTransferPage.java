package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FundTransferPage {
	
	@FindBy(id="payee")
	WebElement payeeName;
	public void selectPayee(String pye) {
		Select payeeSelect=new Select(payeeName);
		payeeSelect.selectByVisibleText(pye);
	}
	@FindBy(id="amount")
	WebElement amountTextbox;
	public void enterAmount(String amt) {
		amountTextbox.sendKeys(amt);
	}
	
	@FindBy(id="balance")
	WebElement balanceField;
	public void verifyBalance(String bln) {
		String actulBalance=balanceField.getAttribute("value");
		Assert.assertEquals(actulBalance, bln);
	}
	@FindBy(id="transfer")
	WebElement transferButton;
	public void clickOnTransfer() {
		transferButton.click();
	}
	@FindBy(id="message")
	WebElement TexMessage;
	public void verifyMessage(String mgs) {
		String actulsucessMessage=TexMessage.getText();
		Assert.assertEquals(actulsucessMessage, mgs);
	}
	

}
