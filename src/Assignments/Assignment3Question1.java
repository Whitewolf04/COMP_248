package Assignments;

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
		int page, paragraph, line, word, count = 0, countNewline = 0, countSingle = 0, countEqual = 0;
		int countLength = 0, countUpper = 0, countLower = 0, countSpecial = 0, countTotal = 0;
		boolean stop = false;
		String[] chosenLine, chosenWords = new String[3];
		String password, printPassword, printNewline, printSingle, printEqual, printLength, printUpper, printLower, printSpecial;
		String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		
		// 2. Core logic:
		while(stop != true) {
			while (count < 3) {
				page = r.nextInt(3);
				paragraph = r.nextInt(book[page].length);
				line = r.nextInt(book[page][paragraph].length);
			
				chosenLine = book[page][paragraph][line].split(" ");
				word = r.nextInt(chosenLine.length);
			
				if (chosenLine[word].length() == 1) {
					countSingle += 1;
					continue;
				} else if(chosenLine[word].contains("\n") == true) {
					countNewline += 1;
					continue;
				}
			
				chosenWords[count] = chosenLine[word];
				count += 1;
			}
			count = 0;
			
			password = chosenWords[0].concat(chosenWords[1]).concat(chosenWords[2]);
			
			// Check if two words in the passwords are the same
			if (chosenWords[0].compareTo(chosenWords[1]) == 0) {
				countEqual += 1;
				continue;
			} else if (chosenWords[1].compareTo(chosenWords[2]) == 0) {
				countEqual += 1;
				continue;
			} else if (chosenWords[0].compareTo(chosenWords[2]) == 0) {
				countEqual += 1;
				continue;
			}
			
			// Check if the length of the passwords is between 8-16
			if (password.length() < 8 || password.length() > 16) {
				countLength += 1;
				continue;
			}
			
			// Check if the passwords contains an upper-case character
			boolean containsUpper = false;
			for (int p = 0; p < password.length(); p++) {
				for(int u = 0; u < 26; u++) {
					if (password.substring(p, p+1).compareTo(upperLetters.substring(u, u+1)) == 0) {
						containsUpper = true;
					}
				}
			}
			if (containsUpper == false) {
				countUpper += 1;
				continue;
			}
			
			// Check if the passwords contain a lower-case character
			boolean containsLower = false;
			for (int p = 0; p < password.length(); p++) {
				for (int l = 0; l < 26; l++) {
					if (password.substring(p, p+1).compareTo(lowerLetters.substring(l, l+1)) == 0) {
						containsLower = true;
					}
				}
			}
			if (containsLower = false) {
				countLower += 1;
				continue;
			}
			
			// Check if the passwords contain only one special character
			int specialCharacter = 0;
			for (int p = 0; p < password.length(); p++) {
				for (int s = 0; s < 26; s++) {
					if (password.substring(p, p+1).compareTo(lowerLetters.substring(s, s+1)) != 0 && password.substring(p, p+1).compareTo(upperLetters.substring(s, s+1)) != 0) {
						specialCharacter += 1;
					}
				}
			}
			if (specialCharacter != 1) {
				countSpecial += 1;
				continue;
			}
			
			printPassword = String.format("Password = %s", password);
			printNewline = String.format("Newline = %d", countNewline);
			printSingle = String.format("Single = %d", countSingle);
			printEqual = String.format("Equal = %d", countEqual);
			printLength = String.format("Length = %d", countLength);
			printUpper = String.format("Upper = %d",  countUpper);
			printLower = String.format("Lower = %d",  countLower);
			printSpecial = String.format("Special = %d",  countSpecial);
			
			System.out.format("Password = %s Newline = %d Single = %d Equal = %d Length = %d Upper = %d Lower = %d Special = %d\n", password, countNewline, countSingle, countEqual, countLength, countUpper, countLower, countSpecial);
			
			countTotal += 1;
			
			if (countTotal == 10000 || countLower > 0)
				stop = true;
		
		}

	}

}
