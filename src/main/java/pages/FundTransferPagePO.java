package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.FundTransferUI;

public class FundTransferPagePO extends AbstractPages {
	WebDriver driver;

	public FundTransferPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputToPayersAccountTextbox(String payersAccount) {
		waitForControlVisible(driver, FundTransferUI.PAYERS_ACCOUNT_TXT);
		sendKeyToElement(driver, FundTransferUI.PAYERS_ACCOUNT_TXT, payersAccount);
	}

	public void inputToPayeesAccountTextbox(String payeesAccount) {
		waitForControlVisible(driver, FundTransferUI.PAYEES_ACCOUNT_TXT);
		sendKeyToElement(driver, FundTransferUI.PAYEES_ACCOUNT_TXT, payeesAccount);
	}

	public void inputToAmountTextbox(String amount) {
		waitForControlVisible(driver, FundTransferUI.AMOUNT_TXT);
		sendKeyToElement(driver, FundTransferUI.AMOUNT_TXT, amount);
	}

	public void inputToDescriptionTextbox(String description) {
		waitForControlVisible(driver, FundTransferUI.DESCRIPTION_TXT);
		sendKeyToElement(driver, FundTransferUI.DESCRIPTION_TXT, description);
	}

	public HomePagePO clickToSubmitButton() {
		waitForControlVisible(driver, FundTransferUI.SUBMIT_BUT);
		clickToElement(driver, FundTransferUI.SUBMIT_BUT);
		return PageFactoryManager.getHomePage(driver);
	}

	public void clickToResetButton() {
		waitForControlVisible(driver, FundTransferUI.RESET_BUT);
		clickToElement(driver, FundTransferUI.RESET_BUT);
	}
	
	public String getAmountAfterFunTransfer() {
		waitForControlVisible(driver, FundTransferUI.AMOUNT_AFTER_FUND_TRANSFER);
		return getTextElement(driver, FundTransferUI.AMOUNT_AFTER_FUND_TRANSFER);
	}

	public Double calculateValueAfterFundTransfer(Double totalAmount, String amountFundTransfer) {
		Double currentBalance = totalAmount - Double.parseDouble(amountFundTransfer);
		return currentBalance;
	}
}
