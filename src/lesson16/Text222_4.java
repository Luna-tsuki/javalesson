package lesson16;

import java.util.*;
import java.io.*;

//(数据排好序了吗？）编写一个程序，从文件SortedStrings.txt 中读取字符串，
//并且给出报告，文件中的字符串是否以升序的方式进行存储。
//如果文件中的字符串没有排好序，显示没有遵循排序的前面两个字符串。
public class Text222_4 {
	
	public static void main(String[] args) throws Exception {
		// Create a file instance
		File file = new File("SortedStrings.txt");

		// Check if file exists
		if (!file.exists()) {
			System.out.println(file.getName() + " does not exist");
			System.exit(0);
		}

		System.out.println("File " + file.getName());
		boolean dataSorted = true;
		String string1 = "";
		String string2 = "";
		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			// Read first string from file
			if (input.hasNext())
				string1 = input.next();

			while (input.hasNext() && dataSorted) {
				string2 = input.next();
				// Report if strings are out of order
				if (string1.compareTo(string2) > 0) {
					System.out.println("The strings " + string1 + " and " + string2 + " are out of order");
					dataSorted = false;
				}
				string1 = string2;
			}
		}

		// Display whether the strings in the files are stored in increasing order
		if (dataSorted) {
			System.out.println("The strings in the file are stored in increasing order");
		}
	}
}