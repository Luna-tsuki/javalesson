package lesson9;

import java.util.Scanner;

public class Text142_6 {

	public static void main(String[] args) {
		// 编写一个方法，返回5个整数的最大公约数
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];

		// 用户输入5个数
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the number" + i + ":");
			numbers[i] = input.nextInt();
		}

		int greatCommonDivisor = gcd(numbers);
		System.out.println(greatCommonDivisor);
		
		input.close();
	}

	// 找到数组内最小值
	public static int min(int[] array) {
		int min = array[0]; // The minimum value
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	// 找到最大公约数
	public static int gcd(int... numbers) {
		int gcd = 1;
		int min = min(numbers);

		for (int i = min; i <= 1; i--) {
//      for (int j = 0; j < numbers.length; j++) {
//
//      }
			if (numbers[0] % i == 0 && numbers[1] % i == 0 && numbers[2] % i == 0 && numbers[3] % i == 0
					&& numbers[4] % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;

	}
}