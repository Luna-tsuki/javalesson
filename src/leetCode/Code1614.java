package leetCode;

public class Code1614 {

	// 给你一个 有效括号字符串 s，返回该字符串的 s 嵌套深度 。
	public static void main(String[] args) {
		String s = "(1)+((2))+((((3))))";
		System.out.println(maxDepth(s));
	}

	public static int maxDepth(String s) {
		int sum = 0;
		int temp = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				++temp;
				sum = Math.max(sum, temp);
			} else if (s.charAt(i) == ')') {
				--temp;
			}
		}

		return sum;
	}

}
