package leetCode;

public class Code1837 {

	// K 进制表示下的各位数字总和
	public static void main(String[] args) {
		int n = 10;
		int k = 10;
		System.out.println(sumBase(n, k));
	}

	public static int sumBase(int n, int k) {
		int sum = 0;

		while (n != 0) {
			sum += n % k;
			n = n / k;
		}

		return sum;
	}
}
