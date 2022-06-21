package lesson9;

public class Text124 {

	public static void main(String[] args) {
		// 找到数组内最大值
		double[] myList = new double[5];
		for (int i = 0; i < 5; i++) {
			myList[i] = Math.random() * 100;
		}

		double max = myList[0];
		for (int i = 0; i < 5; i++) {
			if (myList[i] > max) {
				max = myList[i];
				System.out.println("MAX= " + myList[i]);
			}
		}

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");
		}
	}

}
