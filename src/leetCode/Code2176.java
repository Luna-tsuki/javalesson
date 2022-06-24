package leetCode;

public class Code2176 {

	//请你返回满足 0 <= i < j < n ，nums[i] == nums[j] 
	//且 (i * j) 能被 k 整除的数对 (i, j) 的 数目 。
	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
		int k = 2;

		System.out.println(countPairs(nums, k));

	}

	public static int countPairs(int[] nums, int k) {

		int n = nums.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j] && (i*j) % k == 0) {
					++count;
					System.out.println(i);
					System.out.println(j);
				}
			}
		}
		return count;
	}
}
