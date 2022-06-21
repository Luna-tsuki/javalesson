package lesson9;

public class Text139 {

	public static void main(String[] args) {
		// 数组的排序
		int[] list = { 1, 3, 2, 4, 8, 6, 7 };
		selectSort(list);

		for (int e : list) {
			System.out.println(e);
		}
	}

	public static void selectSort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}

	}

}
