package leetCode;

import java.util.HashMap;

public class Offer56 {

	// 请找出那个只出现一次的数字。
	public static void main(String[] args) {
		int[] nums = { 9,1,7,9,7,9,7 };
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
		int count = 0;
		int j = 0;
		HashMap<Integer, Integer> Sites = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (Sites.containsKey(nums[i])) {
//				System.out.println(Sites);
				j = Sites.get(nums[i]) + 1;
				Sites.put(nums[i], j);
//				System.out.println(Sites.values());
			} else {
				Sites.put(nums[i], 1);
			}
		}

		for (Integer i : Sites.keySet()) {
			if (Sites.get(i) == 1) {
				count = i;
			}
		}

//		System.out.println(Sites);
		return count;
	}
}
