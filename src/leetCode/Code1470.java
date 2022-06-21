package leetCode;

public class Code1470 {
	//给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
	// 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。

	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		System.out.println(shuffle(nums, n));

		int[] arr = shuffle(nums, n);
		for (int e : arr) {
			System.out.println(e);
		}
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 0) {
				arr[i] = nums[i / 2];
			} else {
				arr[i] = nums[n + (i - 1) / 2];
			}

		}

		return arr;
	}
}
