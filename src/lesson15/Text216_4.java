package lesson15;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Text216_4 {

	// • 创建一个由 100 个随机选取的整数构成的数组。
	// • 提示用户输人数组的下标，然后显示对应的元素值。如果指定的下标越界，就显示消息 Out of Bounds。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("请输入数组的下标：");
		int n = sc.nextInt();
		try {
			if (n >= 100 || n < 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Out of Bounds");
		}
	}

}