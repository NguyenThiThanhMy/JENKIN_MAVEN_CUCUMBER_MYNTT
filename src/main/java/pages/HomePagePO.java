package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;
import interfaces.HomePageUI;

public class HomePagePO extends AbstractPages {
	WebDriver driver;

	public HomePagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public boolean isWelcomeMessageDisplayed(String message) {
		waitForControlVisible(driver, HomePageUI.WELCOME_MRSSAGE,message);
		return isControlDisplayed(driver, HomePageUI.WELCOME_MRSSAGE,message);
	}

}
