package Lesson3;
import java.util.Scanner;
public class NestedIfExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		int year;
		boolean leap;
		
		// 2. User prompt:
		System.out.print("Please enter the year you want to check: ");
		year = keyIn.nextInt();
		
		// 3. Core logic:
		if (year % 400 == 0)
			leap = true;
		else {
			if (year % 100 == 0)
				leap = false;
			else {
				if (year % 4 == 0)
					leap = true;
				else
					leap = false;
			}
		}
		
		// 4. Output:
		if (leap == true)
			System.out.println("This is a leap year!");
		else
			System.out.println("This is not a leap year!");
		
		// 5. Clean-up:
		keyIn.close();
		

	}

}
