package daily;

public class SplitLinkedListInParts {
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

    /**
     * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
     * <p>
     * The length of each part should be as equal as possible: no two parts should have a size differing by more than one.
     * This may lead to some parts being null.
     * <p>
     * The length of each part should be as equal as possible: no two parts should have a size differing by more than one.
     * This may lead to some parts being null.
     * <p>
     * The parts should be in the order of occurrence in the input list,
     * and parts occurring earlier should always have a size greater than or equal to parts occurring later.
     * <p>
     * Return an array of the k parts.
     *
     * @param head of the linked list.
     * @param k    split by integer k.
     * @return
     */
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts = new ListNode[k];
        ListNode node = head;

        int size = 0;

        while (node != null) {
            size++;
            node = node.next;
        }
        int n = size / k, r = size % k;
        node = head;
        ListNode prev = null;

        // Loop through each part.
        for (int i = 0; node != null && i < k; i++, r--) {
            // Store the current node as the start of the current part.
            parts[i] = node;

            // Traverse n + 1 nodes if there are remaining extra nodes (r > 0).
            // Otherwise, traverse only n nodes.
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }

            // Disconnect the current part from the rest of the list by setting prev.next to null.
            if (prev != null) {
                prev.next = null;
            }
        }

        // Return the array of k parts.
        return parts;
    }
}
