package Lesson5;

public class OneDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 5;
		int[] list = new int[LIMIT];
		for (int i = 0; i <= 4; i++) {
			list[i] = (i + 1)*10;
			System.out.print(list[i] + " ");
		}
	}

}
