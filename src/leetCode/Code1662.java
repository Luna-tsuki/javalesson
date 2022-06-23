package leetCode;

public class Code1662 {

	//检查两个字符串数组是否相等
	public static void main(String[] args) {
		String[] word1 = { "a", "cb" };
		String[] word2 = { "ab", "c" };
		System.out.println(arrayStringsAreEqual(word1, word2));

	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		boolean isOrNot = false;
		String c1 = "";
		String c2 = "";

		for (String i : word1) {
			c1 += i;
		}
		
		for (String i : word2) {
			c2 += i;
		}

		if (c1.equals(c2)) {
			isOrNot = true;
		}

		return isOrNot;
	}
}
