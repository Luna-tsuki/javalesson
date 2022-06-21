package leetCode;

import java.util.Arrays;

public class Code1929 {
	// 1929. 数组串联
	// 给你一个长度为 n 的整数数组 nums
	// 构建一个长度为 2n 的答案数组 ans 数组下标 从 0 开始计数 ，对于所有 0 <= i < n 的 i
	// ans[i] == nums[i] ans[i + n] == nums[i]

	public static void main(String[] args) {
		int[] nums = { 5, 0, 1, 2, 3, 4 };
		System.out.print(Arrays.toString(getConcatenation(nums)));
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length*2];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

}
