package interfaces;

public class WithdrawalPageUI {
	public static final String ACCOUNT_NO_TXT= "//input[@name='accountno']";
	public static final String AMOUNT_TXT= "//input[@name='ammount']";
	public static final String DESCRIPTION_TXT= "//input[@name='desc']";
	public static final String SUBMIT_BUT= "//input[@name='AccSubmit']";
	public static final String RESET_BUT= "//input[@name='res']";
	public static final String CURRENT_BALANCE_AFTER_WITHDRAW="//td[text()='Current Balance']/following-sibling::td";
}
