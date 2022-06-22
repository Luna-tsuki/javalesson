package leetCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Offer42 {
	//最近请求次数
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RecentCounter obj = new RecentCounter();

		System.out.println("Enter time: ");
		System.out.println(obj.ping(input.nextInt()));
		System.out.println("Enter time: ");
		System.out.println(obj.ping(input.nextInt()));
		System.out.println("Enter time: ");
		System.out.println(obj.ping(input.nextInt()));
		System.out.println("Enter time: ");
		System.out.println(obj.ping(input.nextInt()));
	}

}

class RecentCounter {

	Queue<Integer> queNumber;
	// 队列Queue是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作

	public RecentCounter() {
		queNumber = new ArrayDeque<Integer>();
	}

	public int ping(int t) {
		queNumber.offer(t);
		// offer添加元素

		// peek返回第一个元素
		while (queNumber.peek() < t - 3000) {
			queNumber.poll();
			// poll返回第一个元素，并在队列中删除
		}

		return queNumber.size();

	}
}
