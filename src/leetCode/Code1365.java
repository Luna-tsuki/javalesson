package leetCode;

import java.util.Arrays;

public class Code1365 {

	// 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
	// 对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。

	public static void main(String[] args) {
		int[] nums = { 6, 5, 4, 8 };

		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] arr = new int[nums.length];

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					++count;
				}
			}
			arr[i] = count;
		}
		return arr;
	}
}
