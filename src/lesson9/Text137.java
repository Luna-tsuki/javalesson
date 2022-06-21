package lesson9;

public class Text137 {

	public static void main(String[] args) {
		// 线性查找法
		int[] list = { 1, 4, 3, 3, 8, 5, 6 };
		int i = search(list, 2);
		int j = search(list, 5);

		System.out.println("i is : " + i);
		System.out.println("j is : " + j);
	}

	public static int search(int[] list, int key) {

		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}

		}
		return -1;
	}

}
