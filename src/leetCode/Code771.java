package leetCode;

import java.util.Arrays;

public class Code771 {
	// 给你一个字符串 jewels 代表石头中宝石的类型，
	// 另有一个字符串 stones 代表你拥有的石头。 
	// stones 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
	// 字母区分大小写，因此 "a" 和 "A" 是不同类型的石头。

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		char[] jewelsChar = jewels.toCharArray();
		char[] stonesChar = stones.toCharArray();
		System.out.println(Arrays.toString(jewelsChar));
		System.out.println(Arrays.toString(stonesChar));

		int sum = 0;
		for (int i = 0; i < jewelsChar.length; i++) {
			for (int j = 0; j < stonesChar.length; j++) {
				if (jewelsChar[i] == stonesChar[j]) {
					++sum;
				}
			}
		}
		return sum;
	}
}
