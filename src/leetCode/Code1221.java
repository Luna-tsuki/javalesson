package leetCode;

public class Code1221 {
	//在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
	//给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
	//分割得到的每个字符串都必须是平衡字符串，且分割得到的平衡字符串是原平衡字符串的连续子串。
	//返回可以通过分割得到的平衡字符串的最大数量。

	public static void main(String[] args) {
		String s = "RLRRRLLRLL";
		System.out.println(balancedStringSplit(s));

	}

	public static int balancedStringSplit(String s) {
		int sum = 0;
		int index = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				++index;
			} else {
				--index;
			}
			if (index == 0) {
				++sum;
			}
		}

		return sum;

	}
}
