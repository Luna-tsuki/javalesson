package lesson6;

import java.util.Scanner;

public class Text92_3 {

	public static void main(String[] args) {
		// 编写一个程序，提示用户输入两个字符串，检测第二个字符串是否是第一个字符串的子串。
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two strings: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();

		boolean i = s1.contains(s2);

		if (i) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		input.close();
	}
}
