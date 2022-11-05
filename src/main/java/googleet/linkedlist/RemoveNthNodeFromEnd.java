package googleet.linkedlist;

public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode current = head;

		// find the length of the list
		int length = 0;
		while (current != null) {
			length++;
			current = current.next;
		}

		// find node to remove length - n
		if (length == n) {
			head = head.next;
			return head;
		}

		int nodeBeforeRemoveIndex = length - n - 1;
		current = head;
		for (int index = 0; index < nodeBeforeRemoveIndex; index++) {
			current = current.next;
		}

		current.next = current.next.next;

		return head;
	}

//	Time complexity O(N)
//	Space complexity O(1) constant space
}
