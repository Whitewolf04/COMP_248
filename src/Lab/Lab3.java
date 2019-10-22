package Lab;

import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		int height, width, area;
		Scanner keyIn = new Scanner (System.in);
		
		//2. User prompt:
		System.out.print("Height and width please: ");
		height = keyIn.nextInt();
		width = keyIn.nextInt();
		
		// 3. Core logic + Output
		if (height == width)
			// Check if height equals to width
			System.out.println("Those are the coordinates of a square.");
		else { 
			// Check if rectangle is landscape or portrait
			if (height < width) {
				System.out.println("Those are the coordinates of a rectangle in landscape mode.");
				if (height < (width/2))
					// Check if height is less than half the width
					System.out.println("Wow that is a narrow rectangle!");
			} else {
				System.out.println("Those are the coordinates of a rectangle in portrait mode.");
				if (height > (width*2))
					// Check if height is greater than twice the width
					System.out.println("That is a mighty tall rectangle");
			}
		}
		
		area = height*width;
		// Calculate the area
		System.out.println("The area is " + area);
		
		// 4. Clean up:
		keyIn.close();

	}

}
