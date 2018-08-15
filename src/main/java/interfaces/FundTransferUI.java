package interfaces;

public class FundTransferUI {
	public static final String PAYERS_ACCOUNT_TXT ="//input[@name='payersaccount']";
	public static final String PAYEES_ACCOUNT_TXT ="//input[@name='payeeaccount']";
	public static final String AMOUNT_TXT ="//input[@name='ammount']";
	public static final String DESCRIPTION_TXT ="//input[@name='desc']";
	public static final String SUBMIT_BUT ="//input[@name='AccSubmit']";
	public static final String RESET_BUT ="//input[@name='res']";
	public static final String AMOUNT_AFTER_FUND_TRANSFER="//td[text()='Amount']/following-sibling::td";
}
