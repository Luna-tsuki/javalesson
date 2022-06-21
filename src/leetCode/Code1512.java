package leetCode;

public class Code1512 {

	//如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
	//返回好数对的数目。
	public static void main(String[] args) {
		int[] nums = { 1,2,3 };
		System.out.println(numIdenticalPairs(nums));

	}

	public static int numIdenticalPairs(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) {
					++sum;
				}

			}

		}

		return sum;

	}

}
