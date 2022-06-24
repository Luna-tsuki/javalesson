package leetCode;

import java.util.HashMap;

public class Code2103 {
	// 环和杆
	public static void main(String[] args) {
		String rings = "B0R0G0R9R0B0G0";

		System.out.println(countPoints(rings));
	}

	public static int countPoints(String rings) {
		int sum = 0;

		HashMap<Integer, String> Sites = new HashMap<Integer, String>();

		for (int i = 0; i < rings.length() - 1; i += 2) {

			int sKey = rings.charAt(i + 1) - 48;

			if (Sites.containsKey(sKey)) {
				String sValue = Sites.get(sKey);
				sValue += rings.charAt(i);
				Sites.put(sKey, sValue);
			} else {
				String sValue = rings.charAt(i) + "";
				Sites.put(sKey, sValue);
			}

		}

		//System.out.println(Sites);

		// 遍历HashMap
		for (String value : Sites.values()) {
			if (value.contains("R") & value.contains("G") & value.contains("B")) {
				++sum;
			}
		}

		return sum;
	}
}
