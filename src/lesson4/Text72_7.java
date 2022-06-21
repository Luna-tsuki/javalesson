package lesson4;

import java.util.Scanner;

public class Text72_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if ((number1 + number2 > number3) && (number1 + number3 > number2) && (number3 + number2 > number1)) {
			int perimeter = number1 + number2 + number3;
			System.out.println("The perimeter of the triangle is: " + perimeter);
		} else {
			System.out.println("The number is illegal.");
		}

		input.close();

	}
}