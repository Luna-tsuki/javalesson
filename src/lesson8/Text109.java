package lesson8;

import java.util.Scanner;

public class Text109 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer:");
		int n1 = input.nextInt();

		System.out.println("Enter second integer:");
		int n2 = input.nextInt();

		System.out.println("The great common divisor for: " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
		input.close();

	}

	public static int gcd(int n1, int n2) {
		int g = 1;
		int k = 1;

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				g = k;
			}
			k++;
		}
		return g;
	}
}
