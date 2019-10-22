import java.util.Scanner;
public class MidtermQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner (System.in);
		String line, old, newChar;
		int count = 0;
		
		// 2. User prompt:
		System.out.println("Please enter a line to edit");
		line = keyIn.nextLine();
		
		// 3. Core logic:
		for (int i = 0; i < line.length(); i++) {
			switch (line.charAt(i)) {
			case 'a':
			case 'u':
			case 'i':
			case 'e':
			case 'o':
				count += 1;
				old = Character.toString(line.charAt(i));
				newChar = Integer.toString(count);
				line = line.replaceFirst(old, newChar);
				break;
			default:
				continue;
			}
		}
		
		
		// 4. Output:
		System.out.println("Here is your modified input: " + line);
		System.out.println("\nI just replaced " + count + " lower case vowels");
		
		// 5. Clean up:
		keyIn.close();

	}

}
