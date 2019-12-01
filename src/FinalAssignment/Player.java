package FinalAssignment;

public class Player {
	// Variables for player's attributes
	private String name;
	private int level, x, y, energy;
	
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
		temp.changeLevel(p.getLevel());
		temp.changeX(p.getX());
		temp.changeY(p.getY());
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
