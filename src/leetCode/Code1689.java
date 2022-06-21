package leetCode;

import java.util.Arrays;

public class Code1689 {

	public static void main(String[] args) {
		String n = "82734";
		System.out.println(minPartitions(n));

	}

	public static int minPartitions(String n) {
		int max = 0;

		char[] charMax = n.toCharArray();
		System.out.println(Arrays.toString(charMax));

		for (int i = 0; i < charMax.length; i++) {
			if (max < charMax[i]-'0') {
				max = charMax[i]-'0';
			}

		}

		return max;

	}

}
