package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.DeleteAccountPageUI;
import interfaces.DeleteCustomerPageUI;

public class DeleteCustomerPagePO extends AbstractPages {
WebDriver driver;
	
	public DeleteCustomerPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputToCustomerIDTextbox(String customerID) {
		waitForControlVisible(driver, DeleteCustomerPageUI.CUSTOMER_ID);
		sendKeyToElement(driver, DeleteCustomerPageUI.CUSTOMER_ID, customerID);
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
	public void acceptDeleteCustomerAlert() {
		waitForAlertPresence(driver);
		acceptAlert(driver);
	}
	
	public String getDeleteCustomerSucessfullyAlert() {
		waitForAlertPresence(driver);
		return getTextAlert(driver);
	}
}
