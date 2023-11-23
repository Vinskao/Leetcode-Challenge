/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ListNode {

	static ListNode current = null;
	static int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	public ListNode removeElements(ListNode head, int val) {

		val = 0;
		head = null;

		ListNode listNode = new ListNode(val);


		while (current != null) {

			current = current.next;
			System.out.println(current.val);
		}

		return null;
	}

	public static void main(String args[]) {
		ListNode listNode = new ListNode(0);
		listNode.removeElements(listNode, val);
		System.out.println(current);

	}

}