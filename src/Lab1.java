import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization
		final int OVER = 4;
		int lab1, lab2, lab3, total, overBy;
		Scanner keyIn = new Scanner(System.in);
		System.out.print("Enter number of students registered please: ");
		
		// 2. User Prompt
		lab1 = keyIn.nextInt();
		lab2 = keyIn.nextInt();
		lab3 = keyIn.nextInt();
		
		// 3. Core Logic
		total = lab1 + lab2 + lab3;
		overBy = lab1%OVER + lab2%OVER + lab3%OVER;
		
		// 4. Output
		System.out.println("\nThere are " + total + " students registered in 3 Comp 248 lab sections and we are over-booked by " + overBy + "!");
		
		// 5. Clean-up
		keyIn.close();

	}

}
