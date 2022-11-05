package googleet.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndTest {

	RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();

	ListNode listNode = new ListNode(1);
	ListNode head = listNode;

	@BeforeEach
	void setUp() {
		int[] arr = new int[] { 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			listNode.next = new ListNode(arr[i]);
			listNode = listNode.next;
		}
	}

	@Test
	void testRemove2ndFromEnd() {
		head = removeNthNodeFromEnd.removeNthFromEnd(head, 2);
		checkRemoval(head, 4, 11);
	}

	@Test
	void testRemove4thFromEnd() {
		head = removeNthNodeFromEnd.removeNthFromEnd(head, 4);
		checkRemoval(head, 2, 13);
	}

	@Test
	void removeSingle() {
		listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = null;
		head = removeNthNodeFromEnd.removeNthFromEnd(head, 1);
		checkRemoval(head, 1, 0);
	}
	
	@Test
	void removeLastFromTwoElements() {
		listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		ListNode head = listNode;
		listNode.next.next = null;
		head = removeNthNodeFromEnd.removeNthFromEnd(head, 1);
		checkRemoval(head, 2, 1);
	}
	
	@Test
	void testRemove2ndFromEnd0() {
		head = removeNthNodeFromEnd.removeNthFromEnd0(head, 2);
		checkRemoval(head, 4, 11);
	}

	@Test
	void testRemove4thFromEnd0() {
		head = removeNthNodeFromEnd.removeNthFromEnd0(head, 4);
		checkRemoval(head, 2, 13);
	}

	@Test
	void removeSingle0() {
		listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = null;
		head = removeNthNodeFromEnd.removeNthFromEnd0(head, 1);
		checkRemoval(head, 1, 0);
	}
	
	@Test
	void removeLastFromTwoElements0() {
		listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		ListNode head = listNode;
		listNode.next.next = null;
		head = removeNthNodeFromEnd.removeNthFromEnd0(head, 1);
		checkRemoval(head, 2, 1);
	}


	private void checkRemoval(ListNode head, int removedNodeVal, int sum) {
		int actualSum = 0;
		while (head != null) {
			assertTrue(head.val != removedNodeVal);
			actualSum += head.val;
			head = head.next;
		}
		assertEquals(sum, actualSum);
	}

}
