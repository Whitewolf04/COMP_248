package Lesson3;
import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of change: ");
		int count = keyboard.nextInt();
		
		System.out.println("The change is " + count + ((count == 1) ? " Dime" : " Dimes"));
		keyboard.close();

	}

}
