package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.PageFactoryManager;
import pages.RegisterPagePO;

public class RegisterPageSteps extends ShareData {

	WebDriver driver;
	private RegisterPagePO registerPage;

	public RegisterPageSteps() {
		driver = Hooks.openBrowser();
		registerPage = PageFactoryManager.getRegisterPage(driver);
	}

	@When("^I get infor of User ID$")
	public void i_get_to_username_information() {
		ShareData.userName = registerPage.getUserIDInfor();
	}

	@When("^I get infor of Password$")
	public void i_get_to_password_information() {
		ShareData.password = registerPage.getPasswordInfor();
	}
	
	@When("^I open login page again$")
	public void i_open_to_login_page() {
		registerPage.openLoginPage(ShareData.loginUrl);
	}
}
