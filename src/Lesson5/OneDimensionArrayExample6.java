package Lesson5;

import java.util.Scanner;
public class OneDimensionArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		int[] childrenAge = new int[30];
		int age;
		int[] yearOld = new int[11];
		Scanner keyIn = new Scanner (System.in);
		
		// 2. User prompt:
		System.out.println("Enter the age of the 30 children (from 0 to 10):");
		for (int i = 0; i < childrenAge.length; i++) {
			age = keyIn.nextInt();
			childrenAge[i] = age;
			yearOld[age] += 1;		
		}
		
		// 3. Core logic:
		
		
		// 4. Output:
		for (int k = 0; k < yearOld.length; k++)
			System.out.println(yearOld[k] + " children are " + k + " years old");
		
		// 5. Clean up:
		keyIn.close();

	}

}
