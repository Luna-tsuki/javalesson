package leetCode;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Code2125 {
	// 银行中的激光束数量
	// '0' 表示单元格是空的，而 '1' 表示单元格有一个安全设备。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bank = { "000000", "010101", "000000" };
		System.out.println(numberOfBeams(bank));
	}

	public static int numberOfBeams(String[] bank) {
		int sum = 0;
		int nums = 0;

		int arrayLength = bank.length;
		int chatLength = bank[0].length();

//		int[] arr = new int[arrayLength];
		
		List<Integer> listOne = new ArrayList<Integer>();


		for (int i = 0; i < arrayLength; i++) {
			nums = 0;
			for (int j = 0; j < chatLength; j++) {
				if (bank[i].charAt(j) == '1') {
					++nums;
					// System.out.println("nums" + nums);
				}
			}
//			arr[i] = nums;
			if (nums != 0) {
				listOne.add(nums);
			}

		}

//		System.out.println(Arrays.toString(list));
		
		 for (int counter = 0; counter < listOne.size(); counter++) { 	
			 if (counter + 1 >= listOne.size()) {
				 break;
			 }
	          sum += listOne.get(counter) * listOne.get(counter + 1);
	      }  

//		for (int i = 0; i < arr.length - 1; i++) {
//			int count = 0;
//			if (arr[i] != 0) {
//				for (int j = i + 1; j < arr.length; j++) {
//					if (arr[j] != 0) {
//						count = arr[i] * arr[j];
//						break;
//					} else {
//						break;
//					}
//				}
//			} else {
//				break;
//			}
//			sum = sum + count;
//		}
		return sum;
	}

}
