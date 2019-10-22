import java.util.Scanner;
public class MidtermQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner (System.in);
		String str1, str2;
		
		// 2. User prompt:
		System.out.println("Please enter the two strings: ");
		str1 = keyIn.next();
		str2 = keyIn.next();
		
		// 3. Core logic:
		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("Content same");
		else
			System.out.println("Different content");
		
		// 4. Output:
		
		// 5. Clean up:
		keyIn.close();

	}

}
