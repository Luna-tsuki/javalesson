package leetCode;

public class Code1672 {
	// 给你一个 m x n 的整数网格 accounts ，
	// 其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。
	// 返回最富有客户所拥有的 资产总量 。

	public static void main(String[] args) {
		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
		System.out.print(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum = sum + accounts[i][j];
			}
			if (sum > max) {
				max = sum;
			}
		}

		return max;
	}
}
