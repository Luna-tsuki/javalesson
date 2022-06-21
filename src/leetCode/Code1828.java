package leetCode;

public class Code1828 {

	// 对于每一个查询 queries[j] ，计算在第 j 个圆 内 点的数目。
	// 返回一个数组 answer ，其中 answer[j]是第 j 个查询的答案。
	public static void main(String[] args) {
		int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 5 }, { 5, 5 } };
		int[][] queries = { { 1, 2, 2 }, { 2, 2, 2 }, { 4, 3, 2 }, { 4, 3, 3 } };
		int[] answer = countPoints(points, queries);
		for (int e : answer) {
			System.out.println(e);
		}

	}

	public static int[] countPoints(int[][] points, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int j = 0; j < queries.length; j++) {

			int count = 0;
			for (int i = 0; i < points.length; i++) {
				int sideLength1 = queries[j][0] - points[i][0];
				int sideLength2 = queries[j][1] - points[i][1];
				int L1 = (int) Math.pow(sideLength1, 2);
				int L2 = (int) Math.pow(sideLength2, 2);
				int L3 = (int) Math.pow(queries[j][2], 2);
				if (L1 + L2 <= L3) {
					++count;
				}
			}
			answer[j] = count;
		}
		return answer;
	}

}
