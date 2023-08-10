package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    void search() {
        assertTrue(searchInRotatedSortedArray.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 6));
        assertTrue(searchInRotatedSortedArray.search(new int[]{1, 0, 1, 1, 1}, 0));
    }
}