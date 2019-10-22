package Lesson5;

import java.util.Scanner;
public class SortingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner (System.in);
		int[] myList;
		int size, min, temp;
		
		// 2. User prompt:
		System.out.print("What is the size of the list? ");
		size = keyIn.nextInt();
		myList = new int[size];
		
		System.out.println("Enter the list of numbers here.");
		for (int i = 0; i < size; i++) {
			myList[i] = keyIn.nextInt();
		}
		
		// 3. Core logic:
		for (int index = 0; index < size; index++) {
			min = index;
			for (int scan = (index+1); scan < size; scan++) {
				if (myList[scan] < myList[index])
					min = scan;
			}
			temp = myList[index];
			myList[index] = myList[min];
			myList[min] = temp;
		}
		
		// 4. Output:
		System.out.println("This is the ordered list:");
		for (int k = 0; k < size; k++)
			System.out.print(myList[k] + " ");
		
		// 5. Clean up:
		keyIn.close();

	}

}
