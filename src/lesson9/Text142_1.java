package lesson9;

import java.util.Scanner;

public class Text142_1 {

	public static void main(String[] args) {
		// 编写一个程序，读入学生成绩，获取最高分best，然后根据下面的规则赋等级值。
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the total number of students
		System.out.print("Enter the number of students: ");
		int[] scores = new int[input.nextInt()];
		char[] grades = new char[scores.length];

		// Prompt the user to enter all the scores
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter No." + i + " scores: ");
			scores[i] = input.nextInt();
		}

		// Get grades
		getGrades(scores, grades);

		// Display results
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}
		input.close();
	}

	/**
	 * Method max returns the is highest score
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * Method getGrade assigns grades based on grading scheme
	 */
	public static void getGrades(int[] scores, char[] grades) {
		int best = max(scores);
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= best - 10) {
				grades[i] = 'A';
			} else if (scores[i] >= best - 20) {
				grades[i] = 'B';
			} else if (scores[i] >= best - 30) {
				grades[i] = 'C';
			} else if (scores[i] >= best - 40) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}
	}
}
