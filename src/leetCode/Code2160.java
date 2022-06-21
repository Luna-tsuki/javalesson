package leetCode;

import java.util.Arrays;

public class Code2160 {
	// 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
	// 请返回 nums 的动态和。

	public static void main(String[] args) {
		int[] num = { 3, 1, 2, 10, 1 };
		System.out.print(Arrays.toString(runningSum(num)));
	}

	public static int[] runningSum(int[] nums) {
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
			System.out.println("nums[ " + (i - 1) + "] " + nums[i - 1]);
			System.out.println("nums[ " + i + "] " + nums[i]);
			System.out.println("sum[ " + i + "] " + sum[i]);
		}
		return sum;

	}
}
