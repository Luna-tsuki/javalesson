package leetCode;

public class Code807 {

	public static void main(String[] args) {
		int[][] gird = { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } };
		System.out.println(maxIncreaseKeepingSkyline(gird));
	}

	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int sum = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				// 找到横排（1个子数组）内最大值
				int tempRowMax = 0;
				for (int row = 0; row < grid.length; row++) {
					if (tempRowMax < grid[i][row]) {
						tempRowMax = grid[i][row];
					}
				}
				// 找到竖排内最大值
				int tempColumnMax = 0;
				for (int column = 0; column < grid.length; column++) {
					if (tempColumnMax < grid[column][j]) {
						tempColumnMax = grid[column][j];
					}
				}
				if (tempRowMax >= tempColumnMax) {
					sum += tempColumnMax - grid[i][j];
				} else {
					sum += tempRowMax - grid[i][j];
				}

			}
		}

		return sum;

	}

}
