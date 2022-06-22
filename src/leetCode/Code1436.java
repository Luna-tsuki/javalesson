package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code1436 {

	public static void main(String[] args) {
		List<List<String>> paths = Arrays.asList(Arrays.asList("London", "New York"), Arrays.asList("New York", "Lima"),
				Arrays.asList("Lima", "Sao Paulo"));

		System.out.println(destCity(paths));
	}

	public static String destCity(List<List<String>> paths) {

		ArrayList<String> all = new ArrayList<String>();

		// 把每个数组的第一项塞入all
		for (List<String> list : paths) {
			all.add(list.get(0));
		}

		// 判断all里面不包含每个数组第1位的值
		for (List<String> list : paths) {
			if (!all.contains(list.get(1))) {
				return list.get(1);
			}
		}
//		System.out.println(all);

		return "";
	}
}
