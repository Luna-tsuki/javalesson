package lesson9;

import java.util.Scanner;

public class Text142_8 {

	// （对字符串的字符排序）使用以下方法头编写一个方法，返回一个排好序的字符串。
	// 例如，sort（“acb”）返回abc编写一个测试程序，提示用户输入一个字符串，显示排好序的字符串。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		// Display the sorted string
		System.out.println(sort(string));
		
		input.close();
	}

	/**
	 * sort sorts string
	 */
	public static char[] sort(String s) {
		char[] str = new char[s.length()]; // Create char array

		// Fill array with the elements of the string
		for (int i = 0; i < str.length; i++) {
			str[i] = s.charAt(i);
		}

		// Sort array
		for (int i = 0; i < str.length - 1; i++) {
			char min = str[i];
			int minIndex = i;

			for (int j = i + 1; j < str.length; j++) {
				if (min > str[j]) {
					min = str[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				str[minIndex] = str[i];
				str[i] = min;
			}
		}
		return str;
	}
}
