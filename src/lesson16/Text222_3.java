package lesson16;

import java.util.*;
import java.io.*;

public class Text222_3 {
	//( 写/ 读数据） 编写一个程序，如果名为Exercise12_15.txt 的文件不存在，则创建该文件。
	// 使用文本I/O 将随机产生的100 个整数写入文件，文件中的整数由空格分开。从文件中读回数据并以升序显示数据。

	public static void main(String[] args) throws Exception {
		// Check if file exists
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (
				// Create output file
				PrintWriter output = new PrintWriter(file);) {
			// Write 100 integers created radomly to file
			for (int i = 0; i < 100; i++) {
				output.print(((int) (Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		// Crate and ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		try (
				// Create input file
				Scanner input = new Scanner(file);) {
			// Read the data back from the file
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}

		// Sort array list
		Collections.sort(list);

		// Display data in increasing order
		System.out.print(list.toString());
		System.out.println();
	}
}