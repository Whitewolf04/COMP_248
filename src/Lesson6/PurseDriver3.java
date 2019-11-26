package Lesson6;

public class PurseDriver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purse3 purse31 = new Purse3();
		Purse3 purse32 = new Purse3(6, 9, 8);
		Purse3 purse33 = new Purse3(10);
		Purse3 purse34 = new Purse3(12, 15);
		Purse3[] anotherList = {purse31, purse32, purse33, purse34};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(anotherList[i]);
		}
		
		purse31.setNickels(purse31.getNickels() + purse32.getNickels() + purse33.getNickels() + purse34.getNickels());
		purse31.setDimes(purse33.getDimes());
		purse31.setQuarters(purse32.getQuarters());
		
		System.out.println(purse31);
		System.out.println(purse32);
		System.out.println(purse33);
		System.out.println(purse34);
	}

}
