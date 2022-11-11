package daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveAllAdjacentDuplicatesInStringTest {
	RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicates = new RemoveAllAdjacentDuplicatesInString();

	@Test
	void testRemoveDuplicates() {
		assertEquals("ca", removeAllAdjacentDuplicates.removeDuplicates("abbaca"));
		assertEquals("ay", removeAllAdjacentDuplicates.removeDuplicates("azxxzy"));
		assertEquals("a", removeAllAdjacentDuplicates.removeDuplicates("a"));
		assertEquals("", removeAllAdjacentDuplicates.removeDuplicates("aa"));
		assertEquals("b", removeAllAdjacentDuplicates.removeDuplicates("aab"));
	}

}
