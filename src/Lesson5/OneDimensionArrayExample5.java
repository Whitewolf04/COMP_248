package Lesson5;

import java.util.Scanner;
public class OneDimensionArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		double average = 0.0;
		int aboveAverage = 0, student;
		double[] scores;
		
		// 2. User prompt:
		System.out.print("How many students? ");
		student = keyIn.nextInt();
		scores = new double[student];
		
		for (int i = 1; i <= scores.length; i++) {
			System.out.print("Please enter mark nb " + i + ": ");
			scores[i-1] = keyIn.nextDouble(); 
		}
		
		// 3. Core logic:
		for (int k = 0; k < scores.length; k++) {
			average += scores[k];
		}
		average = average / scores.length;
		
		for (int t = 0; t < scores.length; t++) {
			if (scores[t] > average)
				aboveAverage += 1;
			else
				continue;
		}
		
		// 4. Output:
		System.out.println("\nThe average is: " + average);
		if (aboveAverage != 0)
			System.out.println(aboveAverage + " students have a mark higher than the average.");
		
		// 5. Clean up:
		keyIn.close();
		
		
		

	}

}
