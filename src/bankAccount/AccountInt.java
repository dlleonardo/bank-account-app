package bankAccount;

public interface AccountInt {
	void deposit(int amount);
	boolean withdraw(int amount);
	int get_funds();
	String get_account_details();
	String get_historical();
	void menu();
	boolean transfer_funds(int amount, Account dest);
}
