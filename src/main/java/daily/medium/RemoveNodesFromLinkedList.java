package daily.medium;

import googleet.linkedlist.ListNode;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    /**
     * You are given the head of a linked list.
     * <p>
     * Remove every node which has a node with a greater value anywhere to the right side of it.
     * <p>
     * Return the head of the modified linked list.
     *
     * @param head
     * @return
     */
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();

        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                stack.pop();
            }
            stack.push(cur);
            cur = cur.next;
        }

        ListNode nxt = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            cur.next = nxt;
            nxt = cur;
        }

        return cur;
    }
}
