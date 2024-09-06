package daily.medium;

import googleet.linkedlist.ListNode;
import java.util.Arrays;

public class DeleteNodes4mLinkedListPresentInArray {
  public ListNode modifiedList(int[] nums, ListNode head) {
    ListNode modifiedList = head;
    ListNode current = head;
    ListNode prev = null;
    Arrays.sort(nums);
    while (current != null) {
      if (Arrays.binarySearch(nums, current.val) > -1) {
        if (prev == null) {
          modifiedList = current.next;
        } else {
          prev.next = current.next;
        }
      } else {
        prev = current;
      }
      current = current.next;
    }
    return modifiedList;
  }
}
