package googleet.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode odd = head, even = head.next, evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}

	public ListNode oddEvenList0(ListNode head) {

		ListNode modifiedHead = null;
		ListNode current = head;
		ListNode prev = null;
		ListNode modifiedCurrent = null;
		Queue<ListNode> evenNodeQueue = new LinkedList<>();

		while (current != null) {
			if (modifiedHead == null) {
				modifiedHead = new ListNode(current.val);
				modifiedCurrent = modifiedHead;
			} else {
				modifiedCurrent.next = new ListNode(current.val);
				prev = modifiedCurrent.next;
				modifiedCurrent = modifiedCurrent.next;
			}

			if (current.next != null) {
				evenNodeQueue.add(current.next);
				current = current.next;
			}

			current = current.next;
		}

		while (!evenNodeQueue.isEmpty()) {
			ListNode evenNode = evenNodeQueue.poll();
			if (prev != null) {
				prev.next = new ListNode(evenNode.val);
				modifiedCurrent = prev.next;
				prev = null;
			} else {
				if (modifiedCurrent.next != null) {
					modifiedCurrent = modifiedCurrent.next;
					modifiedCurrent.val = evenNode.val;
				} else {
					modifiedCurrent.next = new ListNode(evenNode.val);
				}
			}

			if (evenNodeQueue.peek() != null) {
				modifiedCurrent.next = new ListNode();
			}
		}
		return modifiedHead;
	}

}
