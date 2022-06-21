package lesson9;

public class Text135 {

	public static void main(String[] args) {
		// 从方法中返回数组

		int[] list1 = { 1, 2, 3, 4 };
		int[] list2 = reverse(list1);

		for (int e : list2) {
			System.out.println(e + " ");
		}

	}

	public static int[] reverse(int[] list) {

		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}

		return result;
	}

}