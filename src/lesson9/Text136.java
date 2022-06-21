package lesson9;

public class Text136 {

	public static void main(String[] args) {
		// 可变长参数列表
		printMax(34, 3, 44, 5);
		printMax();
	}

	public static void printMax(double... numbers) {

		if (numbers.length == 0) {
			System.out.println("NO");
			return;
		}

		double result = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > result) {
				result = numbers[i];
			}
		}

		System.out.println("The max value is : " + result);
	}

}
