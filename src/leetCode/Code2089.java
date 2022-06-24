package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code2089 {

	// nums[i] == target
	// 返回由 nums 中目标下标组成的列表。
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 2, 3 };
		int target = 3;
		System.out.println(targetIndices(nums, target));

	}

	public static List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
			}
		}
		return list;
	}
}
