package leetCode;

public class Code1684 {

	//统计一致字符串的数目
	public static void main(String[] args) {
		String allowed = "cad";
		String[] words = { "cc","acd","b","ba","bac","bad","ac","d" };
		System.out.println(countConsistentStrings(allowed, words));
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		int n = words.length;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (!allowed.contains(words[i].charAt(j) + "")) {
					--n;
					break;
				}
			}

		}

		return n;
	}
}
