package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicateFromSortedArrayTest {

	RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();

	@Test
	void testRemoveDuplicates() {
		assertEquals(2, removeDuplicateFromSortedArray.removeDuplicates(new int[] { 1, 1, 2 }));
		assertEquals(1, removeDuplicateFromSortedArray.removeDuplicates(new int[] { 1 }));
		assertEquals(1, removeDuplicateFromSortedArray.removeDuplicates(new int[] { 1, 1 }));
		assertEquals(5, removeDuplicateFromSortedArray.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}

}
