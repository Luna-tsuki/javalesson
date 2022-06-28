package lesson20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text271 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("acd ad");

		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}
