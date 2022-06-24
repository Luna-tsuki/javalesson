package leetCode;

public class Code2221 {

	public static void main(String[] args) {
		int[] nums = { 5 };
		System.out.println(triangularSum(nums));
	}

	public static int triangularSum(int[] nums) {
		// 调用递归函数lastSum
		int[] sum = lastSum(nums);

		return sum[0];
	}

	// 递归lastSum  返回新数组
	public static int[] lastSum(int[] nums) {

		if (nums.length == 1) {
			return nums;
		} else {
			int[] newNums = new int[nums.length - 1];
			for (int i = 0; i < nums.length - 1; i++) {
				newNums[i] = (nums[i] + nums[i + 1]) % 10;
			}
			return lastSum(newNums);
		}

	}

}
