package leetCode;

import java.util.Arrays;

public class Code2037 {
	// 请你返回使所有学生都有座位坐的 最少移动次数 ，并确保没有两位学生的座位相同。

	public static void main(String[] args) {
		int[] seats = { 12, 14, 19, 19, 12 };
		int[] students = { 19, 2, 17, 20, 7 };

		System.out.println(minMovesToSeat(seats, students));

	}

	public static int minMovesToSeat(int[] seats, int[] students) {
		int sum = 0;

		Arrays.sort(seats);
		Arrays.sort(students);

		for (int i = 0; i < seats.length; i++) {
			sum += Math.abs(seats[i] - students[i]);
		}

		return sum;
	}
}
