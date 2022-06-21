package leetCode;

public class Code1588 {
	// 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
	// 子数组 定义为原数组中的一个连续子序列。
	// 请你返回 arr 中 所有奇数长度子数组的和 。

	public static void main(String[] args) {
		int[] arr = { 1,2 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;

		for (int start = 0; start < arr.length; start++) {
			for (int length = 1; start + length <= arr.length; length += 2) {
				for (int i = start; i < start + length; i++) {
					sum = sum + arr[i];
					System.out.println("i" + i + " " + sum);
				}
			}
		}
		return sum;
	}

}
