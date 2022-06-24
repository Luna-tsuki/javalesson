package leetCode;

public class Code2185 {

	public static void main(String[] args) {
		String[] words = { "leetcode","win","loops","success" };
		String pref = "code";
		System.out.println(prefixCount(words, pref));
	}

	public static int prefixCount(String[] words, String pref) {
		int sum = 0;

		int n = words.length;
		for (int i = 0; i < n; i++) {
			if (words[i].startsWith(pref)) {
				++sum;
			}
		}

		return sum;
	}
}
