package lesson4;

import java.util.Scanner;

public class Text72_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number = input.nextInt();

		int computerNumber = (int) (Math.random() * 3);

		if (number == 0) {
			switch (computerNumber) {
			case 0:
				System.out.println("The computer is scissor.You are scissor too.It is a draw");
				break;
			case 1:
				System.out.println("The computer is rock.You are scissor.Computer won!");
				break;
			case 2:
				System.out.println("The computer is paper.You are scissor.You won!");
				break;
			}
		} else if (number == 1) {
			switch (computerNumber) {
			case 0:
				System.out.println("The computer is scissor.You are rock.You won!");
				break;
			case 1:
				System.out.println("The computer is rock.You are rock too.It is a draw");
				break;
			case 2:
				System.out.println("The computer is paper.You are rock.Computer won!");
				break;
			}
		} else {
			switch (computerNumber) {
			case 0:
				System.out.println("The computer is scissor.You are paper.Computer won!");
				break;
			case 1:
				System.out.println("The computer is rock.You are paper.You won!");
				break;
			case 2:
				System.out.println("The computer is paper.You are paper too.It is a draw");
				break;
			}
		}
		input.close();

	}
}
