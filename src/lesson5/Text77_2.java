package lesson5;

import java.util.Scanner;

public class Text77_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the side:  ");

		float side = input.nextFloat();

		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

		System.out.println("The area of the hexagon is: " + area);
		
		input.close();
	}
}
