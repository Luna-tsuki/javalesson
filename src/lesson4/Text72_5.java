package lesson4;

import java.util.Scanner;

public class Text72_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer: ");

		int number = input.nextInt();
		int number1 = number / 100;
		int number3 = (number % 10);

		if (number1 == number3) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}

		input.close();
	}
}
