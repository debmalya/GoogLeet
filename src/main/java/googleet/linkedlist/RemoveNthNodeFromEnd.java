package googleet.linkedlist;

public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode current = head;
		for (int i = 0; i < n; i++) {
			current = current.next;
		}
		if (current == null) {
			return head.next;
		}
		ListNode nodeToBeRemoved = head;
		
		
		while (current.next != null) {
			nodeToBeRemoved = nodeToBeRemoved.next;
			current = current.next;

		}
		nodeToBeRemoved.next = nodeToBeRemoved.next.next;
		return head;
	}

	public ListNode removeNthFromEnd0(ListNode head, int n) {
//		Time complexity O(N)
//		Space complexity O(1) constant space
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

}
