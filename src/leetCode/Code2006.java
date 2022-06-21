package leetCode;

public class Code2006 {

	public static void main(String[] args) {
		//给你一个整数数组 nums 和一个整数 k ，请你返回数对 (i, j) 的数目，
		// 满足 i < j 且 |nums[i] - nums[j]| == k 。
		int[] nums = { 3, 2, 1, 5, 4 };
		int k = 2;
		System.out.println(countKDifference(nums, k));

	}

	public static int countKDifference(int[] nums, int k) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
					++sum;
				}

			}
		}

		return sum;
	}
}
