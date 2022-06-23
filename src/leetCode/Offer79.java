package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer79 {
	// 给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };

		Solution s = new Solution();
		System.out.println(s.subsets(nums));
	}
}

class Solution {
	List<Integer> t = new ArrayList<Integer>();
	List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public List<List<Integer>> subsets(int[] nums) {
		dfs(0, nums); // 递归
		return lists;
	}

	public void dfs(int cur, int[] nums) {
		// 判断最后一次递归条件
		if (cur == nums.length) {
			lists.add(new ArrayList<Integer>(t));
			System.out.println("cur is out " + cur + " lists add " + t);
			System.out.println();
			return;
		}
		// 添加
		t.add(nums[cur]);
		System.out.println("cur is add " + cur + " t is " + t);
		dfs(cur + 1, nums);

		// 删除
		t.remove(t.size() - 1);
		System.out.println("cur is remove " + cur + " t is " + t);
		dfs(cur + 1, nums);
	}
}