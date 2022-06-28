package lesson16;

import java.io.*;
import java.util.*;

public class Text222_2 {
	// (统计一个文件中的字符数、单词教和行教）编写一个程序，统计一个文件中的宇符数、单词数以及行数
	// 单词由空格符分隔，文件名应该作为命令行参数被传递所示。
	
	public static void main(String[] args) throws Exception {
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage: java filename");
			System.exit(1);
		}

		// Check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		int characters = 0; // Number of character
		int words = 0; // Number of words
		int lines = 0; // Number of lines

		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
			}
		}

		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = input.next();
				words++;
			}
		}

		// Display results
		System.out.println("File " + file.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}
