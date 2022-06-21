package lesson9;

public class Text133 {

	public static void main(String[] args) {
		// 将数组传递给方法
		int[] a = { 2, 3, 4 };

		swap(a[0], a[1]);
		swapFirstTwoInArray(a);
	}

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("a[0] is " + n1 + " ; a[1] is " + n2);
	}

	public static void swapFirstTwoInArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("a[0] is " + array[0] + " ; a[1] is " + array[1]);
	}
}