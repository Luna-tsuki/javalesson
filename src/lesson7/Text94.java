package lesson7;

import java.util.Scanner;

public class Text94 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);
		System.out.println("The number is " + number);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = 1;
		while (guess != number) {
			System.out.println("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number) {
				System.out.println("Yes, the number is " + number);

			} else if (guess > number) {
				System.out.println("Your guess is too high");

			} else {
				System.out.println("Your guess is too low");
			}
		}
		input.close();
	}
}
