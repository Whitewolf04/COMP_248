package Lab;

/*	COPYRIGHT OF CONCORDIA UNIVERSITY
DEPARTMENT OF ENGINEERING AND COMPUTER SCIENCE

COMP248	LAB7	Fall 2019
PROF: Nancy Acemian

Topic: Simple Class	 
*/

import java.util.Scanner;
public class Function4 {
// CODE TO COMPLETE
// -------------------------
// Declare instance variables
	private int a, b, c, x, y;
	


// Implement default constructor
	public Function4() {
		a = 0;
		b = 0;
		c = 0;
		x = 0;
		y = 0;
	}

// Implement 2nd constructor
	public Function4(int a, int b, int c, int x, int y) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.x = x;
		this.y = y;
	}


// Implement Get/Set methods
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setABC(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


// Implement toString
	public String toString() {
		return("Equation: " + a + "*" + x + "*" + x + " + " + b + "*(" + y + " - 1) + " + c + "*sqrt(" + x + "*" + y + ")");
	}


// Implement equals methods
	public boolean equals(Function4 anotherFunc) {
		return(this.a == anotherFunc.getA() && this.b ==  anotherFunc.getB() && this.c == anotherFunc.getC() &&
				this.x == anotherFunc.getX() && this.y == anotherFunc.getY());
	}


// Implement results methods
	public double result() {
		return(a*Math.pow(x, 2) + b*(y - 1) + c*Math.sqrt(x*y));
	}

// Implement rotateABC method
	public void rotateABC() {
		int temp1 = 0, temp2 = 0;
		temp1 = a;
		temp2 = c;
		c = b;
		b = temp1;
		a = temp2;
	}

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
	Function4 f1 = new Function4(a, b, c, x, y);
	Function4 f2 = new Function4();
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
