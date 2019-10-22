package Assignments;
// -----------------------------------------------
// Assignment 1 - Question 2
// Written by: Minh Tuan To - 40114920
// For COMP 248 Section EC A - Fall 2019
// -----------------------------------------------

import java.util.Scanner;
public class Assignment1Question2 {
	
		public static void main(String[] args) {
			
			// 1. Initialization
			Scanner keyboardIn = new Scanner(System.in);
			int hour, minute, seconds;
			int firstDigit, lastDigit;
			
			// Print out the Welcome banner
			System.out.println("*****************************************************\n"
					+ "\tWelcome to Time Converter Program\n"
					+ "*****************************************************\n"
					);
			
			// 2. User prompt and input
			System.out.print("Please enter the seconds that will be converted: ");
			int numberOfSeconds = keyboardIn.nextInt();
						
			// 3. Core logic
			// Calculating number of hours, minutes, and seconds
			hour = numberOfSeconds / 3600;
			minute = (numberOfSeconds - hour*3600) / 60;
			seconds = numberOfSeconds - hour*3600 - minute*60;
			
			//Print out the correspond time
			System.out.println("\nThe corerspond hours, minutes, seconds is " + hour + " hrs, " + minute + " mins, " + seconds + " secs.\n");
			
			// Calculate the first and last digit of the input
			firstDigit = numberOfSeconds / 10000;
			lastDigit = numberOfSeconds - ((numberOfSeconds / 10) * 10);
			
			// Check if the time is valid
			if (numberOfSeconds > 86400)
				{// If the time is not valid, print out the error
				System.out.println("There is no valid time of your input.\n");
				
				// Swap the first and last digit of the input
				numberOfSeconds = numberOfSeconds - firstDigit*10000 + lastDigit*10000;
				numberOfSeconds = numberOfSeconds - lastDigit + firstDigit;
				
				// Print out the new swapped input
				System.out.println("The swapped sequence of the input time is: " + numberOfSeconds + "\n");
				
				// Recalculate
				hour = numberOfSeconds / 3600;
				minute = (numberOfSeconds - hour*3600) / 60;
				seconds = numberOfSeconds - hour*3600 - minute*60;
				
				//Print out the new correspond time
				System.out.println("The correspond hours, minutes, seconds is " + hour + " hrs, "  + minute + " mins, " + seconds + " secs.\n");
				}
			
			// 4. Output
			// Print out the valid time
			else
				{System.out.print("The valid time is: ");
				// Printing hours
				if (hour == 0)
					System.out.print("00:");
				else
					System.out.print(hour + ":");
				
				// Printing minutes
				if (minute == 0)
					System.out.print("00:");
				else
					System.out.print(minute + ":");
				
				// Printing seconds
				if (seconds == 0)
					System.out.println("00.\n");
				else
					System.out.println(seconds + ".\n");
				}
			
			// Print out the closing of the program
			System.out.println("Thank you for using the Time Converter Program!");
			
			// 5. Clean-up
			keyboardIn.close();
	
	} // End of program
} 
