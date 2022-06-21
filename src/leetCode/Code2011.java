package leetCode;

public class Code2011 {

	public static void main(String[] args) {
		//++X 和 X++ 使变量 X 的值 加 1     --X 和 X-- 使变量 X 的值 减 1
		//最初，X 的值是 0  
		//给你一个字符串数组 operations ，这是由操作组成的一个列表 返回执行所有操作后， X 的 最终值 。
		
		String[] operations = { "--X", "X++", "X++" };

		System.out.print(finalValueAfterOperations(operations));
	}

	public static int finalValueAfterOperations(String[] operations) {
		int X = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equals("++X") || operations[i].equals("X++")) {
				X += 1;
			} else if (operations[i].equals("--X") || operations[i].equals("X--")){
				X -= 1;
			} else {
				X -= 0;
			}
		}

		return X;

	}

}
