package leetCode;

import java.util.Arrays;

public class Code1480 {
	// 给你一个四位 正 整数 num 。请你使用 num 中的 数位 ，将 num 拆成两个新的整数 new1 和 new2 。
	// new1 和 new2 中可以有 前导 0 ，且 num 中 所有 数位都必须使用。
	// 请你返回可以得到的 new1 和 new2 的 最小 和。

	public static void main(String[] args) {
		int num = 4009;
		System.out.print(minimumSum(num));
//		int[] list1 = {1,2};
//		Arrays.sort(list1);
	}

	public static int minimumSum(int num) {
		
		int[] list = new int[4];

		list[0] = num / 1000;
		list[1] = (num % 1000) / 100;
		list[2] = (num % 100) / 10;
		list[3] = num % 10;
		
		Arrays.sort(list);
		System.out.print(Arrays.toString(list));
//		int temp;
//		boolean swapped;
//		do {
//			swapped = false;
//			for (int i = 0; i < list.length - 1; i++) {
//				if (list[i] > list[i + 1]) {
//					temp = list[i];
//					list[i] = list[i + 1];
//					list[i + 1] = temp;
//					swapped = true;
//				}
//			}
//		} while (swapped);

		// 2&2
		int min1 = (list[0] + list[1]) * 10 + list[2] + list[3];

		// 3&1
		int min2 = list[0] * 100 + list[1] * 10 + list[2] + list[3];

		if (min1 <= min2) {
			return min1;
		} else {
			return min2;
		}

	}
}
