package lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text220 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("score.txt");
		// 使用Scanner读取数据
		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String name = input.next();
			int score = input.nextInt();
			System.out.println(("name: " + name + "score: " + score));
		}

		input.close();
	}
}
