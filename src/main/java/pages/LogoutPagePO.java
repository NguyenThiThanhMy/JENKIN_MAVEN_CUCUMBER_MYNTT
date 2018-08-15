package pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;

public class LogoutPagePO extends AbstractPages {
WebDriver driver;
	
	public LogoutPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
}
