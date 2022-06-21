package lesson5;

import java.util.Scanner;

public class Text77_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal value (0 to 15):   ");

		int number = input.nextInt();

		String hex = Integer.toHexString(number);

		if (number < 0 || number > 15) {
			System.out.println("Illegal input");
		} else {
			System.out.println(hex);
		}
		input.close();
	}
}