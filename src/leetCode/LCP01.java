package leetCode;

public class LCP01 {
	// 小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。
	// 一共进行三次这个游戏，请返回 小A 猜对了几次？

	public static void main(String[] args) {
		int[] guess = { 2, 2, 3 };
		int[] answer = { 3, 2, 1 };

		System.out.println(game(guess, answer));

	}

	public static int game(int[] guess, int[] answer) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			if (guess[i] == answer[i]) {
				sum++;
			}

		}

		return sum;
	}
}
