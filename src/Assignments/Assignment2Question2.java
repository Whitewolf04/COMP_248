package Assignments;

import java.util.Scanner;
public class Assignment2Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		int side, count, circumference, i;
		System.out.println("-------------------------------------------------------------\n"
				+ "\t\tCircumference Calculator\n"
				+ "-------------------------------------------------------------\n");
		
		// 2. User prompt:
		System.out.println("Please enter the length of the side!");
		side = keyIn.nextInt();
		
		// 3. Core logic:
		circumference = side*4;
		
		
		// 4. Output:
		System.out.println("The Circumference of the Square is " + circumference);
		
		// Draw out the Square
		for (count = 1; count <= side; count++) {
			System.out.print("\t\t\t\t");
			for (i = 1; i <= side; i++) {
				if (i == count)
					System.out.print("\\ ");
				else
					System.out.print("X ");
			}
			System.out.print("\n");
		}
		
		// 5. Clean-up:
		keyIn.close();
		

	}

}
