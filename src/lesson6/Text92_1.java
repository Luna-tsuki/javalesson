package lesson6;

public class Text92_1 {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";

		// 检査s1和s2是否相等
		boolean isEqual = s1.equals(s2);
		System.out.println(isEqual);

		// 在忽略大小写的情况下检査s1和s2是否相等
		boolean isEqual1 = s1.equalsIgnoreCase(s2);
		System.out.println(isEqual1);

		// 比较s1和s2, 然后将结果赋值给一个整型变量x1
		int x1 = s1.compareTo(s2);
		System.out.println(x1);

		// 在忽略大小写的情况下比较s1和s2
		int x2 = s1.compareToIgnoreCase(s2);
		System.out.println(x2);

		// 检査s1是否有前缀"AAA"
		boolean b1 = s1.startsWith("AAA");
		System.out.println(b1);

		// 检査s1是否有后缀"AAA"
		boolean b2 = s1.endsWith("AAA");
		System.out.println(b2);

		// 将s1的长度赋值给一个整型变量x3
		int x3 = s1.length();
		System.out.println(x3);

		// 将s1的第一个字符赋值给一个字符型变量x4
		char x4 = s1.charAt(0);
		System.out.println(x4);

		// 创建新字符串s3, 它是s1和s2的组合
		String s3 = s1 + s2;
		System.out.println(s3);

		// 创建s1的子串，下标从1开始
		String s4 = s1.substring(1);
		System.out.println(s4);

		// 创建s1 的子串，下标从1到4
		String s5 = s1.substring(1, 5);
		System.out.println(s5);

		// 将s1转换为小写
		String s6 = s1.toLowerCase();
		System.out.println(s6);

		// 将s1转换为大写
		String s7 = s1.toUpperCase();
		System.out.println(s7);

		// 将s1两端的空白字符去掉
		String s8 = " Welcome  ";
		String s9 = s8.trim();
		System.out.println(s9);

		// 将s1中第一次出现的字符 e 的下标赋值给一个int型变量x5
		int x5 = s1.indexOf('e');
		System.out.println(x5);

		// 将s1中最后一次出现的字符串abc的下标赋值给一个int型变量x6。
		int x6 = s1.lastIndexOf("abc");
		System.out.println(x6);
	}
}
