package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractTest;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pages.HomePagePO;
import pages.PageFactoryManager;

public class HomePageSteps {
	WebDriver driver;
	private HomePagePO homePage;
	private AbstractTest abstracTest;
	
	public HomePageSteps() {
		driver = Hooks.openBrowser();
		homePage=PageFactoryManager.getHomePage(driver);
		abstracTest = new AbstractTest();
	}
	
	@Then("^I verify Homepage displayed with message \"([^\"]*)\"$")
    public void i_verify_homepage_displayed_with_message_something(String homePageMessage){
		abstracTest.verifyTrue(homePage.isWelcomeMessageDisplayed(homePageMessage));   
    }
	
}
