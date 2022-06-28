package lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Text218 {

	public static void main(String[] args) throws FileNotFoundException {
		// 创建txt文件
		File file = new File("score.txt");
		if (file.exists()) {
			System.out.println("File already exists!");
			System.exit(0);
		}

		// 向txt文件内添加内容
		PrintWriter output = new PrintWriter(file);

		output.println("Andrew");
		output.println("90");
		output.println("Eric");
		output.println("80");

		output.close();

		// 自动关闭输出
		try (PrintWriter output2 = new PrintWriter(file)) {
			output.println("Andrew");
			output.println("90");
			output.println("Eric");
			output.println("80");
		}

	}
}
