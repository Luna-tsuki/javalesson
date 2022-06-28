package lesson16;

import java.io.*;
import java.util.*;

public class Text222_1 {
	// (处理文本文件中的分数）假定一个文本文件中 包含未指定个数的分数，用空格分开。编
	// 写一 个程序，提示用户输人文件，然后从文件中读 入分数，并且显示它们的和以及平均值。

	public static void main(String[] args) throws Exception {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to a file
		System.out.print("Enter a file of scores: ");
		File file = new File(input.nextLine());

		// Check if file exists
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}

		int count = 0; // Counts scores
		double total = 0; // Accumulates total

		try (
				// Create input file
				Scanner inputFile = new Scanner(file);) {
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}

		// Display results
		System.out.println("File " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
	}

}
