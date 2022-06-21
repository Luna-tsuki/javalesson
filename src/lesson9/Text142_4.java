package lesson9;

public class Text142_4 {

	public static void main(String[] args) {
		// 编写两个重载的方法，使用下面的方法头返回一个数组的平均数：
		// public static int average(int[] array)
		// public static double average(double[3 array)

		int[] list = { 1, 2, 3 };
		int average1 = average(list);
		for (int e : list) {
			System.out.print(e + " ");
		}
		System.out.println(average1);

		double[] list2 = { 1.0, 2.2, 3 };
		double average2 = average(list2);
		for (double e : list2) {
			System.out.print(e + " ");
		}
		System.out.println(average2);
	}

	public static int average(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		int average = sum / array.length;
		return average;
	}

	public static double average(double[] array) {
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;
		return average;
	}
}
