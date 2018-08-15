package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.DepositPageUI;

public class DepositPagePO extends AbstractPages {
	WebDriver driver;

	public DepositPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputToAccountNoTextbox(String accountNo) {
		waitForControlVisible(driver, DepositPageUI.ACCOUNT_NO_TXT);
		sendKeyToElement(driver, DepositPageUI.ACCOUNT_NO_TXT, accountNo);
	}
	
}
