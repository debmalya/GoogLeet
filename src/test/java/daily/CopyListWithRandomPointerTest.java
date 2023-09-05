package daily;

import org.junit.jupiter.api.Test;

class CopyListWithRandomPointerTest {

    @Test
    void copyRandomList() {
        CopyListWithRandomPointer.Node head = new CopyListWithRandomPointer.Node(7);
        head.next = new CopyListWithRandomPointer.Node(13);
        CopyListWithRandomPointer.Node current = head;
        current = current.next;
        current.random = head;

    }
}