package lesson9;

public class Text123 {

	public static void main(String[] args) {
		// 数组求和
		double[] myList = new double[5];
		for (int i = 0; i < 5; i++) {
			myList[i] = Math.random() * 100;
		}
		double total = 0;
		for (int i = 0; i < 5; i++) {
			total += myList[i];
		}
		System.out.println("total:" + total);
	}

}
