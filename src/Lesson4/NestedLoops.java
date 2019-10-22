package Lesson4;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int col = 1; col <= 5; col++) {
			for (int row = col; row <= 5; row++)
				System.out.print(row + "\t");
			System.out.println("\n");
		}
		

	}

}
