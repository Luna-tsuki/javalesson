package leetCode;

public class Offer58 {
	public static void main(String[] args) {
		//定义一个函数实现字符串左旋转操作的功能。
		//输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
		String s = "lrloseumgh";

		System.out.print(reverseLeftWords(s, 6));
	}

	public static String reverseLeftWords(String s, int n) {

		int length = s.length();

		String s1 = s.substring(0, n);
		String s2 = s.substring(n, length);

		String sTotal = s2 + s1 + "";

		return sTotal;

	}

}
