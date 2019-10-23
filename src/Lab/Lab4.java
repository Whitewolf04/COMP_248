package Lab;

import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		String word1, word2, wordReverse = "", wordFinal = "";
		
		// 2. User prompt:
		System.out.print("Enter 2 words: ");
		word1 = keyIn.next();
		word2 = keyIn.next();
		
		// 3. Core logic:
		// Find the reverse of the second word
		for (int i = (word2.length()-1); i >= 0; i--) {
			wordReverse += word2.charAt(i);
		}
		
		// Take the second character starting with the 1st character in the second word
		for (int k = 0; k < word2.length(); k++) {
			if (k%2 == 0) {
				wordFinal += word2.charAt(k);
			}
		}
		
		// Concatenate everything together
		wordFinal = wordFinal.concat(wordReverse).concat(word1.toUpperCase());
		
		// 4. Output:
		System.out.println("\nThe new word is " + wordFinal + "\n");
		System.out.println("What a strange word!");
		
		// 5. Clean-up:
		keyIn.close();

	}


}
