package Lesson6;

import java.util.Scanner;
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1 = keyIn.nextInt();
		num1 = changeNum(num1);		// Static method doesn't need an object to call it
		System.out.println("Enter the second number: ");
		num2 = keyIn.nextInt();
		num2 = changeNum(num2);		// Static method doesn't need an object to call it
		System.out.println("The sum of the two numbers is " + (num1 + num2));
		keyIn.close();
	}
	
	public static int changeNum(int n) {
		if(n%2 == 0)
			n++;
		else
			n += 2;
		return n;
	}

}
