package Assignments;

import java.util.Scanner;
public class Assignment2Question1VerB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyboard = new Scanner(System.in);
		int month;
		String season = null, nameOfMonth = null;
		boolean validMonth = true;
				
		// 2. User prompt:
		System.out.print("Please enter the Month as a number 1-12: ");
		month = keyboard.nextInt();
				
		// 3. Core logic:
		switch (month) {
		case 1:
			season = "Spring";
			nameOfMonth = "Farvardin";
			break;
		case 2:
			nameOfMonth = "Ordibehesht";
			season = "Spring";
			break;
		case 3:
			nameOfMonth = "Khordad";
			season = "Spring";
			break;
		case 4:
			nameOfMonth = "Tir";
			season = "Summer";
			break;
		case 5:
			nameOfMonth = "Mordad";
			season = "Summer";
			break;
		case 6:
			nameOfMonth = "Shahrivar";
			season = "Summer";
			break;
		case 7:
			nameOfMonth = "Mehr";
			season = "Fall";
			break;
		case 8:
			nameOfMonth = "Aban";
			season = "Fall";
			break;
		case 9:
			nameOfMonth = "Azar";
			season = "Fall";
			break;
		case 10:
			nameOfMonth = "Dey";
			season = "Winter";
			break;
		case 11:
			nameOfMonth = "Bahman";
			season = "Winter";
			break;
		case 12:
			nameOfMonth = "Esfand";
			season = "Winter";
			break;
		default:
			validMonth = false;
		}
		
		// 4. Output:
		if (validMonth == false)
			System.out.println("The month you entered is invalid!");
		else if (season == "Spring")
			System.out.println("We are in " + nameOfMonth + ", Happy Spring");
		else if (season == "Summer")
			System.out.println("We are in " + nameOfMonth + ", Have Fun in Summer");
		else if (season == "Fall")
			System.out.println("We are in " + nameOfMonth + ", Ready For Fall");
		else if (season == "Winter")
			System.out.println("We are in " + nameOfMonth + ", Keep warm Yourself in Winter");
				
		// 5. Clean-up:
		keyboard.close();
			

	}

}
