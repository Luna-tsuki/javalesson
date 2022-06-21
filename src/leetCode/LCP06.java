package leetCode;

public class LCP06 {

	// 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
	// 我们每次可以选择任意一堆，拿走其中的一枚或者两枚
	// 求拿完所有力扣币的最少次数。
	public static void main(String[] args) {
		int[] coins = { 1, 5, 5, 6 };
		System.out.println(minCount(coins));
	}

	public static int minCount(int[] coins) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] % 2 == 0) {
				count = coins[i] / 2;
				System.out.println(coins[i]);
				System.out.println("q " + count);
			} else {
				count = coins[i] / 2 + 1;
				System.out.println("s " + count);
			}
			sum += count;
		}
		return sum;
	}
}
