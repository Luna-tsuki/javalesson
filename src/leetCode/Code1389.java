package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code1389 {

	// 在 target 数组中的下标 index[i] 处插入值 nums[i] 。
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(createTargetArray(nums, index)));

	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> strList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			strList.add(index[i], nums[i]);
		}
		int[] arr = new int[strList.size()];
		for (int i = 0; i < strList.size(); i++) {
			arr[i] = strList.get(i);
		}

		return arr;
	}

}
