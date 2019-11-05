package Lesson6;

public class PurseDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purse purse1 = new Purse(1, 2, 3);
		Purse purse2 = new Purse(1, 2, 3);
		Purse purse3 = new Purse(5, 0, 3);
		
		System.out.println("Purse 1 has a total of $" + purse1.getTotal());
		System.out.println("Purse 2 has a total of $" + purse2.getTotal());
		System.out.println("Purse 3 has a total of $" + purse3.getTotal());
		
		System.out.println("Purse 1 and purse 2 " + purse1.equals(purse2));
		System.out.println("Purse 2 and purse 3 " + purse2.equals(purse3));
		
		if(purse2.getTotal() == purse3.getTotal()) {
			System.out.println("Same amount of money");
		} else
			System.out.println("Not same amount of money");
		
		System.out.println("Purse 1 has " + purse1);
		System.out.println("Purse 2 has " + purse2);
		System.out.println("Purse 3 has " + purse3);

	}

}
