package Lesson6;

public class PurseDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purse2 purse1 = new Purse2(1, 2, 3);
		Purse2 purse2 = new Purse2();
		Purse2 purse3 = new Purse2(3);
		Purse2 purse4 = new Purse2(5, 6);
		Purse2 purse5 = new Purse2(1, 2, 3);
		Purse2[] myList = {purse1, purse2, purse3, purse4, purse5};

		for(int i = 0; i < 5; i++) {
			System.out.println("Purse " + (i+1) + " has a total of " + myList[i].getTotal());
		}
		
		System.out.println("Purse 2 and purse 3 " + purse2.equals(purse3));
		System.out.println("Purse 5 and purse 1" + purse1.equals(purse5));
		
		System.out.println("Purse 1 has " + purse1);
		purse1.add();
		System.out.println("Purse 1 now has " + purse1);
		System.out.println("");
		
		System.out.println("Purse 2 has " + purse2);
		purse2.add(2);
		System.out.println("Purse 2 now has " + purse2);
		System.out.println("");
		
		System.out.println("Purse 4 has " + purse4);
		purse4.add(4, 5, 3);
		System.out.println("Purse 4 now has " + purse4);
		System.out.println("");
		
		System.out.println("Purse 3 has " + purse3);
		purse3.add(3, 4);
		System.out.println("Purse 3 now has " + purse3);
	}

}
