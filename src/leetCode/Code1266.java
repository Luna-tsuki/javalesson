package leetCode;

public class Code1266 {

	// 必须按照数组中出现的顺序来访问这些点。
	// 计算访问所有这些点需要的 最小时间
	public static void main(String[] args) {
		int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };
		System.out.println(minTimeToVisitAllPoints(points));
	}

	public static int minTimeToVisitAllPoints(int[][] points) {
		int sum = 0;
		for (int i = 0; i < points.length - 1; i++) {
			int temp0 = points[i + 1][0] - points[i][0];
			int temp1 = points[i + 1][1] - points[i][1];

			if (Math.abs(temp0) > Math.abs(temp1)) {
				sum += Math.abs(temp0);
			} else {
				sum += Math.abs(temp1);
			}

		}

		return sum;
	}

}
