package leetCode;

import java.util.Arrays;

public class Code2283 {

	public static void main(String[] args) {
		String num = "1210";
		System.out.println(digitCount(num));
	}

	public static boolean digitCount(String num) {
		boolean isOrNOt = true;

		int n = num.length();
		System.out.println(n);

		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));

		// 统计num中各个数字出现的次数，推入arr
		for (int i = 0; i < n; i++) {
			switch (num.charAt(i)) {
			case '0':
				++arr[0];
				break;
			case '1':
				++arr[1];
				break;
			case '2':
				++arr[2];
				break;
			case '3':
				++arr[3];
				break;
			case '4':
				++arr[4];
				break;
			case '5':
				++arr[5];
				break;
			case '6':
				++arr[6];
				break;
			case '7':
				++arr[7];
				break;
			case '8':
				++arr[8];
				break;
			case '9':
				++arr[9];
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < n; i++) {
			if (num.charAt(i) - 48 != arr[i]) {
				isOrNOt = false;
			}
		}
		return isOrNOt;
	}
}
