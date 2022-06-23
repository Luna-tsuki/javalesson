package leetCode;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Code1290 {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);

		head.next = new ListNode(0);

		head.next.next = new ListNode(1);

		// [1, 0, 1]

		System.out.println(getDecimalValue(head));

	}

	public static int getDecimalValue(ListNode head) {
		int sum = 0;
		while (head != null) {
			sum = sum * 2 + head.val;
			head = head.next;
		}

		return sum;

	}

}
