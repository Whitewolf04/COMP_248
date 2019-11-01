package Lesson6;

public class Account {
	private String name;
	private int accountNumber;
	private double balance = 0.0;
	
	// This is a constructor
	public Account(String theOwner, int theAccount, double initialAmount) {
		name = theOwner;
		accountNumber = theAccount;
		balance = initialAmount;
	}

	public String toString() {
		return ("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);
	}
	
	public void createAccount(String id, int accountNum, double deposit) {
		name = id;
		accountNumber = accountNum;
		balance += deposit;
	}
	
	public boolean equals(Account anotherAccount) {
		return(accountNumber == anotherAccount.accountNumber &&
				balance == anotherAccount.balance &&
				name.equalsIgnoreCase(anotherAccount.name));
	}
	
	
	}
