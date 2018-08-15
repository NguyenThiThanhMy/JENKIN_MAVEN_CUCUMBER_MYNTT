package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.WithdrawalPageUI;

public class WithdrawalPagePO extends AbstractPages {
WebDriver driver;
	
	public WithdrawalPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputToAccountNoTextbox(String accountNo)
	{
		waitForControlVisible(driver, WithdrawalPageUI.ACCOUNT_NO_TXT);
		sendKeyToElement(driver, WithdrawalPageUI.ACCOUNT_NO_TXT, accountNo);
	}
	public void inputToAmountTextbox(String amount)
	{
		waitForControlVisible(driver, WithdrawalPageUI.AMOUNT_TXT);
		sendKeyToElement(driver, WithdrawalPageUI.AMOUNT_TXT, amount);
	}

	public void inputToDescriptionTextbox(String description) {
		waitForControlVisible(driver, WithdrawalPageUI.DESCRIPTION_TXT);
		sendKeyToElement(driver, WithdrawalPageUI.DESCRIPTION_TXT, description);
	}

	public HomePagePO clickToSubmitButton()
	{
		waitForControlVisible(driver, WithdrawalPageUI.SUBMIT_BUT);
		clickToElement(driver, WithdrawalPageUI.SUBMIT_BUT);
		return PageFactoryManager.getHomePage(driver);
	}
	public void clickToResetButton()
	{
		waitForControlVisible(driver, WithdrawalPageUI.RESET_BUT);
		clickToElement(driver, WithdrawalPageUI.RESET_BUT);
		
	}
	public Double getValueCurrentBalanceAfterWithdraw() {
		waitForControlVisible(driver, WithdrawalPageUI.CURRENT_BALANCE_AFTER_WITHDRAW);
		String currentBalance = getTextElement(driver, WithdrawalPageUI.CURRENT_BALANCE_AFTER_WITHDRAW);
		return Double.parseDouble(currentBalance);
	}

	public Double calculateValueAfterWithdraw(Double totalAmount, String withDraw) {
		Double currentBalance = totalAmount - Double.parseDouble(withDraw);
		return currentBalance;
	}
}
