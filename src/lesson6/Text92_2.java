package lesson6;

public class Text92_2 {

	public static void main(String[] args) {
		// 编写一个程序，使用Math.random()方法显示一个随机的大写字母。
		int i = (int) (Math.random() * 26) + 65;

		char chr = (char) i;

		System.out.println((chr));
	}
}