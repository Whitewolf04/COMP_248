package Lesson2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		System.out.println("What is your favourite number? ");
		int number = myKeyboard.nextInt();
		System.out.println("Here is your lucky number: " + number);
		myKeyboard.close();
		

	}

}