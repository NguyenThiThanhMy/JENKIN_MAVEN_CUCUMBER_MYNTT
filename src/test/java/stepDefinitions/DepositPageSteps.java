package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.DepositPagePO;
import pages.NewAccountPagePO;
import pages.PageFactoryManager;

public class DepositPageSteps {
	WebDriver driver;
	private DepositPagePO depositPage;

	public DepositPageSteps() {
		driver = Hooks.openBrowser();
		depositPage = PageFactoryManager.getDepositPage(driver);
	}
	
	@When("^I input (first|second) account number$")
	public void i_input_first_account_number(String account) {
		if (account.equalsIgnoreCase("first")){
		depositPage.inputToAccountNoTextbox(ShareData.firstAccount);
		} else {
			depositPage.inputToAccountNoTextbox(ShareData.secondAccount);
		}
	}
	
	
}
