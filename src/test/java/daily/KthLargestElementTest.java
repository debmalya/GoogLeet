package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementTest {

    KthLargestElement kthLargestElement = new KthLargestElement();

    @Test
    void findKthLargest() {
        assertEquals(5, kthLargestElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, kthLargestElement.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}