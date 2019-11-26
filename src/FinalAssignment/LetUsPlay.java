package FinalAssignment;

import java.util.Scanner;
import java.util.Random;
public class LetUsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		Scanner keyIn = new Scanner(System.in);
		Random r = new Random();
		
		Board myBoard = new Board(); // Create default board
		Dice myDie = new Dice(); // Create two dices
		
		// Create players variable
		Player[] gamePlayers = new Player[2]; // Create an array of objects Player
		// Initiate the two objects
		gamePlayers[0] = new Player();
		gamePlayers[1] = new Player();
		// Variables for getting player's name
		String player0Name, player1Name;
		
		// Boolean for checking the win status
		boolean win = false;
		// Miscellaneous integers for user's choice
		int choiceOfAction, sizeChosen, levelChosen, goesFirst;
		
		// Welcome Banner
		System.out.println("\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		System.out.println("\t*                                               *");
		System.out.println("\t*\tWELCOME to Nancy's 3D Warrior Game!\t*");
		System.out.println("\t*                                               *");
		System.out.println("\t*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");
		
		// Determine game board size
		System.out.println("The default game board has 3 levels and each level has a 4x4 board.");
		System.out.println("You can use this default board size or change the size");
		System.out.println("\t0 to use the default board size");
		System.out.println("\t-1 to enter your own size");
		System.out.print("==> What do you want to do? ");
		choiceOfAction = keyIn.nextInt();
		
		// Check if user's input is valid
		while(choiceOfAction != 0 && choiceOfAction != -1) {
			System.out.println("Sorry but " + choiceOfAction + " is not a legel choice.");
			choiceOfAction = keyIn.nextInt();
		}
		
		// Check if user chose to user default board or to enter their own size
		if(choiceOfAction == -1) {
			// Ask for the number of levels
			System.out.print("How many levels would you like? (minimum size 3, max 10) ");
			levelChosen = keyIn.nextInt();
			
			// Check if user's input is valid
			while(levelChosen < 3 || levelChosen > 10) {
				System.out.println("Sorry but " + levelChosen + " is not a legal choice.");
				levelChosen = keyIn.nextInt();
			}
			
			// Ask for the size
			System.out.println("What size do you want the nxn boards on each level to be?");
			System.out.println("Minimum size is 3x3, max is 10x10.");
			System.out.print("==> Enter the value of n: ");
			sizeChosen = keyIn.nextInt();
			
			// Check if user's input is valid
			while(sizeChosen < 4 || sizeChosen > 10) {
				System.out.println("Sorry but " + sizeChosen + " is not a legel choice");
				sizeChosen = keyIn.nextInt();
			}
			
			// Change board to user's desired settings
			myBoard = new Board(levelChosen, sizeChosen);
		}
		
		// Print out board for user to see visually
		System.out.println("\nYour 3D board has been set up and looks like this:\n");
		System.out.println(myBoard);
	
		// Get players' names
		System.out.print("What is player 0's name (one word only): ");
		player0Name = keyIn.next();
		System.out.print("What is player 1's name (one word only): ");
		player1Name = keyIn.next();
		
		// Change players' names to user's desired settings
		gamePlayers[0].changeName(player0Name);
		gamePlayers[1].changeName(player1Name);
		
		// Decide which player goes first & print the output
		goesFirst = r.nextInt(2);
		System.out.print("The game has started ");
		if(goesFirst == 0) { // If the order of the gamePlayer array is correct
			// Print out the name of the player who goes first and start
			System.out.print(gamePlayers[0].getName());
		} else { // If the order of the gamePlayer array is not correct
			// Switch the order of the gamePlayer array
			Player temp = new Player();
			temp = temp.copy(gamePlayers[0]);
			gamePlayers[0] = gamePlayers[0].copy(gamePlayers[1]);
			gamePlayers[1] = gamePlayers[1].copy(temp);
			// Print out the name of the first player and start
			System.out.print(gamePlayers[0].getName());
		}
		System.out.print(" goes first\n");
		System.out.println("================================");
		
		do {
			// Execute the first turn
			Player.executeTurn(gamePlayers[0], gamePlayers[1], myDie, myBoard);
			win = Player.won(gamePlayers[0], gamePlayers[1], myBoard); // Check if the first player has won
			
			if(win) { // If win is true, break out of the loop and end the game
				break;
			}
			
			// Execute turn for the second player and check winning condition
			Player.executeTurn(gamePlayers[1], gamePlayers[0], myDie, myBoard);
			win = Player.won(gamePlayers[1], gamePlayers[0], myBoard); // Check if the second player has won

			if(win) { // If win is true, break out of the loop and end the game
				break;
			}
			
			// Print out the result at the end of a round
			System.out.println("\nAt the end of this round:");
			System.out.println("\t" + gamePlayers[0]);
			System.out.println("\t" + gamePlayers[1]);
			
			// Take an input to continue the game
			System.out.print("Any key to continue to next round ...");
			String key = keyIn.next();
			System.out.println("");
		}while (win == false); // While no one has won, continue the game
		
		// Clean-up:
		keyIn.close();
	}

}
