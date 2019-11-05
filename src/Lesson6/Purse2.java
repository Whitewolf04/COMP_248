package Lesson6;

public class Purse2 {
	//Constant & instance variable declarations
		private  int nickels, dimes, quarters;
		private final double NICKEL_VALUE = 0.05;
		private final double DIME_VALUE = 0.1;
		private final double QUARTER_VALUE = 0.25;
		
		public Purse2() {
			nickels = 0;
			dimes = 0;
			quarters = 0;
		}	
		
		//Constructor
		public Purse2(int nickels, int dimes, int quarters)
		{
			this.nickels= nickels;
			this.dimes = dimes;
			this.quarters = quarters;
		}
		
		
		// Constructor with 1 parameter
		public Purse2(int quarters) {
			nickels = 0;
			dimes = 0;
			this.quarters = quarters;
		}
		
		// Constructor with 2 parameters
		public Purse2(int quarters, int dimes) {
			nickels = 0;
			this.dimes = dimes;
			this.quarters = quarters;
		}
		
		// Void method to add coins
		public void add(int quarters, int dimes, int nickels) {
			this.quarters += quarters;
			this.dimes += dimes;
			this.nickels += nickels;
		}
		
		public void add(int nickels, int dimes) {
			this.nickels += nickels;
			this.dimes += dimes;
		}
		
		public void add(int nickels) {
			this.nickels += nickels;
		}
		
		public void add() {
			nickels += 1;
			dimes += 1;
			quarters += 1;
		}
		
		// Calculate the total amount of money in the purse
		public double getTotal() {
			int totalMoney = 0;
			return(totalMoney += nickels*NICKEL_VALUE + dimes*DIME_VALUE + quarters*QUARTER_VALUE);
		}
		
		public String equals(Purse2 anotherPurse) {
			if (nickels == anotherPurse.nickels && dimes == anotherPurse.dimes && quarters == anotherPurse.quarters)
				return("have the same amount of money");
			else
				return("don't have the same amount of money");
		}
		
		public String toString() {
			return(nickels + " nickels, " + dimes + " dimes, " + quarters + " quarters, ");
		}
}
