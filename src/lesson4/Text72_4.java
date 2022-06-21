package lesson4;

import java.util.Scanner;

public class Text72_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");

		int number = input.nextInt();
		int number1 = number / 100000000;
		int number2 = (number % 100000000) / 10000000;
		int number3 = (number % 10000000) / 1000000;
		int number4 = (number % 1000000) / 100000;
		int number5 = (number % 100000) / 10000;
		int number6 = (number % 10000) / 1000;
		int number7 = (number % 1000) / 100;
		int number8 = (number % 100) / 10;
		int number9 = (number % 10);

		int number10 = (number1 + number2 * 2 + number3 * 3 + number4 * 4 + number5 * 5 + number6 * 6 + number7 * 7
				+ number8 * 8 + number9 * 9) % 11;

		if (number10 == 10) {
			System.out.println("he ISBN-10 number is : " + number1 + number2 + number3 + number4 + number5 + number6
					+ number7 + number8 + number9 + "X");
		} else {
			System.out.println("he ISBN-10 number is : " + number1 + number2 + number3 + number4 + number5 + number6
					+ number7 + number8 + number9 + number10);
		}

		input.close();
	}

}
