package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code1313 {

	// 每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ）
	// 每一对都表示解压后子列表中有 freq 个值为 val 的元素，
	// 你需要从左到右连接所有子列表以生成解压后的列表。

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3 };
		System.out.println(Arrays.toString(decompressRLElist(nums)));

	}

	public static int[] decompressRLElist(int[] nums) {
		List<Integer> strList = new ArrayList<Integer>();
		for (int i = 1; i < nums.length; i += 2) {
			while (nums[i - 1] != 0) {
				strList.add(nums[i]);
				--nums[i - 1];
			}
		}
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		int[] arr = new int[strList.size()];
		for (int i = 0; i < strList.size(); i++) {
			arr[i] = strList.get(i);
		}

		return arr;

	}
}
