package Assignments;

// -------------------------------------------------------------
// Assignment 2 Question 1 Version A (using if/else statement)
// Written by Tuan To - 40114920
// For COMP 248 Section EC A - Fall 2019
// -------------------------------------------------------------


import java.util.Scanner;
public class Assignment2Question1VerA {

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
		if (month == 1) {
			nameOfMonth = "Farvardin";
			season = "Spring";
		} else if (month == 2) {
			nameOfMonth = "Ordibehesht";
			season = "Spring";
		} else if (month == 3) {
			nameOfMonth = "Khordad";
			season = "Spring";
		} else if (month == 4) {
			nameOfMonth = "Tir";
			season = "Summer";
		} else if (month == 5) {
			nameOfMonth = "Mordad";
			season = "Summer";
		} else if (month == 6) {
			nameOfMonth = "Shahrivar";
			season = "Summer";
		} else if (month == 7) {
			nameOfMonth = "Mehr";
			season = "Fall";
		} else if (month == 8) {
			nameOfMonth = "Aban";
			season = "Fall";
		} else if (month == 9) {
			nameOfMonth = "Azar";
			season = "Fall";
		} else if (month == 10) {
			nameOfMonth = "Dey";
			season = "Winter";
		} else if (month == 11) {
			nameOfMonth = "Bahman";
			season = "Winter";
		} else if (month == 12) {
			nameOfMonth = "Esfand";
			season = "Winter";
		} else
			validMonth = false;
		
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
