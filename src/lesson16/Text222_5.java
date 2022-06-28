package lesson16;

import java.util.*;
import java.io.*;

//(每个字母出現的次数）编写一个程序，提示用户输人一个文件名
//然后显示该文件中每个字母出现的次数。字母是大小写敏感的。

public class Text222_5 {
	/** Main method */
	public static void main(String[] args) throws FileNotFoundException {
		// Create a File object from user input
		File file = new File(getFileName());

		// Check if file exists
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " does not exist");
			System.exit(0);
		}

		int[] count = new int[26]; // Counts each letter
		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			// Read file
			while (input.hasNext()) {
				String line = (input.nextLine()).toUpperCase();
				countLetters(count, line);
			}
		}

		// Display results
		for (int i = 0; i < count.length; i++) {
			System.out.println("Number of " + (char) ('A' + i) + "\'s: " + count[i]);
		}
	}

	/** Counts the occurrences of each letter in a string */
	public static void countLetters(int[] count, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count[(int) (str.charAt(i) - 'A')]++;
		}
	}

	/**
	 * Prompts the user to enter a filename and returns it as a string
	 */
	public static String getFileName() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a filename: ");
		return input.next();
	}
}
