package Lab;

import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		int num1, num2, num3;
		
		// 2. User prompt:
		System.out.print("Enter 3 words? ");
		num1 = keyIn.next().length();
		num2 = keyIn.next().length();
		num3 = keyIn.next().length();
		
		// 3, 4. Core logic + Output:
		if (num1 < num2 && num2 < num3)
			System.out.println("Words ordered in INCREASING length");
		if (num1 > num2 && num2 > num3)
			System.out.println("Words ordered in DECREASING length");
		if (num1 != num2 || num2 != num3 || num3 != num1)
			System.out.println("At least 2 of the words are not the same length");
		if (num1 == num2 || num2 == num3 || num3 == num1)
			System.out.println("At least 2 of the words are the same length");
		System.out.println("Ouf, lab 1 done!");
		
		// 5. Clean up:
		keyIn.close();
			
			
		

	}

}
