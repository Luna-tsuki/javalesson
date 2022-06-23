package leetCode;

public class Code861 {

	// 翻转矩阵后的得分
	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
		System.out.println(matrixScore(grid));
	}

	public static int matrixScore(int[][] grid) {
		int sum = 0;

		// 先翻转每行，保证第一列都为1
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][0] != 1) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] == 1) {
						grid[i][j] = 0;
						// System.out.println(grid[i][j]);
					} else {
						grid[i][j] = 1;
						// System.out.println(grid[i][j]);
					}
				}
			}
		}

		// 翻转每列，保证1的数量大于0
		int count0 = 0;
		int count1 = 0;
		for (int j = 1; j < grid[0].length; j++) {
			count0 = 0;
			count1 = 0;
			// 遍历每列
			for (int i = 0; i < grid.length; i++) {
				if (grid[i][j] == 0) {
					++count0;
				} else {
					++count1;
				}
			}
			// 判断1和0的数量,如果0的数量大于1的数量，那么需要翻转改列
			if (count0 > count1) {
				for (int i = 0; i < grid.length; i++) {
					if (grid[i][j] == 1) {
						grid[i][j] = 0;
						// System.out.println(grid[i][j]);
					} else {
						grid[i][j] = 1;
						// System.out.println(grid[i][j]);
					}
				}
			}

		}

		// 将数组grid按照2进制计算输出
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				sum += Math.pow(2, grid[0].length - 1 - j) * grid[i][j];
			}
		}
//		System.out.println(Arrays.toString(grid[0]));
//		System.out.println(Arrays.toString(grid[1]));
//		System.out.println(Arrays.toString(grid[2]));
		return sum;
	}

}
