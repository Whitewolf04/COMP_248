package FinalAssignment;

public class Board {
	private int[][][] board; // Initialize the 3-D board array
	// Constants for board size and level
	private static final int MIN_LEVEL = 3;
	private static final int MIN_SIZE = 3;
	private int level, size; // Integers for size and level
	
	// Default constructor
	public Board() {
		level = 3;
		size = 4;
		createBoard(3, 4, 4);
	}
	
	// Constructor with level and size as parameters
	public Board(int l, int x) {
		if(l >= MIN_LEVEL && x >= MIN_SIZE) { // Check if the level and size are legal
			level = l;
			size = x;
		} else { // If not use the default size
			level = 3;
			size = 4;
		}
		createBoard(level, size, size);
	}
	
	// Create board method
	private void createBoard(int l, int x, int y) {
		int sum;
		board = new int[level][size][size]; // Create a 3-D array of level and size passed in
		
		// Assign energy levels to each spot on the board
		for(int i = 0; i < l; i++) {
			for(int k = 0; k < x; k++) {
				for(int t = 0; t < y; t++) {
					sum = t + k + i; // Find the sum of level and size
					if (sum%3 == 0) { // If sum is divisible by 3, assign -3 energy
						board[i][k][t] = -3;
					} else if (sum%5 == 0) { // If sum is divisible by 5, assign -2 energy
						board[i][k][t] = -2;
					} else if (sum%7 == 0) { // If sum is divisible by 7, assign 2 energy
						board[i][k][t] = 2;
					} else { // If none of the above, leave it as 0
						board[i][k][t] = 0;
					}
				}
			}
		}
		
		// Make sure not to subtract 3 energy from players right off the bat
		board[0][0][0] = 0;
	}
	
	// Accessor methods
	public int getLevel() {
		return level;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getEnergyAdj(int l, int x, int y) {
		int energy = board[l][x][y];
		return energy;
	}
	
	// toString method for printing out the board
	public String toString() {
		String myBoard = "";
		// Loop through the array
		for(int i = 0; i < level; i++) {
			myBoard += "Level " + i; // For each level, add the level number
			myBoard += "\n--------\n";
			for(int k = 0; k < size; k++) {
				for(int t = 0; t < size; t++) {
					// Loop through all (x, y) and add the energy value of the spot to string
					myBoard += "\t" + board[i][k][t];
				}
				myBoard += "\n";
			}
		}
		return(myBoard);
	}
	
	
}
