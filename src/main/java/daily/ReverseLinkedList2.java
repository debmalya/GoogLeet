package daily;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<ListNode> left2Right = new ArrayList<>();
        ListNode current = head;

        int position = 0;
        while (current != null) {
            position++;


            if (position >= left && position <= right) {
                left2Right.add(current);
            }

            if (position == right) {
                break;
            }
            current = current.next;
        }

        int size = left2Right.size();
        int mid = size / 2;
        for (int i = 0; i < mid; i++) {
            int last = left2Right.size() - i - 1;
            int temp = left2Right.get(last).val;
            left2Right.get(last).val = left2Right.get(i).val;
            left2Right.get(i).val = temp;
        }
        return head;
    }

}
