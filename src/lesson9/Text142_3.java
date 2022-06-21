package lesson9;

import java.util.Scanner;

public class Text142_3 {

	public static void main(String[] args) {
		// 编写一个程序，读入个数不确定的考试分数
		// 并且判断有多少个分数是大于或等于平均分，多少个分数是低于平均分的。
		// 输人一个负数表示输入的结束
		// TODO code application logic here

		double[] scoreList = new double[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter scores: (negative number signifies end): ");
		int count = 0;
		double score;
		do {
			score = input.nextDouble();
			scoreList[count] = score;
			count++;
		} while (score >= 0);

		double average, sum = 0;
		for (int i = 0; i < count - 1; i++) {
			sum += scoreList[i];
		}

		average = sum / (count - 1);
		System.out.println("Average of scores: " + average);
		int minAverage = 0;
		int maxAverage = 0;
		for (int i = 0; i < count - 1; i++) {
			if (scoreList[i] >= average) {
				minAverage++;
			} else {
				maxAverage++;
			}
		}
		System.out.println("Number of scores above or equal to average: " + minAverage + "\n"
				+ "Number of scores below average: " + (maxAverage));
		
		input.close();
	}
}
