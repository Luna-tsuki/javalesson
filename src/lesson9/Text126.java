package lesson9;

public class Text126 {

	public static void main(String[] args) {
		// 找到数组内最大值的最小下标值

		double[] myList = { 1, 2, 5, 4, 5, 3, };
		double max = myList[0];

		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
				indexOfMax = i;
			}
		}

		System.out.println("max = " + max + " indexOfMax = " + indexOfMax);
	}

}
