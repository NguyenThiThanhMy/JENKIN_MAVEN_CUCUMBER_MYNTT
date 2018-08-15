package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.DeleteAccountPageUI;

public class DeleteAccountPagePO extends AbstractPages {
	WebDriver driver;

	public DeleteAccountPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputToAccountNoTextbox(String accountNo) {
		waitForControlVisible(driver, DeleteAccountPageUI.ACCOUNT_NO_TXT);
		sendKeyToElement(driver, DeleteAccountPageUI.ACCOUNT_NO_TXT, accountNo);
	}
	
	public HomePagePO clickToSubmitButton() {
		waitForControlVisible(driver, DeleteAccountPageUI.SUBMIT_BUT);
		clickToElement(driver, DeleteAccountPageUI.SUBMIT_BUT);
		return PageFactoryManager.getHomePage(driver);
	}

	public void clickToResetButton() {
		waitForControlVisible(driver, DeleteAccountPageUI.RESET_BUT);
		clickToElement(driver, DeleteAccountPageUI.RESET_BUT);

	}
	
	public void acceptDeleteAccountAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}
	
	public String getDeleteAccountSucessfullyAlert() {
		waitForAlertPresence(driver);
		return getTextAlert(driver);
	}
	
	
}
