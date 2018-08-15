package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.CommonPageUI;

public class CommonPagePO extends AbstractPages {
	WebDriver driver;

	public CommonPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void clickToDynamicButton(String buttonName) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_SUBMIT_BUT, buttonName);
		clickToElement(driver, interfaces.CommonPageUI.DYNAMIC_SUBMIT_BUT, buttonName);
	}

	public void inputToDynamicTextboxWithDynamicData(String textboxName, String value) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTBOX, textboxName);
		sendKeyToElement(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTBOX, value, textboxName);

	}

	public void selectDynamicValueInDynamicDropdownList(String value, String dropdownListName) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_DROPDOWN_LIST, dropdownListName);
		selectItemDropDown(driver, interfaces.CommonPageUI.DYNAMIC_DROPDOWN_LIST, dropdownListName, value);
	}

	public void inputToDynamicTextareaWithDynamicData(String textareaName, String value) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTAREA, textareaName);
		sendKeyToElement(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTAREA, value, textareaName);

	}

	public String getDynamicValueInDynamicTextbox(String textboxName, String attributeName) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTBOX, textboxName);
		return getAttributeValue(driver, interfaces.CommonPageUI.DYNAMIC_INPUT_TEXTBOX, textboxName, attributeName);
	}

	public String getDynamicValueInDynamicTextInTable(String textInTable) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_TEXT_IN_TABLE, textInTable);
		return getTextElement(driver, interfaces.CommonPageUI.DYNAMIC_TEXT_IN_TABLE, textInTable);
	}

	public void clickToDynamicRadioButtonWithDynamicValue(String radioButtonName, String value) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonName,value);
		clickToElement(driver, interfaces.CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonName, value);
	}

	public boolean isCreateOrEditSuccessMessageDisplayed(String messageName) {
		waitForControlVisible(driver, interfaces.CommonPageUI.DYNAMIC_MESSAGE, messageName);
		return isControlDisplayed(driver, interfaces.CommonPageUI.DYNAMIC_MESSAGE, messageName);
	}

	// dynamic locator
	public HomePagePO openHomePage(WebDriver driver, String pageName) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, pageName);
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, pageName);
		return PageFactoryManager.getHomePage(driver);
	}

	public HomePagePO openHomePage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Manager");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Manager");
		return PageFactoryManager.getHomePage(driver);
	}

	public NewCustomerPagePO openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "New Customer");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "New Customer");
		return PageFactoryManager.getNewCustomerPage(driver);
	}

	public EditCustomerPagePO openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Edit Customer");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Edit Customer");
		return PageFactoryManager.getEditCustomerPage(driver);
	}

	public NewAccountPagePO openNewAccountPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "New Account");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "New Account");
		return PageFactoryManager.getNewAccountPage(driver);
	}

	public DeleteCustomerPagePO openDeleteCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Delete Customer");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Delete Customer");
		return PageFactoryManager.getDeleteCustomerPage(driver);
	}

	public EditAccountPagePO openEditAccountPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Edit Account");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Edit Account");
		return PageFactoryManager.getEditAccountPage(driver);
	}

	public DeleteAccountPagePO openDeleteAccountPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Delete Account");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Delete Account");
		return PageFactoryManager.getDeleteAccountPage(driver);
	}

	public DepositPagePO openDepositPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Deposit");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Deposit");
		return PageFactoryManager.getDepositPage(driver);
	}

	public WithdrawalPagePO openWithdrawalPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Withdrawal");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Withdrawal");
		return PageFactoryManager.getWithdrawalPage(driver);
	}

	public FundTransferPagePO openFunTransferPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Fund Transfer");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Fund Transfer");
		return PageFactoryManager.getFunTransferPage(driver);
	}

	public ChangePasswordPagePO openChangePasswordPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Change Password");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Change Password");
		return PageFactoryManager.getChangePasswordPage(driver);
	}

	public BalanceEnquiryPagePO openBalanceEnquiryPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Balance Enquiry");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Balance Enquiry");
		return PageFactoryManager.getBalanceEnquiryPage(driver);
	}

	public MiniStatementPagePO openMiniStatementPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Mini Statement");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Mini Statement");
		return PageFactoryManager.getMiniStatementPage(driver);
	}

	public CustomisedStatementPagePO openCustomisedStatementPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Customised Statement");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Customised Statement");
		return PageFactoryManager.getCustomisedStatementPage(driver);
	}

	public LoginPagePO openLogoutPage(WebDriver driver) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Log out");
		clickToElement(driver, CommonPageUI.DYNAMIC_PAGE_LINK, "Log out");
		acceptAlert(driver);
		waitForControlVisible(driver, CommonPageUI.LOGIN_PAGE_FORM);
		return PageFactoryManager.getLoginPage(driver);
	}

	public void clickToDynamicSubmitButton(WebDriver driver, String buttonName) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_SUBMIT_BUT, buttonName);
		clickToElement(driver, CommonPageUI.DYNAMIC_SUBMIT_BUT, buttonName);
	}

	public boolean isTransactionDetailofDepositDisplayed(WebDriver driver, String account) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_MESSAGE,
				"Transaction details of Deposit for Account " + account);
		return isControlDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE,
				"Transaction details of Deposit for Account " + account);
	}

	public boolean isTransactionDetailofWithdrawDisplayed(WebDriver driver, String account) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_MESSAGE,
				"Transaction details of Withdrawal for Account " + account);
		return isControlDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE,
				"Transaction details of Withdrawal for Account " + account);
	}

	public boolean isBalaceDetailOfCurrentAccountDisplayed(WebDriver driver, String accountID) {
		waitForControlVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, "Balance Details for Account " + accountID);
		return isControlDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, "Balance Details for Account " + accountID);
	}

}
