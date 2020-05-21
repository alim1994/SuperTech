package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import basePack.BaseClass;

public class SuperTechPage extends BaseClass {
	
	@FindBy(linkText="Social Media")
	WebElement sm;
	public void mouseHover() {
		Actions act=new Actions(driver);
		act.moveToElement(sm).build().perform();
	}
	@FindBy(linkText="Google")
	WebElement google;
	public void clickOnGoogle() {
		google.click();
	}
	@FindBy(xpath="/html/body/center/form/table/tbody/tr[1]/td[2]/input")
	WebElement iframeFName;
	public void enterEiframeFName(String ifFname) {
		driver.switchTo().frame("LoginForm");
		iframeFName.sendKeys(ifFname);
	}
	@FindBy(linkText="DOWNLOAD")
	WebElement iframeSeleniumdownload;
	public void clickOnDownload() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Selenium");
		iframeSeleniumdownload.click();
	}
}
