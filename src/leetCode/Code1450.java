package leetCode;

public class Code1450 {

	//在既定时间做作业的学生人数
	public static void main(String[] args) {
		int[] startTime = { 1, 2, 3 };
		int[] endTime = { 3, 2, 7 };
		int queryTime = 4;

		System.out.println(busyStudent(startTime, endTime, queryTime));

	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

		int sum = 0;

		for (int i = 0; i < startTime.length; i++) {

			if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
				++sum;
			}

		}

		return sum;
	}

}
