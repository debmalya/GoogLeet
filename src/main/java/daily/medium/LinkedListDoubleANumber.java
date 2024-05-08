package daily.medium;

import googleet.linkedlist.ListNode;

import java.util.Stack;

public class LinkedListDoubleANumber {
    public ListNode doubleIt(ListNode head) {

        ListNode current = head;
        Stack<ListNode> stack = new Stack<>();

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        Stack<Integer> doubleNode = new Stack<>();
        int carryOver = 0;
        while (!stack.empty()) {
            var value = stack.pop().val;
            value *= 2;
            value += carryOver;
            carryOver = value / 10;
            doubleNode.push(value % 10);
        }
        if (carryOver > 0) {
            doubleNode.push(carryOver);
        }

        ListNode newHead = new ListNode(doubleNode.pop());
        ListNode newCurrent = newHead;
        while (!doubleNode.empty()) {
            newCurrent.next = new ListNode(doubleNode.pop());
            newCurrent = newCurrent.next;
        }

        return newHead;
    }

    public ListNode doubleIt0(ListNode head) {
        var val = 0;
        var current = head;
        var divisor = 1;

        while (current != null) {
            if (val == 0 && current.val > 4) {
                divisor *= 10;
            }
            val += current.val;
            val *= 10;

            current = current.next;
            divisor *= 10;
        }

        divisor /= 10;
        val /= 10;
        val *= 2;

        var doubleVal = val;

        current = head;
        int len = String.valueOf(doubleVal).length();
        int count = 0;

        while (count < len) {
            if (divisor != 0) {
                current.val = val / divisor;
                val = val % divisor;
            } else
                current.val = 0;


            divisor /= 10;
            count++;
            if (current.next == null && count < len) {
                current.next = new ListNode();
            }
            current = current.next;
        }

        return head;
    }
}
