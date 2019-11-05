package Lesson6;

public class Purse {
	//Constant & instance variable declarations
	private  int nickels, dimes, quarters;
	private final double NICKEL_VALUE = 0.05;
	private final double DIME_VALUE = 0.1;
	private final double QUARTER_VALUE = 0.25;
		
	//Constructor
	public Purse(int nickels, int dimes, int quarters)
	{
		this.nickels= nickels;
		this.dimes = dimes;
		this.quarters = quarters;
	}
	
	public double getTotal() {
		int totalMoney = 0;
		return(totalMoney += nickels*NICKEL_VALUE + dimes*DIME_VALUE + quarters*QUARTER_VALUE);
	}
	
	public String equals(Purse anotherPurse) {
		if (nickels == anotherPurse.nickels && dimes == anotherPurse.dimes && quarters == anotherPurse.quarters)
			return("have the same amount of money");
		else
			return("don't have the same amount of money");
	}
	
	public String toString() {
		return(nickels + " nickels, " + dimes + " dimes, " + quarters + " quarters, ");
	}
}
