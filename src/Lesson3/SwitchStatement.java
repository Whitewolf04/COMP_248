package Lesson3;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyboard = new Scanner(System.in);
		int category, grade;
		
		// 2. User prompt:
		System.out.print("Please input the student grade: ");
		grade = keyboard.nextInt();
		
		// 3 + 4: Core logic + Output:
		category = grade / 10;
		switch(category) {
		case 10: 
		case 9:
			System.out.println("excellent.");
			break;
			//if this break is commented out, the system will continue to the next line until it finds a break 
		case 8:
			System.out.println("nice job.");
			break;
		case 7:
			System.out.println("average.");
			break;
		case 6:
			System.out.println("below average.");
			break;
		default:
			System.out.println("problem.");
		}
		
		// 5. Clean-up:
		keyboard.close();
	}

}
