package leetCode;

public class Offer22 {

	//链表中倒数第k个节点
	public static void main(String[] args) {
		int k = 2;

		ListNode2 head = new ListNode2(1);
		head.next = new ListNode2(2);
		head.next.next = new ListNode2(3);
		head.next.next.next = new ListNode2(4);
		head.next.next.next.next = new ListNode2(5);

		System.out.println(getKthFromEnd(head, k));

	}

	public static ListNode2 getKthFromEnd(ListNode2 head, int k) {

		// 获取链表长度n
		int n = 0;
		ListNode2 node = null;
		for (node = head; node != null; node = node.next) {
			n++;
		}
		//System.out.println(n);
		
		//从链表head末尾n开始寻找到k
		for (node = head; n > k; n--) {
			node = node.next;
		}
		return node;
	}
}

class ListNode2 {
	int val;
	ListNode2 next;

	ListNode2(int x) {
		val = x;
	}
}