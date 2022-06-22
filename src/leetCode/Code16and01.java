package leetCode;

public class Code16and01 {

	// 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
	public static void main(String[] args) {
		int[] numbers = { 1, 2 };
	}

	public static int[] swapNumbers(int[] numbers) {
		numbers[0] = numbers[0] ^ numbers[1];
		numbers[1] = numbers[0] ^ numbers[1];
		numbers[0] = numbers[0] ^ numbers[1];
		return numbers;
	}
}
