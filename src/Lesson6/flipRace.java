package Lesson6;

public class flipRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0, count2 = 0;
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		
		while (count1 <= 2 && count2 <= 2) {
			coin1.flip();
			coin2.flip();
			if (coin1.isHead())
				System.out.print("Coin 1 is Head\t");
			else
				System.out.print("Coin 1 is Tail\t");
			if (coin2.isHead())
				System.out.println("Coin 2 is Head");
			else
				System.out.println("Coin 2 is Tail");
			count1++;
			count2++;
		}

	}

}
