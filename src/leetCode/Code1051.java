package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code1051 {

	// 高度检查器
	public static void main(String[] args) {
		int[] heights = { 5,1,2,3,4 };
		System.out.println(heightChecker(heights));

	}

	public static int heightChecker(int[] heights) {
		int[] expected = Arrays.copyOf(heights, heights.length);
		Arrays.sort(expected);

		int n = expected.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (expected[i] != heights[i]) {
				++count;
			}
		}
		return count;

	}
}
