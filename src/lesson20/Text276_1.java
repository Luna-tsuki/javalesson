package lesson20;

import java.util.LinkedHashSet;
import java.util.Set;

//运用正则表达式相关知识编写一个程序，将“我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程”
//还原成：我要学编程。
public class Text276_1 {

	public static void main(String[] args) {
		String s1 = "我我我、、、我我、、我要、我要要、、、要要要、、要要、、学学学、、、、学学编、、、学编编编、、编编编程、、程程";
		String r1 = s1.replaceAll("、+", "");
		Set<Character> treeSet = new LinkedHashSet<>();
		for (Character c : r1.toCharArray()) {
			// System.out.println(c);
			treeSet.add(c);
		}
		// System.out.println(r1);
		for (Character c : treeSet) {
			System.out.print(c);
		}

	}

}
