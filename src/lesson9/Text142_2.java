package lesson9;

import java.util.Scanner;

public class Text142_2 {

	// public static void main(String[] args) {
//    //编写程序，读取10 个整数，然后按照和读入顺序相反的顺序将它们显示出来。
//    int[] list = {1, 2, 3};
//    int[] list2 = new int[3];
//    for (int i = 0; i <= list.length - 1; i++) {
//      list2[i] = list[list.length - 1 - i];
//    }
//    System.out.print(Arrays.toString(list2));
//  }

	public static void main(String[] args) {
		int[] array = new int[10];

		// Prompt the user to enter ten integers
		System.out.print("Enter ten integers: ");

		// fill the array
		fill(array);

		// Display integers in reverse order
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void fill(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
	}
}
