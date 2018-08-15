package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.NewCustomerPageUI;

public class NewCustomerPagePO extends AbstractPages {
	WebDriver driver;

	public NewCustomerPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public String getCustomerID() {
		waitForControlVisible(driver, NewCustomerPageUI.DYNAMIC_CUSTOMER_ID_TEXT);
		return getTextElement(driver, NewCustomerPageUI.DYNAMIC_CUSTOMER_ID_TEXT);
	}
	
	
}
