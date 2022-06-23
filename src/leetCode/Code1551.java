package leetCode;

public class Code1551 {

	// 使数组中所有元素相等的最小操作数
	public static void main(String[] args) {
		int n = 3;
		System.out.println(minOperations(n));
	}

	public static int minOperations(int n) {
		int minOperation = 0;
		int sum = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = (2 * i) + 1;
			sum = sum + arr[i];
		}

		int average = sum / n;

		for (int i = 0; i < n / 2; i++) {
			minOperation += average - arr[i];
		}

		return minOperation;
	}
//对于每一个大于 nn 的数，其与 nn 的差值即为该元素需要进行的「减」操作的数量。
//我们只要统计所有大于 nn 的数与 nn 的差值，就能计算出我们操作了多少次。
//	public int minOperations(int n) {
//        int ret = 0, avg = n;
//        for (int i = 0; i < n; i++) {
//            int x = 2 * i + 1;
//            if (x > n) {
//                ret += x - n;
//            }
//        }
//        return ret;
//    }

}
