package daily.medium;

import googleet.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListDoubleANumberTest {

    LinkedListDoubleANumber linkedListDoubleANumber = new LinkedListDoubleANumber();

    @Test
    void doubleIt() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);
        head = linkedListDoubleANumber.doubleIt(head);
        assertEquals(3, head.val);
        assertEquals(7, head.next.val);
        assertEquals(8, head.next.next.val);
        assertNull(head.next.next.next);

        head = new ListNode(5);
        head = linkedListDoubleANumber.doubleIt(head);
        assertEquals(1, head.val);
        assertEquals(0, head.next.val);
        assertNull(head.next.next);

        head = new ListNode(1);
        head.next = new ListNode(5);
        head = linkedListDoubleANumber.doubleIt(head);
        assertEquals(3, head.val);
        assertEquals(0, head.next.val);
        assertNull(head.next.next);


    }

    @Test
    void doubleIt0() {
        ListNode head = new ListNode(5);
        head = linkedListDoubleANumber.doubleIt0(head);
        assertEquals(1, head.val);
        assertEquals(0, head.next.val);
        assertNull(head.next.next);

        head = new ListNode(1);
        head.next = new ListNode(5);
        head = linkedListDoubleANumber.doubleIt0(head);
        assertEquals(3, head.val);
        assertEquals(0, head.next.val);
        assertNull(head.next.next);
    }
}