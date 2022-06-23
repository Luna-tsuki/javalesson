package leetCode;

import java.util.ArrayList;

public class Code1021 {
	//删除最外层的括号
	public static void main(String[] args) {
		String s = "(()())(())";

		System.out.println(removeOuterParentheses(s));
	}

	public static String removeOuterParentheses(String s) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 0;

		// 找到要去掉的括号index值
		list.add(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				++temp;
			} else {
				--temp;
			}
			if (temp == 0) {
				list.add(i);
				list.add(i + 1);
			}
		}

		list.remove(list.size() - 1);
		System.out.println("list is " + list);

		// 把去掉括号下标值去掉后放入新的字符串
		String sNew = "";

		for (int i = 0; i < list.size(); i += 2) {
			sNew += (String) s.subSequence(list.get(i)+1, list.get(i + 1));
			//System.out.println("sNew is " + sNew);
		}
		return sNew;
	}

}
