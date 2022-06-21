package lesson8;

import java.util.Scanner;

public class Text112_5 {

	// 编写一个测试程序，提示用户输人一个整数，然后显示它的反向数。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		displaySortedNumbers(number1, number2, number3);

		input.close();
	}

	/**
	 * displaySortedNumbers Method displays three numbers in increasing order
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp; // Hold number to swap

		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
