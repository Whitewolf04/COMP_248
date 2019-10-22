package Lesson4;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		String str, another = "y";
		do {
			
			int left, right;
			System.out.print("Please enter the word you want to check: ");
			str = keyIn.next();
			left = 0;
			right = str.length() - 1;
			while (str.charAt(left) == str.charAt(right) && right > left) {
				left++;
				right--;
			}
			if (right > left)
				System.out.println("This is a palindrome");
			else
				System.out.println("This is not a palindrome");
			System.out.print("Test another string? (y/n): ");
			another = keyIn.next();
		} while (another.toLowerCase().equals("y"));
		
		System.out.println("Thank you for using the program!");
		
		keyIn.close();

	}

}
