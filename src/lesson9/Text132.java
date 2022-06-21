package lesson9;

public class Text132 {

	public static void main(String[] args) {
		// 数组的复制
		int[] sourceArray = { 2, 3, 4 };
		int[] targetArray = new int[sourceArray.length];

		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

		for (int e : targetArray) {
			System.out.println(e + " ");
		}
	}
}