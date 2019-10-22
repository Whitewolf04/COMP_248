package Assignments;

// -------------------------------------------------
// Assignment 2 Question 2
// Written by Tuan To - 40114920
// For COMP 248 Section EC A - Fall 2019
// -------------------------------------------------

import java.util.Scanner;
public class Assignment2Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		int side, circumference;
		System.out.println("-------------------------------------------------------------\n"
				+ "\t\tCircumference Calculator\n"
				+ "-------------------------------------------------------------\n");
		// Welcome Banner
		
		// 2. User prompt:
		System.out.println("Please enter the length of the side!");
		side = keyIn.nextInt();
		
		// 3. Core logic:
		circumference = side*4;
		
		
		// 4. Output:
		System.out.println("The Circumference of the Square is " + circumference);
		
		// Draw out the Square
		for (int count = 1; count <= side; count++) {
			System.out.print("\t\t\t\t");
			for (int i = 1; i <= side; i++) {
				if (i == count)
					System.out.print("\\ ");
					// Printing the diagonal line
				else
					System.out.print("X ");
					// Printing horizontal lines
			}
			System.out.print("\n");
			// Printing vertical lines
		}
		
		// 5. Clean-up:
		keyIn.close();
		

	}

}
