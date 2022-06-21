package leetCode;

public class Code1791 {

	// 找出并返回 edges 所表示星型图的中心节点。
	public static void main(String[] args) {
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
		System.out.println(findCenter(edges));

	}

	public static int findCenter(int[][] edges) {
		int count = 0;
		int count2 = 0;
		int num = 0;

		for (int i = 1; i < edges.length; i++) {
			for (int j = 1; j < edges[i].length; j++) {

				if (edges[0][0] == edges[i][j]) {
					++count;

				} else if (edges[0][1] == edges[i][j]) {
					++count2;
				}

			}

		}
		if (count >= count2) {
			num = edges[0][0];

		} else {
			num = edges[0][1];
		}

		return num;
	}

}
