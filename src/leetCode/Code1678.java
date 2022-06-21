package leetCode;

public class Code1678 {
	// Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。
	// 你字符串 command ，返回 Goal 解析器 对 command 的解释结果。

	public static void main(String[] args) {
		String command = "G()(al)";
		System.out.println(interpret(command));
	}

	public static String interpret(String command) {
		String str1 = command.replace("()", "o");
		String str2 = str1.replace("(al)", "al");
		return str2;
	}

}
