package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import googleet.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class DeleteNodes4mLinkedListPresentInArrayTest {
  private final DeleteNodes4mLinkedListPresentInArray solution= new DeleteNodes4mLinkedListPresentInArray();


  @Test
  void testModifiedListWithEmptyList() {
    ListNode head = null;
    int[] deleteValues = {1, 2, 3};
    ListNode result = solution.modifiedList(deleteValues, head);
    assertNull(result, "Result should be null for an empty list");
  }

  @Test
  void testModifiedListWithNoMatches() {
    ListNode head = createLinkedList(1, 2, 3, 4, 5);
    int[] deleteValues = {6, 7, 8};
    ListNode result = solution.modifiedList(deleteValues, head);
    assertLinkedListEquals(createLinkedList(1, 2, 3, 4, 5), result);
  }

  @Test
  void testModifiedListWithSomeMatches() {
    ListNode head = createLinkedList(1, 2, 3, 4, 5);
    int[] deleteValues = {2, 4};
    ListNode result = solution.modifiedList(deleteValues, head);
    assertLinkedListEquals(createLinkedList(1, 3, 5), result);
  }

  @Test
  void testModifiedListWithAllMatches() {
    ListNode head = createLinkedList(1, 2, 3);
    int[] deleteValues = {1, 2, 3};
    ListNode result = solution.modifiedList(deleteValues, head);
    assertNull(result, "Result should be null when all nodes are deleted");
  }

  // Helper method to create a linked list from given values
  private ListNode createLinkedList(int... values) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    for (int value : values) {
      current.next = new ListNode(value);
      current = current.next;
    }
    return dummy.next;
  }

  // Helper method to assert equality of two linked lists
  private void assertLinkedListEquals(ListNode expected, ListNode actual) {
    while (expected != null && actual != null) {
      assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }
    assertNull(expected);
    assertNull(actual);
  }
}
