package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Code2194 {

	public static void main(String[] args) {
		String s = "K1:L2";
		System.out.println(cellsInRange(s));

	}

	public static List<String> cellsInRange(String s) {

		List<String> list = new ArrayList<String>();

		char s1 = s.charAt(0);
		int num1 = s.charAt(1) - 48;
		char s2 = s.charAt(3);
		int num2 = s.charAt(4) - 48;

		for (int i = s1; i <= s2; i++) {
			for (int j = num1; j <= num2; j++) {
				char temp = (char) (i);
				String temp2 = String.valueOf(j);
				list.add(temp + temp2 + "");
			}
		}

		return list;
	}

}
