package Assignments;

//----------------------------------------------
//Assignment 3 - Question 1
//Written by: Minh Tuan To - 40114920
//For COMP 248 Section EC  - Fall 2019
//----------------------------------------------

import java.util.Random;
public class Assignment3Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Initialization:
		final String[][][] book = {
				{
				{"ALICE was beginning to get very tired of sitting by her sister on the\n",
				"bank, and of having nothing to do. Once or twice she had peeped into the\n",
				"book her sister was reading, but it had no pictures or conversations in\n",
				"it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
				"conversations?\"\n"},
				{"So she was considering in her OWN mind (as well as she could, for the\n",
				"day made her feel very sleepy and stupid), whether the pleasure of\n",
				"making a daisy-chain would be worth the trouble of getting up and\n",
				"picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
				"close by her.\n"},
				{"There was nothing so very remarkable in that, nor did Alice think it so\n",
				"very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
				"dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
				"out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
				"started to her feet, for it flashed across her mind that she had never\n",
				"before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
				"out of it, and, burning with curiosity, she ran across the field after\n",
				"it and was just in time to see it pop down a large rabbit-hole, under\n",
				"the hedge. In another moment, down went Alice after it!"}
				},
				{
				{"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
				"telescope!\"\n"},
				{"And so it was indeed! She was now only ten inches high, and her face\n",
				"brightened up at the thought that she was now the right size for going\n",
				"through the little door into that lovely garden.\n"},
				{"After awhile, finding that nothing more happened, she decided on going\n",
				"into the garden at once; but, alas for poor Alice! When she got to the\n",
				"door, she found she had forgotten the little golden key, and when she\n",
				"went back to the table for it, she found she could not possibly reach\n",
				"it: she could see it quite plainly through the glass and she tried her\n",
				"best to climb up one of the legs of the table, but it was too slippery,\n",
				"and when she had tired herself out with trying, the poor little thing\n",
				"sat down and cried.\n"},
				{"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
				"sharply. \"I advise you to leave off this minute!\" She generally gave\n",
				"herself very good advice (though she very seldom followed it), and\n",
				"sometimes she scolded herself so severely as to bring tears into her\n",
				"eyes.\n"},
				{"Soon her eye fell on a little glass box that was lying under the table:\n",
				"she opened it and found in it a very small cake, on which the words \"EAT\n",
				"ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
				"Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
				"makes me grow smaller, I can creep under the door: so either way I'll\n",
				"get into the garden, and I don't care which happens!\"\n"},
				{"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
				"way?\" holding her hand on the top of her head to feel which way she was\n",
				"growing; and she was quite surprised to find that she remained the same\n",
				"size. So she set to work and very soon finished off the cake."}
				},
				{
				{"The King and Queen of Hearts were seated on their throne when they\n",
				"arrived, with a great crowd assembled about them--all sorts of little\n",
				"birds and beasts, as well as the whole pack of cards: the Knave was\n",
				"standing before them, in chains, with a soldier on each side to guard\n",
				"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
				"and a scroll of parchment in the other. In the very middle of the court\n",
				"was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
				"trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
				{"The judge, by the way, was the King and he wore his crown over his great\n",
				"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
				"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
				{"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
				{"\"HERALD! read the accusation!\" said the King."}
				}
				};
		Random r = new Random();
		// Count variables for counting how many passwords have been passed before reaching the current one
		int page, paragraph, line, word, count = 0, countNewline = 0, countSingle = 0, countEqual = 0;
		int countLength = 0, countUpper = 0, countLower = 0, countSpecial = 0, countTotal = 0;
		// Stop variable for end of loop
		boolean stop = false;
		// String variable for choosing words before concatenating into a password
		String[] chosenLine, chosenWords = new String[3];
		// String variables for print formatting
		String password, printPassword, printNewline, printSingle, printEqual, printLength, printUpper, printLower, printSpecial;
		// String variables containing upper case characters, lower case characters, and special characters
		String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = ";.,\"!#$@%^&*(')+_-=/\\:;<>?`[]~";
		
		// Welcome banner
		System.out.println("Welcome to the password generator game!\n");
		
		// 2. Core logic:
		// Loop until 10,000 passwords are reached or count lower > 0
		while(stop != true) {
			// Loop through the string array to pick out 3 random words
			while (count < 3) {
				page = r.nextInt(3);
				paragraph = r.nextInt(book[page].length);
				line = r.nextInt(book[page][paragraph].length);
			
				// Choose out 1 line
				chosenLine = book[page][paragraph][line].split(" ");
				// Pick 1 word on that line
				word = r.nextInt(chosenLine.length);
			
				// Check if the word is only a single character
				if (chosenLine[word].length() == 1) {
					countSingle += 1;
					continue;
				} // Check if the word contains a newline character 
				else if(chosenLine[word].contains("\n") == true) {
					countNewline += 1;
					continue;
				}
			
				// After the conditions are satisfied, put the word in the chosenWords array
				chosenWords[count] = chosenLine[word];
				count += 1;
			}
			
			// After 3 words are chosen, restart the count for the next loop
			count = 0;
			
			// Concatenate the three chosen words from the string array
			password = chosenWords[0].concat(chosenWords[1]).concat(chosenWords[2]);
			
			// Check if two words in the passwords are the same
			// Check if the first two words are the same
			if (chosenWords[0].compareTo(chosenWords[1]) == 0) {
				countEqual += 1;
				continue;
			} // Check if the last two words are the same
			else if (chosenWords[1].compareTo(chosenWords[2]) == 0) {
				countEqual += 1;
				continue;
			} // Check if the first and last words are the same 
			else if (chosenWords[0].compareTo(chosenWords[2]) == 0) {
				countEqual += 1;
				continue;
			}
			
			// Check if the length of the passwords is between 8-16
			if (password.length() <= 8 || password.length() > 16) {
				countLength += 1;
				continue;
			}
			
			// Check if the passwords contains an upper-case character
			boolean containsUpper = false;
			// Loop all the characters in the password created
			for (int p = 0; p < password.length(); p++) {
				// Loop all the characters in the alphabet that are upper-case
				for(int u = 0; u < 26; u++) {
					// If the password contains upper-case character, set containsUpper to true
					if (password.substring(p, p+1).compareTo(upperLetters.substring(u, u+1)) == 0) {
						containsUpper = true;
					}
				}
			}
			
			// If the password doesn't contain any upper-case character, restart the bigger loop
			if (containsUpper == false) {
				countUpper += 1;
				continue;
			}
			
			// Check if the passwords contain a lower-case character
			boolean containsLower = false;
			// Loop all the characters in the password created
			for (int p = 0; p < password.length(); p++) {
				// Loop all the characters in the alphabet that are lower-case
				for (int l = 0; l < 26; l++) {
					// If the password contains lower-case character, set containsLower as true
					if (password.substring(p, p+1).compareTo(lowerLetters.substring(l, l+1)) == 0) {
						containsLower = true;
					}
				}
			}
			
			// If password doesn't contain any lower case character, restart the bigger loop
			if (containsLower = false) {
				countLower += 1;
				continue;
			}
			
			// Check if the passwords contain only one special character
			int specialCharacter = 0;
			for (int p = 0; p < password.length(); p++) {
				for (int s = 0; s < 29; s++) {
					if (password.substring(p, p+1).compareTo(specialCharacters.substring(s, s+1)) == 0) {
						specialCharacter += 1;
					}
				}
			}
			
			// If password contains more or less than 1 special character, restart the bigger loop
			if (specialCharacter != 1) {
				countSpecial += 1;
				continue;
			}
			
			// 3. Output:
			// Add 1 tab to passwords with length under 12 for nice formatting
			if (password.length() <= 12)
				printPassword = "Password = " + password + "\t";
			else
				printPassword = "Password = " + password;
			printNewline = "Newline = " + countNewline;
			printSingle = "Single = " + countSingle;
			printEqual = "Equal = " + countEqual;
			printLength = "Length = " + countLength;
			printUpper = "Upper = " + countUpper;
			printLower = "Lower = " + countLower;
			printSpecial = "Special = " + countSpecial;
			
			// Format the string printed
			String result = String.format("%1$s \t %2$s \t %3$s \t %4$s \t %5$s \t %6$s \t %7$s \t %8$s", 
					printPassword, printNewline, printSingle, printEqual, printLength, printUpper, printLower, printSpecial);
			System.out.println(result);
			
			// Keep track of the number of passwords have been created
			countTotal += 1;
			
			
			// Check if 10,000 passwords have been created or count lower is larger than 0
			if (countTotal == 10000 || countLower > 0)
				stop = true;
			
			// Reset all counts after printing one password
			countEqual = 0;
			countNewline = 0;
			countSingle = 0;
			countLength = 0;
			countUpper = 0;
			countLower = 0;
			countSpecial = 0;
		
		}
		
		// Closing banner
		System.out.println("\nTotal password generated: " + countTotal);
		System.out.println("\nThank you for using the password generator game. Good bye.");
	}

}
