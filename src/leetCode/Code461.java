package leetCode;

public class Code461 {

	//汉明距离
	public static void main(String[] args) {
		int x = 3;
		int y = 1;
		System.out.println(hammingDistance(x, y));
	}

	public static int hammingDistance(int x, int y) {
		int sum = 0;

		String temp1 = Integer.toBinaryString(x ^ y);// int转换为二进制字符串
		for (int i = 0; i < temp1.length(); i++) {
			if (temp1.charAt(i) == 49) {
				++sum;
			}
		}

		return sum;
	}
}

//return Integer.bitCount(x ^ y);统计整数的二进制表达式中的bit位为1的位数