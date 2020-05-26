package tests;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePack.BaseClass;
import pages.GooglePage;
import pages.SuperTechPage;

public class SuperTechPageTest extends BaseClass{
	
	
	@Test
	public void SuperTech() throws InterruptedException {
		SuperTechPage stp=PageFactory.initElements(driver, SuperTechPage.class);
		
		driver.get("file:///C:/ITTraining/WebSite/WebSite/SuperTech.html");
		stp.mouseHover();
		
		stp.clickOnGoogle();
		
		ArrayList<String>googletab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(googletab.get(1));
		Thread.sleep(4000);
	}
	@Test
	public void googleTest() throws InterruptedException {
	GooglePage gop=PageFactory.initElements(driver, GooglePage.class);
	gop.enterInSearchbox("New York");
	
	Thread.sleep(3000);
	ArrayList<String>supertab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(supertab.get(0));
	}	
	@Test
	public void iframeTest() throws InterruptedException {
		SuperTechPage stp=PageFactory.initElements(driver, SuperTechPage.class);
		stp.enterEiframeFName("Alim");
		stp.clickOnDownload();
		Thread.sleep(3000);
	}
		
	

}
