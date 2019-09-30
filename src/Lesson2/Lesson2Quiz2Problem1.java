package Lesson2;

import java.util.Scanner;
public class Lesson2Quiz2Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Asking how many coupons earned
		Scanner question = new Scanner(System.in);
		System.out.println("How many coupons did you earned? ");
		
		//Calculating the number of prize can be earned and remaining coupons
		int pointsWon = question.nextInt();
		int candyBar = pointsWon /10;
		int gumball = (pointsWon - candyBar*10) /3;
		int remainingCoupon = pointsWon - (candyBar*10) - (gumball*3);
		System.out.println("Number of Candy Bars you can get: " + candyBar);
		System.out.println("Number of Gumball you can get: " + gumball);
		System.out.println("Number of coupons remaining: " + remainingCoupon);
		
		question.close();

	}

}
