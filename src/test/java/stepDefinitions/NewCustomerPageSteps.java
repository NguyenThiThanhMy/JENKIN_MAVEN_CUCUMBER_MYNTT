package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.NewCustomerPagePO;
import pages.PageFactoryManager;

public class NewCustomerPageSteps {
	WebDriver driver;
	private NewCustomerPagePO newCustomerPage;

	public NewCustomerPageSteps() {
		driver = Hooks.openBrowser();
		newCustomerPage = PageFactoryManager.getNewCustomerPage(driver);
	}
	
	@When("^I get infor of Customer ID$")
	public void i_get_to_customerID_information() {
		ShareData.userName=newCustomerPage.getCustomerID();
	}
	
	
	
}
