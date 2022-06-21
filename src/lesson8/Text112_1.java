package lesson8;

public class Text112_1 {

	// 一个五角数被定义为n(3n-1)/2, 其中n=1,2,…。所以, 开始的几个数字就是1,5, 12,22, 编写方法返回一个五角数
	// 编写一个测试程序显示前100 个五角数，每行显示10 个。
	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int get = getPentagonalNumber(n);
			System.out.printf("%6d", get);
			if (n % 10 == 0) {
				System.out.println("\n");
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		int number = n * (3 * n - 1) / 2;
		return number;
	}
}