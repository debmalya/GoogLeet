package googleet.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergerTest {

	Merger merger = new Merger();

	@Test
	void testMergeTwoLists() {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode merged = merger.mergeTwoLists(list1, list2);
		assertNotNull(merged);
		assertSum(merged, 15);

	}

	@Test
	void testMergeTwoListsOneNull() {
		ListNode list1 = null;

		ListNode list2 = new ListNode(0);

		ListNode merged = merger.mergeTwoLists(list1, list2);

		assertAll(() -> assertNotNull(merged), () -> assertSum(merged, 0));
	}

	@Test
	void testMergeTwoListsBothNull() {
		ListNode list1 = null;

		ListNode list2 = null;

		ListNode merged = merger.mergeTwoLists(list1, list2);

		assertAll(() -> assertNull(merged));
	}

	private void assertSum(ListNode node, int sum) {
		int listSum = 0;
		int prev = Integer.MIN_VALUE;
		while (node != null) {
			if (prev != Integer.MIN_VALUE) {
				assertTrue(prev <= node.val);
			}
			listSum += node.val;
			prev = node.val;
			node = node.next;
		}

		assertEquals(sum, listSum);
	}
}
