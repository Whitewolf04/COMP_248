package Sample_Test;

import java.util.Scanner;
public class final_q6 {
	public static void main(String[] args) {
		Musical_Note note1 = new Musical_Note(3, 6);
		Musical_Note note2 = new Musical_Note();
		Musical_Note note3 = new Musical_Note(3, 8);
		Musical_Note note4 = new Musical_Note(3, 6);
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println(note2);
		// C
		int count = 0;
		while(count < 15) {
			note1.shorten();
			count++;
		}
		System.out.println(note1.getDuration());
		
		// D
		System.out.println(note1);
		
		// E
		if(note3.getDuration() > note1.getDuration()) {
			System.out.println("Note 3 has the longest duration");
		} else if(note3.getDuration() == note1.getDuration()) {
			System.out.println("Note 3 has the same duration as Note 1");
		} else {
			System.out.println("Note 1 has the longest duration");
		}
		
		// F
		if(note4.equal(note1)) {
			System.out.println("Note 4 is the same as Note 1");
		} else {
			System.out.println("Note 4 is not the same as Note 1");
		}
		
		// G
		Musical_Note[] myTune = new Musical_Note[600];
		for(int i = 0;  i <  600; i++) {
			System.out.println("What syllable and how long of a duration do you want it to be? (Enter 2 integers) ");
			System.out.print("(1 for DO, 2 for RE, 3 for MI, 4 for FA, 5 for SOL, 6 for LA, 7 for SI)");
			int syllable = keyIn.nextInt();
			int duration = keyIn.nextInt();
			myTune[i] = new Musical_Note(syllable, duration);
		}
		
		keyIn.close();
	}
}
