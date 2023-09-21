package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void findMedianSortedArrays() {
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    void findMedianSortedArrays0() {
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays0(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays0(new int[]{1, 3}, new int[]{2}));
    }
}