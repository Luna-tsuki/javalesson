package leetCode;

public class Code1832 {

	//判断句子是否为全字母句
	public static void main(String[] args) {
		String sentence = "leetcode";
		System.out.println(checkIfPangram(sentence));

	}

	public static boolean checkIfPangram(String sentence) {
		boolean s = true;

		for (int i = 97; i < 123; i++) {
			char convertedChar = (char)i;
			if (!sentence.contains(convertedChar + "")) {
				s = false;
			}
			
		}

		return s;

	}
}
