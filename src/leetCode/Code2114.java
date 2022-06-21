package leetCode;

public class Code2114 {
	// 给你一个字符串数组 sentences ，其中 sentences[i] 表示单个 句子
	// 请你返回单个句子里 单词的最多数目

	public static void main(String[] args) {
		String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

		System.out.print(mostWordsFound(sentences));
	}

	public static int mostWordsFound(String[] sentences) {
		int sum = 0;
		
		for (int i = 0; i < sentences.length;i++) {
			int count = 0;
			char[] ch = sentences[i].toCharArray();
			for(char e:ch) {
				if(e==' ') {
					count++;
				}
			}
			if(count>sum) {
				sum = count;
			}
		}

			return sum+1;
	}
}
