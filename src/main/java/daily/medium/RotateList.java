package daily.medium;

import googleet.linkedlist.ListNode;
import java.util.Stack;

public class RotateList {
  /**
   * Given the head of a linked list, rotate the list to the right by k places.
   *
   * @param head of the linked list.
   * @param k places.
   * @return modified list head.
   */
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    var current = head;
    Stack<ListNode> traversed = new Stack<>();

    while (current != null) {
      traversed.push(current);
      current = current.next;
    }

    if (k % traversed.size() == 0) {
      return head;
    }
    k %= traversed.size();
    var index = 0;
    while (index < k) {
      current = traversed.pop();
      current.next = head;
      head = current;
      index++;
    }

    ListNode last = traversed.pop();
    last.next = null;

    return current;
  }
}
