package lesson8;

import java.util.Scanner;

public class Text112_3 {

	// 编写一个测试程序，提示用户输人一个整数值，然后报告这个整数是否是回文数。
	// 如果一个数字的反向倒置数和它的顺向数一样，这个数就称作回文数。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
		input.close();
	}

	/**
	 * Method isPalindrome returns true if number is a palindrome
	 */
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	/**
	 * Method reverse returns the reversal of an integer
	 */
	public static int reverse(int number) {
		String reverse = ""; // Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
	}
}
