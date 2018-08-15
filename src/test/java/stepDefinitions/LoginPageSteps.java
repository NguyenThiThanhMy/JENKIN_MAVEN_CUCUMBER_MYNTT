package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pages.LoginPagePO;
import pages.PageFactoryManager;

public class LoginPageSteps extends ShareData {
	WebDriver driver;
	private LoginPagePO loginPage;

	public LoginPageSteps() {
		driver = Hooks.openBrowser();
		loginPage = PageFactoryManager.getLoginPage(driver);
	}

	@Given("^I get login url$")
	public void i_get_login_url() {
		ShareData.loginUrl = loginPage.getLoginPageUrl();

	}

	@When("^I click to here link$")
	public void i_click_to_here_link() {
		loginPage.clickToHereLink();
	}

	@When("^I intput to UserID textbox$")
	public void i_input_to_username_textbox() {
		loginPage.inputToUsernameTextbox(ShareData.userName);
	}

	@When("^I input to Password textbox$")
	public void i_input_to_password_textbox() {
		loginPage.inputToPasswordTextbox(ShareData.password);
	}

}
