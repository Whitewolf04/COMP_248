package Lab;

import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		String word;
		
		// 2. User prompt:
		System.out.print("Enter a string: ");
		word = keyIn.next();
		
		// 3. Core Logic + Output:
		System.out.println("");
		for(int k = 0; k <= (word.length()*2 - 1); k++) {
			// Check if k is out of bound
			if (k >= word.length()) {
				// If k is out of bound, return r to within bound of word length
				for(int r = (k - (k + 1 - word.length())*2); r >= 0; r--) {
					System.out.print(word.charAt(r) + "\t");
				}
				System.out.println("");
			} else {
				for(int r = k; r >= 0; r--) {
					System.out.print(word.charAt(r) + "\t");
				}
				System.out.println("");
			}
		}
		
		// 4. Clean Up:
		keyIn.close();

	}

}
