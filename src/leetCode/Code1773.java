package leetCode;

import java.util.Arrays;
import java.util.List;

public class Code1773 {

	public static void main(String[] args) {
//		String[][] items = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
//				{ "phone", "gold", "iphone" } };
		
		
		List<List<String>> lists = Arrays.asList(
				Arrays.asList( "phone", "blue", "pixel" ),
                Arrays.asList( "computer", "silver", "lenovo" ),
                Arrays.asList( "phone", "gold", "iphone"));
	
		String ruleKey = "color";
		String ruleValue = "silver";
		System.out.println(countMatches(lists, ruleKey, ruleValue));
	
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0, index = 0;
		
		if (ruleKey.equals("color")) {
			index = 1;
		} else if (ruleKey.equals("name")) {
			index = 2;
		}

		for (List<String> i : items) {
			if (i.get(index).equals(ruleValue)) {
				count++;
			}
		}

		return count;

	}

}
