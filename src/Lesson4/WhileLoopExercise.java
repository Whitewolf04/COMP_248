package Lesson4;

public class WhileLoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, c = 2;
		
		while (a < 30000) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}

	}

}
