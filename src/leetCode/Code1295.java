package leetCode;

public class Code1295 {

	//给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
	public static void main(String[] args) {
		int[] nums = { 555,901,482,1771 };
		System.out.println(findNumbers(nums));
	}

	public static int findNumbers(int[] nums) {

		String temp = "";
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			temp = nums[i] + "";
			int n = temp.length();

			if (n % 2 == 0) {
				++count;
			}
		}
		return count;
	}
}
