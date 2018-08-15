package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.NewAccountPageUI;

public class NewAccountPagePO extends AbstractPages {
	WebDriver driver;

	public NewAccountPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputToCustomerIDTextbox(String customerID) {
		waitForControlVisible(driver, NewAccountPageUI.CUSTOMER_ID_TXT);
		sendKeyToElement(driver, NewAccountPageUI.CUSTOMER_ID_TXT, customerID);
	}
	
	public String getAccountID() {
		waitForControlVisible(driver, NewAccountPageUI.ACCOUNT_ID_TEXT);
		return getTextElement(driver, NewAccountPageUI.ACCOUNT_ID_TEXT);
	}

}
