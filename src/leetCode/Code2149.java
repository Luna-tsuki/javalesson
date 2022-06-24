package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Code2149 {
	// 重排 nums 中的元素
	public static void main(String[] args) {
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		System.out.println(Arrays.toString(rearrangeArray(nums)));
	}

	public static int[] rearrangeArray(int[] nums) {
		// 把所有正数放入positiveArr数组，所有负数放入negativeArr数组
		ArrayList<Integer> positiveArr = new ArrayList<Integer>();
		ArrayList<Integer> negativeArr = new ArrayList<Integer>();

		for (int i : nums) {
			if (i > 0) {
				positiveArr.add(i);
			} else {
				negativeArr.add(i);
			}
		}
		System.out.println("positiveArr " + positiveArr);
		System.out.println("negativeArr " + negativeArr);

		// 一正一负 塞入新的newArr数组
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < positiveArr.size(); i++) {
			newArr.add(positiveArr.get(i));
			newArr.add(negativeArr.get(i));
		}
		System.out.println("newArr " + newArr);

		// ArrayList转int数组 
		// List＜Integer＞转为int[]数组
		int[] arr = newArr.stream().mapToInt(i -> i).toArray();
		return arr;
	}
}
