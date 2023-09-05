package daily;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    static class Node {
        int val;
        Node next;
        //      Could point to any node in the list, or null.
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes,
     * where each new node has its value set to the value of its corresponding original node.
     * Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers
     * in the original list and copied list represent the same list state.
     * None of the pointers in the new list should point to nodes in the original list.
     *
     * @param head
     * @return the head of the copied linked list.
     */

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        Node newHead = new Node(0);
        Node newCurr = newHead;
        Node curr = head;
        Map<Node, Node> umap = new HashMap<>();

        while (curr != null) {
            Node temp = new Node(curr.val);
            umap.put(curr, temp);

            newCurr.next = temp;
            newCurr = newCurr.next;
            curr = curr.next;
        }

        curr = head;
        newCurr = newHead.next;

        while (curr != null) {
            Node random = curr.random;
            Node newNode = umap.get(random);
            newCurr.random = newNode;

            newCurr = newCurr.next;
            curr = curr.next;
        }

        return newHead.next;
    }

    public Node copyRandomList0(Node head) {
        Node currentHead = null;
        Node currentNode = null;
        Map<Integer, Node> randomMap = new HashMap();
        Map<Integer, Integer> missing = new HashMap();

        while (head != null) {
            if (currentNode == null) {
                currentNode = new Node(head.val);
            }
            randomMap.put(currentNode.val, currentNode);

            if (head.random != null) {
                Node random = randomMap.get(head.random.val);
                if (random != null) {
                    currentNode.random = random;
                } else {
                    missing.put(head.val, head.random.val);
                }
            }
            if (head.next != null) {
                currentNode.next = new Node(head.next.val);
            }
            if (currentHead == null) {
                currentHead = currentNode;
            }

            head = head.next;
            currentNode = currentNode.next;
        }

        // update missing
        missing.forEach((key, value) -> {
            randomMap.get(key).random = randomMap.get(value);
            System.out.printf("Updated %d of random to %d\n", key, value);
        });
        return currentHead;
    }
}
