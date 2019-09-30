import java.util.Scanner;

public class Lesson2Quiz3Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		System.out.println("What is the price of the item? ");
		int price = keyIn.nextInt();
		int change = 100 - price;
		int quarters = change /  25;
		int dimes = (change - quarters*25) / 10;
		int nickels = (change - quarters*25 - dimes*10) / 5;
		System.out.println("Number of quarters in return: " + quarters);
		System.out.println("Number of dimes in return: " + dimes);
		System.out.println("Number of nickels in return: " + nickels);
		keyIn.close();

	}

}
