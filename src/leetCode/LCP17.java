package leetCode;

public class LCP17 {

	//速算机器人
	public static void main(String[] args) {
		String s = "AB";
		System.out.println(calculate(s));

	}

	public static int calculate(String s) {
		int sum = 0;
		int x = 1;
		int y = 0;

		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') {
				x = 2 * x + y;
			} else if (s.charAt(i) == 'B') {
				y = 2 * y + x;
			}
		}

		sum = x + y;
		
		return sum;
	}
}
