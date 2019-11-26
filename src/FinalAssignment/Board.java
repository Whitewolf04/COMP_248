package FinalAssignment;

public class Board {
	private int[][][] board;
	private static final int MIN_LEVEL = 3;
	private static final int MIN_SIZE = 3;
	private int level, size;
	
	public Board() {
		level = 3;
		size = 4;
		createBoard(3, 4, 4);
	}
	
	public Board(int l, int x) {
		if(l >= MIN_LEVEL && x >= MIN_SIZE) {
			level = l;
			size = x;
		} else {
			level = 3;
			size = 4;
		}
		createBoard(level, size, size);
	}
	
	private void createBoard(int l, int x, int y) {
		int sum;
		board = new int[level][size][size];
		for(int i = 0; i < l; i++) {
			for(int k = 0; k < x; k++) {
				for(int t = 0; t < y; t++) {
					sum = t + k + i;
					if (sum%3 == 0) {
						board[i][k][t] = -3;
					} else if (sum%5 == 0) {
						board[i][k][t] = -2;
					} else if (sum%7 == 0) {
						board[i][k][t] = 2;
					} else {
						board[i][k][t] = 0;
					}
				}
			}
		}
		board[0][0][0] = 0;
	}
	
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
		
	public String toString() {
		String myBoard = "";
		for(int i = 0; i < level; i++) {
			myBoard += "Level " + i;
			myBoard += "\n--------\n";
			for(int k = 0; k < size; k++) {
				for(int t = 0; t < size; t++) {
					myBoard += "\t" + board[i][k][t];
				}
				myBoard += "\n";
			}
		}
		return(myBoard);
	}
	
	
}
