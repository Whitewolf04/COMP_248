package FinalAssignment;

import java.util.Random;
public class Dice {
	private int die1, die2;
	private Random r = new Random();
	
	public Dice() {
		die1 = 1;
		die2 = 1;
	}
	
	public int getDie1() {
		return die1;
	}
	
	public int getDie2() {
		return die2;
	}
	
	public int rollDice() {
		die1 = r.nextInt(6) + 1;
		die2 = r.nextInt(6) + 1;
		return(die1 + die2);
	}
	
	public boolean isDouble() {
		return(die1 == die2);
	}
	
	public String toString() {
		return("Die 1: " + die1 + " \tDie2: " + die2);
	}
}
