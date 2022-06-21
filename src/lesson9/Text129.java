package lesson9;

public class Text129 {

	public static void main(String[] args) {
		// 移动数组元素
		double[] myList = { 1, 2, 3, 4, 5 };
		double temp = myList[0];

		for (int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
		}
		myList[myList.length - 1] = temp;

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}

		// for each循环
		for (double e : myList) {
			System.out.println(e);
		}

	}
}
