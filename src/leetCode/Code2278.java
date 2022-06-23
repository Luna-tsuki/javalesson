package leetCode;

public class Code2278 {

	//字母在字符串中的百分比
	public static void main(String[] args) {
		String s = "foobar";
		char letter = 'o';
		System.out.println(percentageLetter(s, letter));
	}

	public static int percentageLetter(String s, char letter) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == letter) {
				++count;
			}
		}

		int sum = count * 100 / s.length();

		return sum;
	}
}
