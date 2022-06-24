package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Code1557 {

	public static void main(String[] args) {
		int n = 2;

		// 把数字放入二层listAll
		List<List<Integer>> listAll = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		listAll.add(list1);
//		List<Integer> list2 = new ArrayList<Integer>();
//		list2.add(0);
//		list2.add(2);
//		listAll.add(list2);
//		List<Integer> list3 = new ArrayList<Integer>();
//		list3.add(2);
//		list3.add(5);
//		listAll.add(list3);
//		List<Integer> list4 = new ArrayList<Integer>();
//		list4.add(3);
//		list4.add(4);
//		listAll.add(list4);
//		List<Integer> list5 = new ArrayList<Integer>();
//		list5.add(4);
//		list5.add(2);
//		listAll.add(list5);
		System.out.println(listAll);

		System.out.println(findSmallestSetOfVertices(n, listAll));

	}

	public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		List<Integer> list = new ArrayList<Integer>();

		// 把二层数组edges每项数字 第1位放入list1
		// 把二层数组edges 所有数字 塞入sites 去重
		HashSet<Integer> sites = new HashSet<Integer>();

		for (List<Integer> i : edges) {
			sites.add(i.get(1));
		}

		// 如果sites里面不包含n的某个数字则 放入list
		for (int i = 0; i < n; i++) {
			if (!sites.contains(i)) {
				list.add(i);
			}
		}

		return list;
	}
}
