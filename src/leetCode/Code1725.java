package leetCode;

public class Code1725 {

	//可以形成最大正方形的矩形数目
	public static void main(String[] args) {
		int[][] rectangles = { { 5, 8 }, { 3, 9 }, { 5, 12 }, { 16, 6 } };
		System.out.println(countGoodRectangles(rectangles));

	}

	public static int countGoodRectangles(int[][] rectangles) {
		int count = 0;
		int min = 0;

		for (int[]arr : rectangles) {
			int num0=arr[0];
			int num1=arr[1];
			
			int tempmin = Math.min(num0, num1);
//			System.out.println(tempmin);
			
			if (min == tempmin) {
				++count;
			} else if (min < tempmin) {
				min = tempmin;
				count = 1;
			}
		}

		return count;
	}
}
