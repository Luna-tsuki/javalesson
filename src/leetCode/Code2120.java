package leetCode;

import java.util.Arrays;

public class Code2120 {

	//返回一个长度为 m 的数组 answer ，其中 answer[i] 是机器人从第 i 条指令 开始 ，可以执行的 指令数目 
	public static void main(String[] args) {
		int n = 3;
		int[] startPos = { 0,1 };
		String s = "RRDDLU";

		System.out.println(Arrays.toString(executeInstructions(n, startPos, s)));

	}

	public static int[] executeInstructions(int n, int[] startPos, String s) {
		int count = 0;
		int num1 = startPos[0];
		int num2 = startPos[1];
		int[] arr = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			count = 0;
			startPos[0] = num1;
			startPos[1] = num2;

			for (int j = i; j < s.length(); j++) {

				if (s.charAt(j) == 'L') {
					startPos[1] = startPos[1] - 1;
					++count;
					if (startPos[1] < 0) {
						--count;
						break;
					}
				} else if (s.charAt(j) == 'R') {
					startPos[1] = startPos[1] + 1;
					++count;
					if (startPos[1] > n - 1) {
						--count;
						break;
					}
				} else if (s.charAt(j) == 'U') {
					startPos[0] = startPos[0] - 1;
					++count;
					if (startPos[0] < 0) {
						--count;
						break;
					}
				} else if (s.charAt(j) == 'D') {
					startPos[0] = startPos[0] + 1;
					++count;
					if (startPos[0] > n - 1) {
						--count;
						break;
					}
				}
			}

			arr[i] = count;
		}

		return arr;
	}
}
