package lesson4;

import java.util.Scanner;

public class Text72_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter today’s day:  ");
		int todayNumber = input.nextInt();

		System.out.println("Enter the number of days elapsed since today:  ");
		int daysNumber = input.nextInt();

		int futureDay = daysNumber % 7 + todayNumber;

		if (futureDay > 7) {
			futureDay = futureDay - 7;
		}

		switch (futureDay) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

		input.close();

	}
}