package lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Text216_3 {

	// 编写一个程序，提示用户读取两个整数，然后显示他们的和。程序应该在输入不正确时提示用户再次读取数值。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("Enter two integer: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				System.out.println("The nmumber enter is " + number1 + " " + number2);
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again.(" + "Incorrect input:an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
	}

}