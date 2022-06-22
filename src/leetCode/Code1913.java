package leetCode;

import java.util.Arrays;

public class Code1913 {

	// 两个数对之间的最大乘积差
	public static void main(String[] args) {
		int[] nums = { 4,2,5,9,7,4,8 };
		System.out.println(maxProductDifference(nums));
	}

	public static int maxProductDifference(int[] nums) {
		int max = 0;

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		int n = nums.length - 1;

		max = nums[n] * nums[n - 1] - nums[0] * nums[1];

		return max;
	}

}
