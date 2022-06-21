package lesson9;

public class Text138 {

	public static void main(String[] args) {
		// 二分查找
		int[] list = { 1, 2, 3, 4, 5, 6, 7 };
		int i = search(list, 2);
		int j = search(list, 5);

		System.out.println("Index of i is : " + i);
		System.out.println("Index of j is : " + j);
	}

	public static int search(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -low - 1;
	}

}
