package lesson9;

public class Text142_5 {

	public static void main(String[] args) {
		// 编写一个方法，使用下面的方法头求出一个整数数组中的最小元素
		int[] numbers = { 3, 5, 2, 2, 6 };
		int min = min(numbers);
		System.out.println("The minimum number is: " + min);
	}

	public static int min(int[] array) {
		int min = array[0]; // The minimum value
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}
