package lesson4;

import java.util.Scanner;

public class Text72_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers:  ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if (number1 >= number2) {
			int temp1 = number1;
			number1 = number2;
			number2 = temp1;
		}

		if (number3 <= number2) {
			int temp2 = number3;
			number3 = number2;
			number2 = temp2;
		}

		if (number1 >= number2) {
			int temp3 = number1;
			number1 = number2;
			number3 = temp3;
		}
		System.out.println("a is " + number1 + ", b is " + number2 + ", c is " + number3);

		input.close();
	}
}