package lesson8;

import java.util.Scanner;

public class Text112_4 {

	// 编写一个测试程序，提示用户输人一个整数，然后显示它的反向数。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		reverse(number);

		input.close();
	}

	/**
	 * Reverse Method displays an integer in reverse order
	 */
	public static void reverse(int number) {
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}
}
