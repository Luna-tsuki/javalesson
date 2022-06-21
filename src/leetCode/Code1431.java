package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Code1431 {

	// 将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有最多的糖果。
	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		System.out.println(kidsWithCandies(candies, extraCandies));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<Boolean>();

		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (max < candies[i]) {
				max = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++) {
			list.add(candies[i] + extraCandies >= max);
		}

		return list;
	}

}
