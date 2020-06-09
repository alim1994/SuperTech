package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {
				"html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",	
		},
		features= {"src/test/resources/Features"},
		glue= {"step"},
		tags= {"@FundTransfer, @BMI, @BNS" } //feature tags
		
		
		//tags= {"@CategoryNormal, @CategoryOverweight, @validpayeeandValidamount, @BNSPage"} //scenario tags
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
