package lesson6;

public class Text92_5 {

	public static void main(String[] args) {
		// 假设一个车牌号码由三个大写字母和后面的四个数字组成。编写一个程序. 生成一个车牌号码。
		char chr1 = (char) ((int) (Math.random() * 26) + 65);
		char chr2 = (char) ((int) (Math.random() * 26) + 65);
		char chr3 = (char) ((int) (Math.random() * 26) + 65);
		int i = (int) (Math.random() * 9999);

		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(i);

		String x2 = "" + chr1 + chr2 + chr3 + i;
		System.out.println(x2);

	}
}