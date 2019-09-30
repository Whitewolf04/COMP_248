package Lesson3;
import java.util.Scanner;
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("What number do you want? ");
		int number = keyboardIn.nextInt();
		if (number > 200)
			System.out.println("Number is SOOO LARGE!");
		else if (number >= 100)
			System.out.println("Number is too large");
		else {
			System.out.println("This number is OK");
			System.out.println("Congratulations");
	}
		
		keyboardIn.close();

	}

}
