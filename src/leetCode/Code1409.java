package leetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class Code1409 {
	//查询带键的排列
	public static void main(String[] args) {
		int[] queries = { 7,5,5,8,3 };
		int m = 8;
		System.out.println(Arrays.toString(processQueries(queries, m)));
	}

	public static int[] processQueries(int[] queries, int m) {
		int[] sums = new int[queries.length];

		// 新建p列表数组存入m个数字
		LinkedList<Integer> p = new LinkedList<Integer>();
		for (int i = 1; i <= m; i++) {
			p.add(i);
		}
		//System.out.println(p);// [1, 2, 3, 4, 5]

		// 循环queries数组每个值
		int count = 0;
		for (int i = 0; i < queries.length; i++) {
			// 找到对应的数组p里对应的index值
			for (int j = 0; j < p.size(); j++) {
				if (queries[i] == p.get(j)) {
					sums[i] = j;

					// 把p的数组重新排列
					int temp = p.get(j);
					p.remove(j);
					p.add(0, temp);
				}
			}
		}
	
		return sums;
	}

}
