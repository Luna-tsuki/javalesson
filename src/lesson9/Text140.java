package lesson9;

import java.util.Arrays;

public class Text140 {

	public static void main(String[] args) {
		// Arrays排序

		// 数字排序
		int[] list = { 1, 3, 2, 4, 8, 6, 7 };
		Arrays.sort(list);
		for (int e : list) {
			System.out.print(e + " ");
		}

		// 字符排序
		char[] chars = { 'a', 'f', 'd' };
		Arrays.sort(chars);
		System.out.println(chars);

		// 部分排序
		int[] list2 = { 1, 3, 2, 4, 8, 6, 7 };
		Arrays.sort(list2, 1, 3);
		for (int e : list2) {
			System.out.print(e + " ");
		}

		System.out.print("\n");

		// 查询
		int index = Arrays.binarySearch(list2, 3);
		System.out.println(index);

		// 填充
		int[] list3 = new int[5];
		Arrays.fill(list3, 5);
		for (int e : list3) {
			System.out.print(e + " ");
		}

		System.out.print("\n");

		// 填充部分
		int[] list4 = new int[5];
		Arrays.fill(list4, 1, 3, 8);
		for (int e : list4) {
			System.out.print(e + " ");
		}

		System.out.print("\n");

		// 打印
		System.out.print(Arrays.toString(list4));
	}

}
