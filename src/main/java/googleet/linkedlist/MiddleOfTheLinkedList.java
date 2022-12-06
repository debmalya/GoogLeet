package googleet.linkedlist;

public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode prevMiddle = null;
		ListNode end = head;
		int count = 0;
		while (end != null && middle != null) {
			prevMiddle = middle;
			middle = middle.next;
			if (end != null && end.next != null) {
				end = end.next;
				end = end.next;
				count += 2;
			} else {
				count++;
				end = end.next;
			}
		}
		if (count % 2 == 0) {
			return middle;
		} else {
			return prevMiddle;
		}

	}

}
