package Lesson6;

import java.util.Scanner;
public class StaticMethodExercise {

	public static void main(String[] args) {
		// Variable declarations
		int gender;					// 0=male, 1=female
		int mom_feet, mom_inches;
		int dad_feet, dad_inches;
		int child_total_inches;
		Scanner keyIn = new Scanner(System.in);

		do
		{
			//Prompt for gender, height of mom and dad in feet and inches
			gender = getGender(keyIn);

			System.out.println("Enter the height in feet then the height " +
					"in inches of the mom.");
			mom_feet = keyIn.nextInt();
			mom_inches = keyIn.nextInt();

			System.out.println("Enter the height in feet then the height " +
					"in inches of the dad.");
			dad_feet = keyIn.nextInt();
			dad_inches = keyIn.nextInt();

			// Convert input to all inches and get the estimate for the child
			int mother_height = convertToInches(mom_feet, mom_inches);
			int father_height = convertToInches(dad_feet, dad_inches);
					
			child_total_inches = calculateHeight(gender,mother_height, father_height);
					

			// Output the estimated height
			System.out.println("Your future child is estimated to grow to " +
					child_total_inches / 12 + " feet and " +
					child_total_inches % 12 + " inches.");
			System.out.println();
		}
		while (askAgain(keyIn));
				
		keyIn.close();

	}
	
	public static int getGender (Scanner input) {
		int output;
		System.out.print("Please enter the gender of your future child (1 for female, 0 for male): ");
		output = input.nextInt();
		return output;
	}
	
	public static int convertToInches(int feet, int inches) {
		inches += feet*12;
		return inches;
	}
	
	public static int calculateHeight(int gender, int mom, int dad) {
		int childHeight = 0;
		if (gender == 1) {
			childHeight = (mom * 13/12 + dad)/2;
		} else {
			childHeight = (dad * 12/13 + mom)/2;
		}
		return childHeight;
	}
	
	public static boolean askAgain(Scanner input) {
		System.out.print("Enter 'Y' to run again, anything else to exit!");
		return (input.next().toUpperCase() == "Y");
	}

}
