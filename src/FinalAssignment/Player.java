package FinalAssignment;

import java.util.Scanner;
import java.util.Random;
public class Player {
	// Variables for player's attributes
	private String name;
	private int level, x, y, energy;
	// Variable for java utility
	private static Scanner keyIn = new Scanner(System.in);
	private static Random r = new Random();
	
	// Default constructor
	public Player() {
		name = "";
		energy = 10;
		level = 0;
		x = 0;
		y = 0;
	}
	
	// Constructor that takes in parameters of position
	public Player(int level, int x, int y) {
		this.level = level;
		this.x = x;
		this.y = y;
		energy = 10;
		name = "";
	}
	
	// Accessor methods for all attributes
	public String getName() {
		return name;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getLevel() {
		return(level);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// Mutator methods to change attributes
	public void changeName(String name) {
		this.name = name;
	}
	
	public void changeLevel(int level) {
		this.level = level;
	}
	
	public void changeEnergy(int energy) {
		this.energy = energy;
	}
	
	public void changeX(int x) {
		this.x = x;
	}
	
	public void changeY(int y) {
		this.y = y;
	}
	
	// Copy method
	public Player copy(Player anotherPlayer) {
		// Create a temp player and assign everything to temp to prevent data leak
		Player temp = new Player();
		temp.name = anotherPlayer.getName();
		temp.energy = anotherPlayer.getEnergy();
		temp.level = anotherPlayer.getLevel();
		temp.x = anotherPlayer.getX();
		temp.y = anotherPlayer.getY();
		return temp;
	}
	
	// Move to method
	public Player moveTo(Player p) {
		Player temp = new Player();
		temp = temp.copy(this);
		temp.level = p.level;
		temp.x = p.x;
		temp.y = p.y;
		return temp;
	}
	
	// Equals method for check if two players are in the same position
	public boolean equals(Player p) {
		return(this.level == p.level && this.x == p.x && this.y == p.y);
	}
	
	// toString method to print out the status of the player
	public String toString() {
		return(this.name + " is on level " + this.level + " at location (" + this.x + ", " + this.y + ") and has " + 
				this.energy + " units of energy.");
	}
	
	// Static execute turn method for executing turns
	public static void executeTurn(Player p_main, Player p_other, Dice die, Board board) {
		// Take in p_main as the main player executing turn, p_other as the other player, and a dice and a board
		// Int for calculating the total of dice rolled
		int diceRolled;
		// Set variables for calculating destination
		int newX = p_main.getX(), newY = p_main.getY(), newLevel = p_main.getLevel(), energyChange = 0;
		
		// Output the main player's turn
		System.out.println("It is " + p_main.getName() + "'s turn");
		
		// Check the amount of energy left
		if (p_main.getEnergy() <= 0) { // If not enough energy to move, roll dice until the energy is enough
			// Tell the player that they don't have enough energy and the rule of rolling dice for energy
			System.out.println("You don't have enough energy to move");
			System.out.println("You will roll the dice 3 times.");
			System.out.println("Each time you roll a double, you will get 2 energy");
			
			int count = 0; // Count for checking the number of time rolled
			while(count < 3) { // While the dice is rolled less than 3 times, continue rolling
				// Assign the dice rolled
				diceRolled = die.rollDice();
		
				// Output what dice you rolled
				System.out.println(p_main.getName() + " you rolled " + die);
		
				// Check if dice rolled is double
				if(die.isDouble()) {
					System.out.println("Congratulations you rolled double " + die.getDie1() + ". Your energy level went up by 2 units");
					energyChange += 2;
				}
				
				// Add one to count after each time of rolling dice
				count += 1;
			}
		} else { // If the player has enough energy, execute a normal turn
			// Assign the dice rolled
			diceRolled = die.rollDice();
	
			// Output what dice you rolled
			System.out.println("\t" + p_main.getName() + " you rolled " + die);
	
			// Check if dice rolled is double
			if(die.isDouble()) {
				System.out.println("\tCongratulations you rolled double " + die.getDie1() + ". Your energy level went up by 2 units");
				energyChange += 2;
			}
			
			// Calculate the coordinate to be moved to
			newX = p_main.getX() + diceRolled/board.getSize();
			newY = p_main.getY() + diceRolled%board.getSize();
			
			// Check if the X and Y coordinate is out of bound from the board
			if(newY > (board.getSize() - 1)) { // Fix Y first and then fix X as follows
				newX = newX + newY/board.getSize();
				newY = newY%board.getSize();
			}
			if(newX > (board.getSize() - 1)) { // If X is still out of bound, fix X
				newLevel += 1;
				newX = newX%board.getSize();
			}
			
			// Check if the level is maxed out
			if(newLevel > board.getLevel()-1) { 
				// If it is, return to the original position and subtract 2 energy point
				newX = p_main.getX();
				newY = p_main.getY();
				newLevel -= 1; // Subtract 1 from level to prevent out of bound error
				energyChange = -2;
				System.out.println("!!! Sorry you need to stay where you are - that throw takes you off the grid and you");
				System.out.println("lose 2 units of energy");
			}
			
			// Check if the player is at the square second to the last square
			if(p_main.getX() == board.getSize()-1 && p_main.getY() == board.getSize()-2 && p_main.getLevel() == board.getLevel()-1) {
				// If it is true, go backwards as the number of dice rolled
				newX = p_main.getX() - diceRolled/board.getSize();
				newY = p_main.getY() - diceRolled%board.getSize();
				
				// Check if the X and Y coordinate is negative (not exist on the board)
				if(newY < 0) {// Fix Y like above
					newY = newY%board.getSize();
					newX = newX - newY/board.getSize();
				} 
				if(newX < 0) {// Fix X and decrease one level
					newLevel -= 1;
					newX = newX%board.getSize();
				}
			}
			
			// Check if the spot is taken
			if (newX == p_other.getX() && newY == p_other.getY() && newLevel == p_other.getLevel()) {
				// Tell the player and ask for choice of action
				System.out.println("Player " + p_other.getName() + " is at your new location");
				System.out.println("What do you want to do?");
				System.out.println("\t0 - Challenge and risk losing 50% of your energy units if you lose");
				System.out.println("\t\tor move to new location and get 50% of other player's energy units");
				System.out.println("\t1 - to move down one level or move to (0,0) if at level 0 and lose 2 energy units");
				
				// Check for valid input
				int challengeChoice = keyIn.nextInt();
				while (challengeChoice != 0 && challengeChoice != 1) {
					System.out.println("Sorry but " + challengeChoice + " is not a legal choice.");
					challengeChoice = keyIn.nextInt();
				} // Ask for input until it is valid
				
				// Process the challenge choice
				if (challengeChoice == 1) {
					// If the player choose to not challenge
					if(p_main.getLevel() == 0) {// If the main player is already at level 0, move to (0, 0)
						newX = 0;
						newY = 0;
					} else {// If not, move to the same spot but one level down
						newLevel = p_main.getLevel() - 1;
					}
				} else if (challengeChoice == 0) { // If player agrees to challenge
					// Create a random number from 1 to 10
					int ranNum = r.nextInt(11);
					if (ranNum < 0) { // If lose, return to the original spot and lose half of energy
						newX = p_main.getX();
						newY = p_main.getY();
						energyChange -= p_main.getEnergy()/2;
					} else { // If win
						System.out.println("\tBravo!!! you won the challenge.");
						// Move the other player to the main player's original position
						p_other = p_other.moveTo(p_main);
						// Add the other player's half energy
						energyChange += p_other.getEnergy()/2;
						// The other player loses half of their energy
						p_other.changeEnergy(p_other.getEnergy() - p_other.getEnergy()/2);
					}
				}
			}
			
			// Calculate the final change in energy from the board
			energyChange += board.getEnergyAdj(newLevel, newX, newY);
			
		}
		// Take action accordingly
		p_main.changeLevel(newLevel);
		p_main.changeX(newX);
		p_main.changeY(newY);
		p_main.changeEnergy(p_main.getEnergy() + energyChange);

		// Print out final result of this turn for the current player
		System.out.println("\tYour energy is adjusted by " + board.getEnergyAdj(newLevel, newX, newY) + 
				" for landing at (" + p_main.getX() + ", " + p_main.getY() + ") at level " + p_main.getLevel());
		
	}
	
	// Won method to check winning conditions
	public static boolean won(Player p_main, Player p_other, Board board) {
		if (p_main.getX() == board.getSize()-1 && p_main.getY() == board.getSize()-1 && p_main.getLevel() == board.getLevel()-1) {
			System.out.println("\nAt the end of this round:");
			System.out.println("\t" + p_main);
			System.out.println("\t" + p_other);
			System.out.println("\n\nThe winner is " + p_main.getName());
			return(true);
		} else {
			return(false);
		}
	}
}
