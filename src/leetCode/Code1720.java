package leetCode;

import java.util.Arrays;

public class Code1720 {
	//异或运算
	public static void main(String[] args) {
		int[] encoded = { 6,2,7,3 };
		int first = 4;

		System.out.print(Arrays.toString(decode(encoded, first)));
	}

	public static int[] decode(int[] encoded, int first) {
		int[] arr = new int[encoded.length + 1];
		arr[0] = first;
		for (int i = 1; i < encoded.length + 1; i++) {
			arr[i] = encoded[i-1] ^ arr[i - 1];
		}

		return arr;

	}

}

//异或运算具有如下性质：
//异或运算满足交换律和结合律；
//任意整数和自身做异或运算的结果都等于 0，即 x ^ x = 0；
//任意整数和 00 做异或运算的结果都等于其自身，即 x ^ 0 = 0 ^ x = x。


