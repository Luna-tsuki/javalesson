package lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//编写正则表达式程序，定义一个方法，方法的声明为public boolean isValidEmail(String email),
//该方法检验email地址是否合法，合法返回true，否则返回false。

public class Text276_2 {
	public static void main(String[] args) {
		System.out.println(isValidEmail("zsy@sina.com"));
		System.out.println(isValidEmail("zsy@gmail.com"));
		System.out.println(isValidEmail("zssdfgy#sina.com"));
		System.out.println(isValidEmail("zsy@sina.@com"));

	}

	public static boolean isValidEmail(String email) {

		Pattern pattern = Pattern.compile("\\w+@\\w+.com");
		Matcher matcher = pattern.matcher(email);
		if (matcher.find())
			return true;
		else
			return false;
	}
}
