package leetCode;

public class Code1688 {

	// 如果当前队伍数是 偶数 ，那么每支队伍都会与另一支队伍配对。
	// 总共进行 n / 2 场比赛，且产生 n / 2 支队伍进入下一轮。
	// 如果当前队伍数为 奇数 ，那么将会随机轮空并晋级一支队伍，其余的队伍配对。
	// 总共进行 (n - 1) / 2 场比赛，且产生 (n - 1) / 2 + 1 支队伍进入下一轮。

	public static void main(String[] args) {
		int n = 7;
		System.out.println(numberOfMatches(n));

	}

	public static int numberOfMatches(int n) {
		int sum = 0;

		while (n >= 2) {
			int count;

			if ((n % 2) == 0) {
				count = n / 2;
				n = count;
			} else {
				count = (n - 1) / 2;
				n = count + 1;
			}

			sum = sum + count;
			System.out.println(sum);

		}

		return sum;
	}

}
