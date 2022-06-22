package leetCode;

public class Code2220 {

	// 转换数字的最少位翻转次数
	public static void main(String[] args) {
		int start = 97;
		int goal = 21;
		System.out.println(minBitFlips(start, goal));
	}

	public static int minBitFlips(int start, int goal) {
		int sum1 = 0;
		int sum2 = 0;

		String s1 = Integer.toBinaryString(start);
		String s2 = Integer.toBinaryString(goal);
		int length1 = s1.length();
		int length2 = s2.length();
		int min = Math.min(length1, length2);
		int max = Math.max(length1, length2);

		if (length1 < length2) {
			for (int i = min - 1; i >= 0; i--) {
				if (s1.charAt(i) != s2.charAt(i + max - min)) {
					++sum1;
				}
			}
			for (int i = 0; i < max - min; i++) {
				if (s2.charAt(i) == 49) {
					++sum2;
				}
			}
		} else {
			for (int i = min - 1; i >= 0; i--) {
				if (s2.charAt(i) != s1.charAt(i + max - min)) {
					++sum1;
				}
			}
			for (int i = 0; i < max - min; i++) {
				if (s1.charAt(i) == 49) {
					++sum2;
				}
			}
		}

		return sum1 + sum2;
	}

}
