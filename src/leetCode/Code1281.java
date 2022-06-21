package leetCode;

public class Code1281 {

	// 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
	public static void main(String[] args) {
		int n = 114;
		System.out.println(subtractProductAndSum(n));

	}

	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int multiply = 1;
		while (n != 0) {
			sum = sum + (n % 10);
			multiply = multiply * (n % 10);
			n = n / 10;
		}

		return multiply - sum;
	}
}
