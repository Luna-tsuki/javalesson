package lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text276_3 {
	// 匹配一个给定字符串中的电话号码

	public static void main(String[] args) {
		String phone = "186378669645";
		Pattern pattern = Pattern.compile("^\\d{11}$");
		Matcher matcher = pattern.matcher(phone);
		System.out.println("--------------1---------------");
		if (matcher.find()) {
			System.out.println(true);
		} else
			System.out.println(false);

	}

}
