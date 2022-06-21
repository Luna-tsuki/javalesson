package leetCode;

public class Code1486 {
	//1486. 数组异或操作
	//给你两个整数，n 和 start 。
	//数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
	//请返回 nums 中所有元素按位异或（XOR）后得到的结果。

	public static void main(String[] args) {
		int n = 4;
		int start = 3;

		System.out.print(xorOperation(n, start));

	}

	public static int xorOperation(int n, int start) {

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = start + 2 * i;
			System.out.println("nums " + nums[i]);
		}

//		int sum = 0;
//		for (int i = 0; i < n; i++) {
//			sum ^= nums[i];
//			System.out.println("sum " + sum);
//		}

		int sum = nums[0];
		for (int i = 1; i < n; i++) {
			sum ^= nums[i];
			System.out.println("sum " + sum);
		}

		return sum;

	}
}
