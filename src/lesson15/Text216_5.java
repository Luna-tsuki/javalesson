package lesson15;

public class Text216_5 {

	// 编写一个程序，它能导致JVM抛出一个OutOfMemoryError的异常，然后捕获并处理这个异常。
	public static void main(String[] args) {
		try {
			int[] arr = new int[Integer.MAX_VALUE];
		} catch (OutOfMemoryError err) {
			System.out.println(err.getMessage());
		}
	}
}
