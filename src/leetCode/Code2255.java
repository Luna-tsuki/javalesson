package leetCode;

public class Code2255 {

	//统计是给定字符串前缀的字符串数目
	public static void main(String[] args) {
		String[] words = { "a", "b", "c", "ab", "bc", "abc" };
		String s = "abc";
		System.out.println(countPrefixes(words, s));

	}

	public static int countPrefixes(String[] words, String s) {
		int sum = 0;

		for (int i = 0; i < words.length; i++) {

			if (s.startsWith(words[i])) {
				++sum;
			}
		}
		return sum;
	}
}
