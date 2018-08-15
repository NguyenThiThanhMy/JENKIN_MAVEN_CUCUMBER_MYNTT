package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.RegisterPageUI;

public class RegisterPagePO extends AbstractPages {

	WebDriver driver;
	
	public RegisterPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputToEmailTextbox(String email) {
		waitForControlVisible(driver, RegisterPageUI.EMAIL_ID_TXT);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_ID_TXT, email);
	}

	public void clickToSubmitButton() {
		waitForControlVisible(driver, RegisterPageUI.SUBMIT_BTN);
		clickToElement(driver, RegisterPageUI.SUBMIT_BTN);
	}

	public String getUserIDInfor() {
		waitForControlVisible(driver, RegisterPageUI.USER_ID_TXT);
		return getTextElement(driver, RegisterPageUI.USER_ID_TXT);
	}

	public String getPasswordInfor() {
		waitForControlVisible(driver, RegisterPageUI.PASSWORD_TXT);
		return getTextElement(driver, RegisterPageUI.PASSWORD_TXT);
	}

	public LoginPagePO openLoginPage(String loginPageUrl) {
		openAnyUrl(driver, loginPageUrl);
		return PageFactoryManager.getLoginPage(driver);
	}
}
