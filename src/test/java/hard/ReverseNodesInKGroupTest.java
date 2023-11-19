package hard;

import googleet.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseNodesInKGroupTest {
    ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

    @Test
    void reverseKGroup() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        int count = 2;
        while (count < 6) {
            current.next = new ListNode(count++);
            current = current.next;
        }
        var reversed = reverseNodesInKGroup.reverseKGroup(head, 2);
        assertEquals(2, reversed.val);
        assertEquals(1, reversed.next.val);
        assertEquals(4, reversed.next.next.val);
        assertEquals(3, reversed.next.next.next.val);
        assertEquals(5, reversed.next.next.next.next.val);
        assertNull(reversed.next.next.next.next.next);
    }

    @Test
    void reverseKGroupSymmetric() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        int count = 2;
        while (count < 5) {
            current.next = new ListNode(count++);
            current = current.next;
        }
        var reversed = reverseNodesInKGroup.reverseKGroup(head, 2);
        assertEquals(2, reversed.val);
        assertEquals(1, reversed.next.val);
        assertEquals(4, reversed.next.next.val);
        assertEquals(3, reversed.next.next.next.val);
        assertNull(reversed.next.next.next.next);
    }
}