package Lesson4;

import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		int sum, num1, num2;
		String respond;
		
		do {
			System.out.print("Please enter the two numbers for addition: ");
			num1 = keyIn.nextInt();
			num2 = keyIn.nextInt();
			
			sum = num1 + num2;
			System.out.println("This is the sum of those number: " + sum);
			
			System.out.print("Do you wish to continue (Y or N): ");
			respond = keyIn.next();
		} while (respond.toUpperCase().compareTo("Y") == 0);
		
		keyIn.close();


	}

}
