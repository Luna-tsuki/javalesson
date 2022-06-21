package lesson8;

import java.util.Scanner;

public class Text112_2 {

	// 编写程序提示用户输入一个整数，然后显示这个整数所有数字的和。
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();

		System.out.println("SumDigits is: " + sumDigits(number));

		input.close();
	}

	public static int sumDigits(int number) {
		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}
}
