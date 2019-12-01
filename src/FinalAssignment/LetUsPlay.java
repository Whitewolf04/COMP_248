package FinalAssignment;

import java.util.Scanner;
import java.util.Random;
public class LetUsPlay {
	private static Scanner keyIn = new Scanner(System.in);
	private static Random r = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
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
			Player temp = new Player(); // temp player for checking if the spot has taken
			// Execute the first turn
			temp = temp.copy(gamePlayers[0]);// Assign temp for checking if the spot has been taken
			LetUsPlay.executeTurn(gamePlayers[0], myDie, myBoard);
			// Check if the spot is taken
			if (gamePlayers[0].equals(gamePlayers[1])) {
				// Tell the player and ask for choice of action
				System.out.println("Player " + gamePlayers[1].getName() + " is at your new location");
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
					if(gamePlayers[0].getLevel() == 0) {// If the main player is already at level 0, move to (0, 0)
						gamePlayers[0].changeX(0);
						gamePlayers[0].changeY(0);
					} else {// If not, move to the same spot but one level down
						gamePlayers[0].changeLevel(gamePlayers[0].getLevel() - 1);
					}
				} else if (challengeChoice == 0) { // If player agrees to challenge
					// Create a random number from 1 to 10
					int ranNum = r.nextInt(11);
					if (ranNum < 0) { // If lose, return to the original spot and lose half of energy
						gamePlayers[0].changeEnergy(gamePlayers[0].getEnergy() - gamePlayers[0].getEnergy()/2);
					} else { // If win
						System.out.println("\tBravo!!! you won the challenge.");
						// Move the other player to the main player's original position
						gamePlayers[1] = gamePlayers[1].moveTo(temp);
						// Add the other player's half energy
						gamePlayers[0].changeEnergy(gamePlayers[0].getEnergy() + gamePlayers[1].getEnergy()/2);
						// The other player loses half of their energy
						gamePlayers[1].changeEnergy(gamePlayers[1].getEnergy() - gamePlayers[1].getEnergy()/2);
					}
				}
			}
			// Print out the final results for the current player in turn
			System.out.println("\tYour energy is adjusted by " + 
					myBoard.getEnergyAdj(gamePlayers[0].getLevel(), gamePlayers[0].getX(), gamePlayers[0].getY()) + 
					" for landing at (" + gamePlayers[0].getX() + ", " + gamePlayers[0].getY() + ") at level " + 
					gamePlayers[0].getLevel());
			
			// Check winning conditions
			win = Player.won(gamePlayers[0], gamePlayers[1], myBoard); // Check if the first player has won
			if(win) { // If win is true, break out of the loop and end the game
				break;
			}
			
			// Execute turn for the second player and check winning condition
			temp = temp.copy(gamePlayers[1]); // Assign temp for checking if the spot has been taken
			LetUsPlay.executeTurn(gamePlayers[1], myDie, myBoard);
			// Check if the spot is taken
			if (gamePlayers[1].equals(gamePlayers[0])) {
				// Tell the player and ask for choice of action
				System.out.println("Player " + gamePlayers[0].getName() + " is at your new location");
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
					if(gamePlayers[1].getLevel() == 0) {// If the main player is already at level 0, move to (0, 0)
						gamePlayers[1].changeX(0);
						gamePlayers[1].changeY(0);
					} else {// If not, move to the same spot but one level down
						gamePlayers[1].changeLevel(gamePlayers[1].getLevel() - 1);
					}
				} else if (challengeChoice == 0) { // If player agrees to challenge
					// Create a random number from 1 to 10
					int ranNum = r.nextInt(11);
					if (ranNum < 0) { // If lose, return to the original spot and lose half of energy
						gamePlayers[1].changeEnergy(gamePlayers[1].getEnergy() - gamePlayers[1].getEnergy()/2);
					} else { // If win
						System.out.println("\tBravo!!! you won the challenge.");
						// Move the other player to the main player's original position
						gamePlayers[0] = gamePlayers[0].moveTo(temp);
						// Add the other player's half energy
						gamePlayers[1].changeEnergy(gamePlayers[1].getEnergy() + gamePlayers[0].getEnergy()/2);
						// The other player loses half of their energy
						gamePlayers[0].changeEnergy(gamePlayers[0].getEnergy() - gamePlayers[0].getEnergy()/2);
					}
				}
			}
			
			// Print out the final results for the current player in turn
			System.out.println("\tYour energy is adjusted by " + 
					myBoard.getEnergyAdj(gamePlayers[1].getLevel(), gamePlayers[1].getX(), gamePlayers[1].getY()) + 
					" for landing at (" + gamePlayers[1].getX() + ", " + gamePlayers[1].getY() + ") at level " + 
					gamePlayers[1].getLevel());
			
			// Check winning conditions
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
		
	}
	
	public static void executeTurn(Player p_main, Dice die, Board board) {
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
				// Print out a notice for the player
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
					newX = newX - 1;
					newY = (board.getSize() + newY)%board.getSize();
				} 
				if(newX < 0) {// Fix X and decrease one level
					newLevel -= 1;
					newX = newX%board.getSize();
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
	}

}
