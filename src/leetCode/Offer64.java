package leetCode;

public class Offer64 {

	//求1+2+…+n
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumNums(n));

	}

	public static int sumNums(int n) {
		boolean b = n > 0 && (n += sumNums(n - 1)) > 0;
		return n;
	}

}
