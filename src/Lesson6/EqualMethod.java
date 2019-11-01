package Lesson6;

public class EqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account tuanAccount = new Account(null, 0, 0);
		Account anotherAccount = new Account(null, 0, 0);
		tuanAccount.createAccount("Tuan To",  40114920,  23000);
		anotherAccount.createAccount("Tuan To",  40114920,  23000);
		
		if (tuanAccount.equals(anotherAccount))
			System.out.println("The two accounts are the same");
		else
			System.out.println("They are not the same!!!!");
		// The system will look for the equal method on the Account file

	}

}
