package Assignments;

//----------------------------------------------
//Assignment 3 - Question 2
//Written by: Minh Tuan To - 40114920
//For COMP 248 Section EC  - Fall 2019
//----------------------------------------------

public class Assignment3Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu1 = new CPU();
		CPU cpu2 = new CPU(9, "i7", 449.00, 4.9, "Q2'19", true);
		
		// Welcome banner
		System.out.println("Welcome to the simple class example!\n");
		
		// Printing the description of the 2 CPUs
		System.out.println(cpu1);
		System.out.println(cpu2);
		
		// Testing accessor methods
		System.out.println("CPU 1 Series: " + cpu1.series());
		System.out.println("CPU 2 Speed: " + cpu2.speed() + "Ghz");
		
		// Testing the mutator method
		System.out.println("CPU 1 suggested price is: " + cpu1.priceInUSD());
		cpu1.setPrice(110);
		System.out.println("CPU 1 suggested price is (after mutator call): " + cpu1.priceInUSD());
		
		// Testing the equals method
		System.out.print("Are CPU 1 and CPU 2 equal? ");
		if (cpu1.equals(cpu2))
			System.out.print("YES\n");
		else
			System.out.print("NO\n");
		
		// Testing the isHigherGeneration method
		System.out.print("Is CPU 1 of higher generation than CPU 2? ");
		if (cpu1.isHigherGeneration(cpu2))
			System.out.print("YES\n");
		else
			System.out.print("NO\n");
		
		// Print the current price of the 2 CPUs
		System.out.println("CPU 1 price at Q3'19: " + cpu1.priceNow("Q3'19") + " USD");
		System.out.println("CPU 2 price at Q3'19: " + cpu2.priceNow("Q3'19") + " USD");
		
		// Closing statement
		System.out.println("\nThank you for testing the simple class example!");

	}

}
