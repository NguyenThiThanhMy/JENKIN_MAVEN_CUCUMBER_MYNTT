package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import commons.AbstractTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.BalanceEnquiryPagePO;
import pages.CommonPagePO;
import pages.DeleteAccountPagePO;
import pages.DeleteCustomerPagePO;
import pages.DepositPagePO;
import pages.EditAccountPagePO;
import pages.EditCustomerPagePO;
import pages.FundTransferPagePO;
import pages.HomePagePO;
import pages.NewAccountPagePO;
import pages.NewCustomerPagePO;
import pages.PageFactoryManager;
import pages.WithdrawalPagePO;

public class CommonPageSteps {
	WebDriver driver;
	private CommonPagePO commonPage;
	private AbstractTest abstracTest;
	private NewAccountPagePO newAccountPage;
	private EditAccountPagePO editAccountPage;
	private DeleteAccountPagePO deleteAccountPage;
	private NewCustomerPagePO newCustomerPage;
	private EditCustomerPagePO editCustomerPage;
	private DeleteCustomerPagePO deleteCustomerPage;
	private DepositPagePO depositPage;
	private FundTransferPagePO fundTransferPage;
	private WithdrawalPagePO withdralPage;
	private BalanceEnquiryPagePO balanceEnquiryPage;
	private HomePagePO homePage;
	

	public CommonPageSteps() {
		driver = Hooks.openBrowser();
		commonPage = PageFactoryManager.getCommonPage(driver);
		abstracTest = new AbstractTest();
	}

	@Given("^I click to \"(.*?)\" button$")
	public void click_to_dynamic_button(String buttonName) {
		commonPage.clickToDynamicButton(buttonName);
	}
	
	@When("^I input to \"([^\"]*)\" textbox with random data \"([^\"]*)\"$")
	public void i_input_dynamic_textbox_with_random_data(String textboxName, String value)  {
		value= abstracTest.randomNumber()+value;
		commonPage.inputToDynamicTextboxWithDynamicData(textboxName, value);  
	}
	
	@When("^I select value is \"([^\"]*)\" in dropdown list \"([^\"]*)\"$")
    public void i_select_dynamic_value_in_dynamic_dropdown(String value, String dropdownListName)  {
		commonPage.selectDynamicValueInDynamicDropdownList(value,dropdownListName);  
    }

	@When("^I input to \"([^\"]*)\" textbox with data \"([^\"]*)\"$")
	public void i_input_to_dynamic_textbox_with_dynamic_data(String textboxName, String value) {
		commonPage.inputToDynamicTextboxWithDynamicData(textboxName, value);
	}
	
	@When("^I input to \"([^\"]*)\" radio button with data \"([^\"]*)\"$")
	public void i_click_to_dynamic_radio_button_with_dynamic_value(String radioButtonName, String value) {
		commonPage.clickToDynamicRadioButtonWithDynamicValue(radioButtonName, value);
	}

	@When("^I input to \"([^\"]*)\" textarea with data \"([^\"]*)\"$")
	public void i_input_to_dynamic_textarea_with_dynamic_data(String textareaName, String value) {
		commonPage.inputToDynamicTextareaWithDynamicData(textareaName, value);
	}

	
	@Then("^I verify expected data at \"([^\"]*)\" textbox with actual data \"([^\"]*)\"$")
	public void i_verify_expected_dynamic_textbox_data_with_actual_dynamic_data(String textboxName,
			String actualValue) {
		String expectedValue = commonPage.getDynamicValueInDynamicTextbox(textboxName, "value");
		abstracTest.verifyEquals(actualValue, expectedValue);
	}
	
	@Then("^I verify expected data at \"([^\"]*)\" text in table with actual data \"([^\"]*)\"$")
	public void i_verify_expected_dynamic_text_in_table_data_with_actual_dynamic_data(String textInTable,
			String actualValue) {
		String expectedValue = commonPage.getDynamicValueInDynamicTextInTable(textInTable);
		System.out.println("Actual value:"+actualValue);
		System.out.println("Expected value:"+expectedValue);
		abstracTest.verifyEquals(actualValue, expectedValue);
	}

	@Then("^I verify created or edited with successfully message \"([^\"]*)\"$")
    public void i_verify_created_or_edited_success_with_dynamic_message(String message) {
    	abstracTest.verifyTrue(commonPage.isCreateOrEditSuccessMessageDisplayed(message));
    }
	@When("^I open \"([^\"]*)\" page$")
	public void i_open_something_page(String dynamicPage)  {
		switch (dynamicPage) {
		case "New Customer":
			commonPage.openNewCustomerPage(driver);
			break;
		case "Edit Customer":
			commonPage.openEditCustomerPage(driver);
			break;
		case "Delete Customer":
			commonPage.openDeleteCustomerPage(driver);
			break;
		case "New Account":
			commonPage.openNewAccountPage(driver);
			break;
		case "Edit Account":
			commonPage.openEditAccountPage(driver);
			break;
		case "Delete Account":
			commonPage.openDeleteAccountPage(driver);
			break;
		case "Deposit":
			commonPage.openDepositPage(driver);
			break;
		case "Withdrawal":
			commonPage.openWithdrawalPage(driver);
			break;
		case "Fund Transfer":
			commonPage.openFunTransferPage(driver);
			break;
		case "Balance Enquiry":
			commonPage.openBalanceEnquiryPage(driver);
			break;
		default:
			homePage=PageFactoryManager.getHomePage(driver);
		}
	
	}

    
}
