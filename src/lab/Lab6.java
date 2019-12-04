package lab;

import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		System.out.print("What size do you want your array to be (minimum size 6 and an even number)? ");
		System.out.print("\nStarting integer value: ");
		int lengthEntered = keyIn.nextInt();
		int start = keyIn.nextInt();
		
		int[] myArray = new int[lengthEntered];
		for (int i = 0; i < lengthEntered; i++) {
			myArray[i] = start + (i*2);
		}
		
		System.out.println("\n\nOriginal array: ");
		
		for(int t = 0; t < lengthEntered; t++) {
			System.out.print(myArray[t]);
		}
		
		if(lengthEntered % 2 == 0) {
			for(int k = lengthEntered-2; k  >= 2; k--) {
				if(k%2 == 0 && myArray[k] > myArray[k-2]) {
					int temp = myArray[k - 2];
					myArray[k-2] = myArray[k];
					myArray[k] = temp;
				}
			}
		} else {
			for(int k = lengthEntered-1; k  >= 2; k--) {
				if(k%2==0 && myArray[k] > myArray[k-2]) {
					int temp = myArray[k - 2];
					myArray[k-2] = myArray[k];
					myArray[k] = temp;
				}
			}
		}
		
		for(int s = 0; s < lengthEntered; s++) {
			System.out.print(myArray[s] + "\t");
		}
		keyIn.close();
	}

}
