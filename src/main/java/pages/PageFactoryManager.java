package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
	private static HomePagePO homePage;
	private static RegisterPagePO registerPage;
	private static LoginPagePO loginPage;
	private static NewCustomerPagePO newCustomerPage;
	private static EditCustomerPagePO editCustomerPage;
	private static DeleteCustomerPagePO deleteCustomerPage;
	private static NewAccountPagePO newAccountPage;
	private static EditAccountPagePO editAccountPage;
	private static DeleteAccountPagePO deleteAccountPage;
	private static DepositPagePO depositPage;
	private static WithdrawalPagePO withdrawalPage;
	private static FundTransferPagePO funTransferPage;
	private static ChangePasswordPagePO changePasswordPage;
	private static BalanceEnquiryPagePO balanceEnquiryPage;
	private static MiniStatementPagePO miniStatementPage;
	private static CustomisedStatementPagePO customisedStatementPage;
	private static LogoutPagePO logoutPage;
	private static CommonPagePO commonPage;

	public static HomePagePO getHomePage(WebDriver driver_) {
		if (homePage == null) {
			return new HomePagePO(driver_);
		}
		return homePage;
	}

	public static CommonPagePO getCommonPage(WebDriver driver_) {
		if (commonPage == null) {
			return new CommonPagePO(driver_);
		}
		return commonPage;
	}

	public static LoginPagePO getLoginPage(WebDriver driver_) {
		if (loginPage == null) {
			return new LoginPagePO(driver_);
		}
		return loginPage;
	}

	public static RegisterPagePO getRegisterPage(WebDriver driver_) {
		if (registerPage == null) {
			return new RegisterPagePO(driver_);
		}
		return registerPage;
	}

	public static NewCustomerPagePO getNewCustomerPage(WebDriver driver_) {
		if (newCustomerPage == null) {
			return new NewCustomerPagePO(driver_);
		}
		return newCustomerPage;
	}

	public static EditCustomerPagePO getEditCustomerPage(WebDriver driver_) {
		if (editCustomerPage == null) {
			return new EditCustomerPagePO(driver_);
		}
		return editCustomerPage;
	}

	public static DeleteCustomerPagePO getDeleteCustomerPage(WebDriver driver_) {
		if (deleteCustomerPage == null) {
			return new DeleteCustomerPagePO(driver_);
		}
		return deleteCustomerPage;
	}

	public static NewAccountPagePO getNewAccountPage(WebDriver driver_) {
		if (newAccountPage == null) {
			return new NewAccountPagePO(driver_);
		}
		return newAccountPage;
	}

	public static EditAccountPagePO getEditAccountPage(WebDriver driver_) {
		if (editAccountPage == null) {
			return new EditAccountPagePO(driver_);
		}
		return editAccountPage;
	}

	public static DeleteAccountPagePO getDeleteAccountPage(WebDriver driver_) {
		if (deleteAccountPage == null) {
			return new DeleteAccountPagePO(driver_);
		}
		return deleteAccountPage;
	}

	public static DepositPagePO getDepositPage(WebDriver driver_) {
		if (depositPage == null) {
			return new DepositPagePO(driver_);
		}
		return depositPage;
	}

	public static WithdrawalPagePO getWithdrawalPage(WebDriver driver_) {
		if (withdrawalPage == null) {
			return new WithdrawalPagePO(driver_);
		}
		return withdrawalPage;
	}

	public static FundTransferPagePO getFunTransferPage(WebDriver driver_) {
		if (funTransferPage == null) {
			return new FundTransferPagePO(driver_);
		}
		return funTransferPage;
	}

	public static ChangePasswordPagePO getChangePasswordPage(WebDriver driver_) {
		if (changePasswordPage == null) {
			return new ChangePasswordPagePO(driver_);
		}
		return changePasswordPage;
	}

	public static BalanceEnquiryPagePO getBalanceEnquiryPage(WebDriver driver_) {
		if (balanceEnquiryPage == null) {
			return new BalanceEnquiryPagePO(driver_);
		}
		return balanceEnquiryPage;
	}

	public static MiniStatementPagePO getMiniStatementPage(WebDriver driver_) {
		if (miniStatementPage == null) {
			return new MiniStatementPagePO(driver_);
		}
		return miniStatementPage;
	}

	public static CustomisedStatementPagePO getCustomisedStatementPage(WebDriver driver_) {
		if (customisedStatementPage == null) {
			return new CustomisedStatementPagePO(driver_);
		}
		return customisedStatementPage;
	}

	public static LogoutPagePO getLogoutPage(WebDriver driver_) {
		if (logoutPage == null) {
			return new LogoutPagePO(driver_);
		}
		return logoutPage;
	}

}
