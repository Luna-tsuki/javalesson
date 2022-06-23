package leetCode;

import java.util.Arrays;

public class Code1637 {

	// 两点之间不包含任何点的最宽垂直面积
	public static void main(String[] args) {
		int[][] points = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
		System.out.println(maxWidthOfVerticalArea(points));
	}

	public static int maxWidthOfVerticalArea(int[][] points) {
		int[] arr = new int[points.length];

		for (int i = 0; i < points.length; i++) {
			arr[i] = points[i][0];
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] > temp) {
				temp = arr[i + 1] - arr[i];
			}
		}

		return temp;
	}
}
