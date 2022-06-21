package leetCode;

import java.util.Arrays;

public class Code1920 {
	// 给你一个 从 0 开始的排列 nums（下标也从 0 开始）。
	// 请你构建一个 同样长度 的数组 ans ，
	// 对于每个 i（0 <= i < nums.length），都满足 ans[i] = nums[nums[i]]
	public static void main(String[] args) {
		int[] nums = { 5, 0, 1, 2, 3, 4 };
		System.out.print(Arrays.toString(buildArray(nums)));
	}

	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;

	}
}
