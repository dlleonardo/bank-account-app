package bankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account extends Person implements AccountInt {
	// Variables
	private int balance;
	private String customerID;
	private List<Integer> ledger;
	
	// Constructor
	Account(String cFirstName, String cLastName, String cNationality, String cCity, String cAddress,
			Integer cPhoneNumber, String cID) {
		super(cFirstName, cLastName, cNationality, cCity, cAddress, cPhoneNumber);
		this.customerID = cID;
		this.balance = 0;
		this.ledger = new ArrayList<>();
	}
	
	// Deposit funds
	public void deposit(int amount) {
		if( amount > 0 ) {
			balance += amount;
			ledger.add(amount);
		}
	}
	
	// Withdraw funds
	public boolean withdraw(int amount) {
		if( balance >= amount ) {
			balance -= amount;
			ledger.add( (amount*(-1)) );
			return true;
		}
		return false;
	}
	
	// Check funds
	public int get_funds() {
		return balance;
	}
	
	// Get account personal details
	public String get_account_details() {
		return "Full name: "+first_name+" "+last_name+", Nationality: "+nationality+"\nAddress: "
				+city+" "+address+", Phone Number: "+phone_number+"\n"
				+"Customer ID: "+customerID;
	}
	
	// Get historical
	public String get_historical() {
		String output = "Historical:\n";
			for(int i = 0; i < ledger.size(); i++) {
				output += String.valueOf(ledger.get(i)) + "\n";
			}
		return output;
	}
	
	public boolean transfer_funds(int amount, Account dest) {
		if( balance >= amount ) {
			balance -= amount;
			dest.balance += amount;
			return true;
		}
		return false;
	}
	
	// Main menu
	public void menu() {
		String str_menu = "1 --> Deposit funds\n2 --> Withdraw funds\n3 --> Get balance\n4 --> Get accounts details\n"
						+ "5 --> Get historical\n6 --> Transfer funds to another user\n7 --> Show commands\n"
						+ "8 --> Exit";
		
		System.out.println("Welcome " + first_name +" " + last_name + ", " + customerID);
		System.out.println("Insert a number to chose a command\n");
		System.out.println(str_menu);
		Scanner sc = new Scanner(System.in);
		
		while( true ) {
			int cmd = sc.nextInt();
		
			if( cmd == 1 ) {
				System.out.println("Insert the amount");
				int amount = sc.nextInt();
				this.deposit(amount);
			}
			else if( cmd == 2 ) {
				System.out.println("Insert the amount");
				int amount = sc.nextInt();
				if( !withdraw(amount) ) {
					System.out.println("Not enough funds");
				}
			}
			else if( cmd == 3 ) {
				int balance = get_funds();
				System.out.println(balance);
			}
			else if( cmd == 4 ) {
				System.out.println(get_account_details());
			}
			else if( cmd == 5 ) {
				System.out.println(get_historical());
			}
			else if( cmd == 6 ) {
				// Transfer funds to another user
				System.out.println("Insert the amount");
				
			}
			else if( cmd == 7 ) {
				System.out.println(str_menu);
			}
			else if( cmd == 8 ) {
				sc.close();
				break;				
			}
			else {
				System.out.println("Invalid command");
			}
		}
	}
}
