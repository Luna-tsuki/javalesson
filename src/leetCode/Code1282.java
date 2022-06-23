package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Code1282 {

	//用户分组
	public static void main(String[] args) {
		int[] groupSizes = { 2, 1, 3, 3, 3, 2 };
		System.out.println(groupThePeople(groupSizes));

	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		// 创建数组temp 存放groupSizes相同value的下标值

		// groupSizes相同值的下标 放入hashmap
		// key=groupSizes的value groupSizes[i])
		// value=groupSizes的index i
		HashMap<Integer, ArrayList<Integer>> Sites = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < groupSizes.length; i++) {

			// 保证每次temp都是新建的 清空的 数组
			ArrayList<Integer> temp = new ArrayList<Integer>();

			// 判断hash里面的key是否有groupSizes[i]相同值
			if (Sites.containsKey(groupSizes[i])) {
				// 如果有相同的key，获取当前hash的ArrayList value
				temp = Sites.get(groupSizes[i]);
				// System.out.println("groupSizes " + groupSizes[i]);
				// System.out.println("temp: " + temp);

				// 将当前groupSizes[i]加入ArrayList temp
				temp.add(i);
				// System.out.println("temp: add " + temp);

				// 新的数组重新推入hash
				Sites.put(groupSizes[i], temp);
				// System.out.println(Sites);
			} else {
				// 如果没有相同的key，直接将i推入hash新的key
				temp.add(i);
				// System.out.println("no temp: " + temp);
				Sites.put(groupSizes[i], temp);
				// System.out.println(Sites);
			}

		}

		// System.out.println("Sites " + Sites);

		// 把每个value数组按照key分割为子字符串
		Sites.forEach((key, value) -> {

			List<Integer> temp = new ArrayList<Integer>();
			int n = value.size();
			for (int i = 0; i < n; i += key) {
				temp = value.subList(i, i + key);
				// System.out.println(temp);
				list.add(temp);
			}

		});
		// System.out.println(list);
		return list;
	}

}
