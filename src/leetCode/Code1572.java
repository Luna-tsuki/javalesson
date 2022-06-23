package leetCode;

public class Code1572 {

	//矩阵对角线元素的和
	public static void main(String[] args) {
		int[][] mat = { { 1,1,1,1 }, { 1,1,1,1 }, { 1,1,1,1 }, { 1,1,1,1 } };
		System.out.println(diagonalSum(mat));
	}

	public static int diagonalSum(int[][] mat) {
		int sum = 0;
		int indexLength = mat.length;

		for (int i = 0; i < indexLength; i++) {

			sum += mat[i][i] + mat[i][indexLength - 1 - i];

		}
		if (indexLength % 2 != 0) {
			sum -= mat[(indexLength - 1) / 2][(indexLength - 1) / 2];
		}

		return sum;
	}

}
