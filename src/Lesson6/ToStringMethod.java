package Lesson6;

public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account(null, 0, 0);
		myAccount.createAccount("Tuan To",  40114920,  23000);	// The System will look for the toString method in the Account file
		System.out.println(myAccount);
		

	}

}
