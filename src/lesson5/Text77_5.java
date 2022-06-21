package lesson5;

import java.util.Scanner;

public class Text77_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = input.nextInt();

		System.out.println("Enter a month: ");
		String month = input.next();

		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		// Display the number of day in the month
		System.out.print(month + " " + year + " has ");

		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.println(31 + " days");
		} else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.println(30 + " days");
		} else if (month.equals("Feb")) {
			System.out.println(((leapYear) ? 29 : 28) + " days");
		} else {
			System.out.println("illegal input");
		}
		input.close();
	}
}
