/*	COPYRIGHT OF CONCORDIA UNIVERSITY
	DEPARTMENT OF ENGINEERING AND COMPUTER SCIENCE

	COMP248	LAB7	Fall 2019
	PROF: Nancy Acemian

	Topic: Simple Class	 
 */

import java.util.Scanner;
public class Function_4 {
	// CODE TO COMPLETE
	// -------------------------
	// Declare instance variables
	
	
	// Implement default constructor
	
	// Implement 2nd constructor
	
	
	// Implement Get/Set methods
	
	
	// Implement toString
	
	
	// Implement equals methods
	
	
	// Implement results methods
	
	// Implement rotateABC method

	/* ================================================================================================== */
	/* =====*****-----+++++!!!!! DO NOT ALTER, CHANGE, OR MODIFY THE CODE BELOW !!!!!+++++-----*****===== */
	/* ================================================================================================== */
	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int a, b, c, x, y;
		System.out.print("Enter 3 integer coefficients: ");
		a = keyIn.nextInt();
		b = keyIn.nextInt();
		c = keyIn.nextInt();
		System.out.print("Enter x and y (both integers): ");
		x = keyIn.nextInt();
		y = keyIn.nextInt();
		Function_4 f1 = new Function_4(a, b, c, x, y);
		Function_4 f2 = new Function_4();
		System.out.println("\nThe two functions are:");
		System.out.println(f1 + " = "+ f1.result() + "\n"
				+ f2 + " = "+ f2.result() );
		
		System.out.print("\nEnter x and y for the second function: ");
		x = keyIn.nextInt();
		y = keyIn.nextInt();
		f2.setX(x);
		f2.setY(y);
		f2.setABC(f1.getA(), f1.getB(),f1.getC());
		System.out.println("Second function is now " +f2);
		System.out.println("\nThe two functions are the same is " +f1.equals(f2));
		
		f2.rotateABC();
		System.out.println("\nAfter rotating the coefficients, the 2nd function now is:\n" + f2);
		System.out.println("\nThe two functions now are the same is " +f1.equals(f2));
		System.out.println("\nThe final version of the two functions are:");
		System.out.print(f1 + " = "+ f1.result() + "\n"
				+ f2 + " = "+ f2.result() );
		keyIn.close();
	}

}
