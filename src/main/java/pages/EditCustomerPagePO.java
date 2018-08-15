package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.EditCustomerPageUI;

public class EditCustomerPagePO extends AbstractPages {
WebDriver driver;
	
	public EditCustomerPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	//Login edit customer form
	public void inputToCustomerID(String customerID) {
		waitForControlVisible(driver, EditCustomerPageUI.CUSTOMER_ID_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID_TXT, customerID);
	}
	
	public void clickToSubmitButtonOnLoginEditCustomer() {
		waitForControlVisible(driver, EditCustomerPageUI.SUBMIT_BUT);
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BUT);
	}
	
	public void clickToResetButtonOnLoginEditCustomer() {
		waitForControlVisible(driver, EditCustomerPageUI.RESET_BUT);
		clickToElement(driver, EditCustomerPageUI.RESET_BUT);
	}
	
	//Edit Customer information
	public void inputToAddressTextbox(String address) {
		waitForControlVisible(driver, EditCustomerPageUI.ADDRESS_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.ADDRESS_TXT, address);
	}
	public void inputToCityTextbox(String city) {
		waitForControlVisible(driver, EditCustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.CITY_TXT, city);
	}
	public void inputToStateTextbox(String state) {
		waitForControlVisible(driver, EditCustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.STATE_TXT, state);
	}
	public void inputToPinTextbox(String pin) {
		waitForControlVisible(driver, EditCustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.PIN_TXT, pin);
	}
	public void inputToTelephoneTextbox(String phoneNumber) {
		waitForControlVisible(driver, EditCustomerPageUI.TELEPHONE_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.TELEPHONE_TXT, phoneNumber);
	}
	public void inputToEmailTextbox(String email) {
		waitForControlVisible(driver, EditCustomerPageUI.EMAIL_TXT);
		sendKeyToElement(driver, EditCustomerPageUI.EMAIL_TXT, email);
	}
	
	public HomePagePO clickToSubmitButton() {
		waitForControlVisible(driver, EditCustomerPageUI.SUBMIT_EDIT_CUSTOMER_BUT);
		clickToElement(driver, EditCustomerPageUI.SUBMIT_EDIT_CUSTOMER_BUT);
		return PageFactoryManager.getHomePage(driver);
	}
	public void clickToResetButton() {
		waitForControlVisible(driver, EditCustomerPageUI.RESET_EDIT_CUSTOMER_BUT);
		clickToElement(driver, EditCustomerPageUI.RESET_EDIT_CUSTOMER_BUT);
	}
}
