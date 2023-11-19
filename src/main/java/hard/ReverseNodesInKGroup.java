package hard;

import googleet.linkedlist.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseNodesInKGroup {
    /**
     * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
     *
     * @param head of a linked list
     * @param k    is a positive integer and is less than or equal to the length of the linked list.
     *             If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
     * @return the modified list.
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode reversedHead = null;
        Deque<Integer> group = new LinkedList<>();

        ListNode current = head;
        ListNode reversedCurrent = null;
        ListNode lastNode = null;

        while (current != null) {
            group.push(current.val);
            if (group.size() % k == 0) {
                while (!group.isEmpty()) {
                    if (reversedCurrent == null) {
                        reversedCurrent = new ListNode();
                    }
                    reversedCurrent.val = group.pop();
                    if (reversedHead == null) {
                        reversedHead = reversedCurrent;
                    }
                    lastNode = reversedCurrent;
                    reversedCurrent.next = new ListNode();
                    reversedCurrent = reversedCurrent.next;
                }
            }
            current = current.next;
        }

        if (group.isEmpty() && lastNode != null) {
            lastNode.next = null;
        }

        while (!group.isEmpty()) {
            if (reversedCurrent == null) {
                reversedCurrent = new ListNode();
            }
            reversedCurrent.val = group.pollLast();

            if (reversedHead == null) {
                reversedHead = reversedCurrent;
            }

            if (!group.isEmpty()) {
                reversedCurrent.next = new ListNode();
                reversedCurrent = reversedCurrent.next;
            }
        }

        return reversedHead;
    }

}
