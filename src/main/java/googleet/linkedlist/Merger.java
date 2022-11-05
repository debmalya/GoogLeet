package googleet.linkedlist;

public class Merger {
	/**
	 * You are given the heads of two sorted linked lists list1 and list2.
	 * 
	 * Merge the two lists in a one sorted list. The list should be made by splicing
	 * together the nodes of the first two lists.
	 * 
	 * Return the head of the merged linked list.
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode merged = null;
		ListNode current = merged;

		while (list1 != null || list2 != null) {
			if (merged == null) {
				merged = new ListNode();
				current = merged;
			}
			boolean isFirst = true;
			if (list1 != null && list2 != null) {
				if (list1.val >= list2.val) {
					isFirst = false;
				}
			} else if (list2 != null) {
				isFirst = false;
			}

			if (isFirst) {
				current.val = list1.val;
				list1 = list1.next;
			} else {
				current.val = list2.val;
				list2 = list2.next;
			}
			if (list1 != null || list2 != null) {
				current.next = new ListNode();
				current = current.next;
			}
		}

		return merged;

	}

}
