package leetCode;

import java.util.ArrayList;

public class Code804 {

	// 给你一个字符串数组 words ，每个单词可以写成每个字母对应摩尔斯密码的组合。
	// 对 words 中所有单词进行单词翻译，返回不同 单词翻译 的数量。
	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] arr = new String[words.length];

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String temp = "";

		for (int i = 0; i < words.length; i++) {
			temp = "";
			for (int j = 0; j < words[i].length(); j++) {
				temp += morse[words[i].charAt(j) - 97];
			}
			arr[i] = temp;
		}

		// 新建一个ArrayList存放字符串
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			// 如果集合里面没有相同的元素才往里存
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}

		return list.toArray().length;
	}

}
