package lesson9;

import java.util.Scanner;

public class Text122 {

	public static void main(String[] args) {
		// 初始化数组
		double[] myList = new double[10];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < myList.length; i++) {
			System.out.println("Enter number" + i + " : ");
			myList[i] = input.nextDouble();
		}
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");
		}

		// char类型数组不需要循环，直接输出即可
		char city[] = { 'a', 'b', 'c' };
		System.out.println(city);
		
		input.close();
	}

}