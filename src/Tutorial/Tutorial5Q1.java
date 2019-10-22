package Tutorial;

import java.util.Scanner;
public class Tutorial5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		int weight;
		Scanner keyIn = new Scanner(System.in);
		
		// 2. User prompt:
		System.out.print("Please enter the weight in pounds: ");
		weight = keyIn.nextInt();
		
		//3. Core logic:
		if (weight < 116)
			System.out.println("Eat 5 bananas splits!");
		else if (weight >= 116)
			if (weight <= 130)
				System.out.println("Eat a banana split!");
			else if (weight >= 131)
				if (weight <= 200)
					System.out.println("Perfect!");
				else
				System.out.println("Plenty of banana splits have been consumed!");
		
		// 5. Clean-up:
		keyIn.close();

	}

}