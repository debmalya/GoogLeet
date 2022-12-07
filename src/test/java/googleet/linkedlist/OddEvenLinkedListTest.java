package googleet.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

	OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

	@Test
	void testOddEvenList_withOddNumberOfElements() {
		ListNode listNode = arr2ListNode(new int[] { 1, 2, 3 });
		ListNode actual = oddEvenLinkedList.oddEvenList(listNode);
		assertEquals(1, actual.val);
		assertEquals(3, actual.next.val);
		assertEquals(2, actual.next.next.val);

	}

	@Test
	void testOddEvenList_withTwoElements() {
		ListNode listNode = arr2ListNode(new int[] { 1, 1 });
		ListNode actual = oddEvenLinkedList.oddEvenList(listNode);
		assertEquals(1, actual.val);
		assertEquals(1, actual.next.val);
	}

	@Test
	void testOddEvenList_withEvenNumberOfElements() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		ListNode listNode = arr2ListNode(arr);
		ListNode actual = oddEvenLinkedList.oddEvenList(listNode);
		ListNode current = actual;
		for (int i = 0; i < arr.length; i += 2) {
			assertEquals(arr[i], current.val);
			current = current.next;
		}

		for (int i = 1; i < arr.length; i += 2) {
			assertEquals(arr[i], current.val);
			current = current.next;
		}

	}

	@Test
	void testOddEvenList_withSingleElement() {
		int[] arr = new int[] { 1 };
		ListNode listNode = arr2ListNode(arr);
		ListNode actual = oddEvenLinkedList.oddEvenList(listNode);
		ListNode current = actual;
		for (int i = 0; i < arr.length; i += 2) {
			assertEquals(arr[i], current.val);
			current = current.next;
		}

	}

	private ListNode arr2ListNode(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode current = head;
		for (int i = 1; i < arr.length; i++) {
			current.next = new ListNode(arr[i]);
			current = current.next;
		}
		return head;
	}

}
