package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingElementInSortedArrayTest {

	MissingElementInSortedArray missingElementInSortedArray = new MissingElementInSortedArray();

	@Test
	void testMissingElement() {
		assertEquals(5, missingElementInSortedArray.missingElement(new int[] { 4, 7, 9, 10 }, 1));
		assertEquals(6, missingElementInSortedArray.missingElement(new int[] { 4, 7, 9, 10 }, 2));
		assertEquals(8, missingElementInSortedArray.missingElement(new int[] { 4, 7, 9, 10 }, 3));
		assertEquals(11, missingElementInSortedArray.missingElement(new int[] { 4, 7, 9, 10 }, 4));
	}
	
	@Test
	void testMissingElement1() {
		assertEquals(6, missingElementInSortedArray.missingElement(new int[] { 1,2,4 }, 3));
	}

}
