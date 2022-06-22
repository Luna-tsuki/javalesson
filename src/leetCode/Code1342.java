package leetCode;

public class Code1342 {

	//将数字变成 0 的操作次数
	public static void main(String[] args) {
		int num = 123;
		System.out.println(numberOfSteps(num));

	}

	public static int numberOfSteps(int num) {
		int sum = 0;

		while (num != 0) {
			if (num % 2 == 0) {
				num = num / 2;
				++sum;
			} else {
				num = num - 1;
				++sum;
			}
		}

		return sum;
	}
}
