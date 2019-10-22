package Assignments;

// -----------------------------------------------------
// Assignment 2 Question 3
// Written by: Tuan To - 40114920
// For COMP 248 Section EC A - Fall 2019
// -----------------------------------------------------

import java.util.Scanner;
public class Assignment2Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		int num1, i;
		double result = 0.0, num2;
		// Put num2 as a double for precise result
		
		String operation = null;
		char operator = 0;
		Scanner keyIn = new Scanner(System.in);
		System.out.println("Hello to mini calculator program."); 
		// Welcome Banner
		
		// 2. User prompt:
		System.out.println("Please enter the numbers along operation (press q to exit):\n");
		operation = keyIn.next();
		// Ask for user input
		
		while(operation.toLowerCase().compareTo("q") != 0) { 
		// Check if user want to exit or continue with the program
	
		// 3. Core Logic:
			for (i = 0; i <= operation.length(); i++) { 
			// Loop for finding the operator
				operator = operation.charAt(i);
				if (operator == 'x')
					break;
				else if (operator == '+')
					break;
				else if (operator == '-')
					break;
				else if (operator == '/')
					break;
			}

			num1 = Integer.parseInt(operation.substring(0, i));
			// Convert from string to integer for the first number
			num2 = Integer.parseInt(operation.substring((i+1), operation.length()));
			// Convert from string to integer for the second number
			
			
			switch (operator) {
			// Calculation for each operator
			case 'x':
				result = num1*num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '+':
				result = num1 + num2;
				break;
			case '/':
				result = num1/num2;
				break;
			}
			
		// 4. Output:		
			System.out.println("\nThe answer is: " + result);
			// Print out the result
				
			System.out.println("Please enter the numbers along operation (press q to exit):\n");
			operation = keyIn.next();
			// Ask if the user want to continue using the program
			
		}
		
		System.out.println("\nThanks for using mini calculator program.");
		// Closing Message
		
		// 5. Clean up:
		keyIn.close();

	}
	



}
