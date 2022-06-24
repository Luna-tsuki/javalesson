package leetCode;

import java.util.Arrays;

public class Code832 {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
//		System.out.println(Arrays.toString(flipAndInvertImage(image)));
		
		for(int[] i:flipAndInvertImage(image)) {
			System.out.println(Arrays.toString(i));
		}

	}

	public static int[][] flipAndInvertImage(int[][] image) {
		int n = image.length;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][n - 1 - j] = image[i][j];
				if (arr[i][n - 1 - j] == 0) {
					arr[i][n - 1 - j] = 1;
				} else {
					arr[i][n - 1 - j] = 0;
				}
			}
		}

		return arr;
	}
}
