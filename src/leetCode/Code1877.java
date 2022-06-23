package leetCode;

import java.util.Arrays;

public class Code1877 {

	public static void main(String[] args) {
		int[] nums = { 4, 1, 5, 1, 2, 5, 1, 5, 5, 4 };
		System.out.println(minPairSum(nums));
	}

	public static int minPairSum(int[] nums) {

		Arrays.sort(nums);

		int max = 0;
		int temp = 0;

		for (int i = 0; i < nums.length / 2; i++) {
			temp = nums[i] + nums[nums.length - 1 - i];
			if (max < temp) {
				max = temp;
			}
		}

		return max;
	}
}
