package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.NewAccountPagePO;
import pages.PageFactoryManager;

public class NewAccountPageSteps {
	WebDriver driver;
	private NewAccountPagePO newAccountPage;

	public NewAccountPageSteps() {
		driver = Hooks.openBrowser();
		newAccountPage = PageFactoryManager.getNewAccountPage(driver);
	}
	
	@When("^I input to Customer ID$")
	public void i_input_to_customerID() {
		newAccountPage.inputToCustomerIDTextbox(ShareData.userName);
	}
	
	@When("^I get infor of (first|second) account$")
	public void i_get_infor_first_or_second_accountID_information(String account) {
		if (account.equalsIgnoreCase("first")){
		ShareData.firstAccount=newAccountPage.getAccountID();
		} else {
			ShareData.secondAccount=newAccountPage.getAccountID();	
		}
	}
	
}
