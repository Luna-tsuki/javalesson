package lesson6;

import java.util.Scanner;

public class Text92_4 {

	public static void main(String[] args) {
		// 编写一个程序，提示用户输入三个城市名称，然后以升序进行显示。
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city name: ");
		String s1 = input.nextLine();
		System.out.println("Enter the second city name: ");
		String s2 = input.nextLine();
		System.out.println("Enter the third city name: ");
		String s3 = input.nextLine();

		String temp = " ";

		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if (s3.compareTo(s2) < 0) {
			temp = s3;
			s3 = s2;
			s2 = temp;
		}
		if (s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}

		System.out.println("The three cities in alphabetical order are" + " " + s1 + " " + s2 + " " + s3);

		input.close();
	}
}
