package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.BalancePageUI;

public class BalanceEnquiryPagePO extends AbstractPages {
WebDriver driver;
	
	public BalanceEnquiryPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputToAccountNoTextbox(String accountNo)
	{
		waitForControlVisible(driver, BalancePageUI.ACCOUNT_NO_TXT);
		sendKeyToElement(driver, BalancePageUI.ACCOUNT_NO_TXT, accountNo);
	}

	public HomePagePO clickToSubmitButton()
	{
		waitForControlVisible(driver, BalancePageUI.SUBMIT_BUT);
		clickToElement(driver, BalancePageUI.SUBMIT_BUT);
		return PageFactoryManager.getHomePage(driver);
	}
	public void clickToResetButton()
	{
		waitForControlVisible(driver, BalancePageUI.RESET_BUT);
		clickToElement(driver, BalancePageUI.RESET_BUT);	
	}
	
	public Double getValueBalanceAmount() {
		waitForControlVisible(driver, BalancePageUI.BALANCE);
		String value = getTextElement(driver, BalancePageUI.BALANCE);
		return Double.parseDouble(value);
	}
}
