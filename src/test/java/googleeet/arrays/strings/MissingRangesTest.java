package googleeet.arrays.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MissingRangesTest {

	MissingRanges missingRanges = new MissingRanges();

	@Test
	void testFindMissingRanges() {
		List<String> actual = missingRanges.findMissingRanges(new int[] { 0, 1, 3, 50, 75 }, 0, 99);
		assertEquals("2", actual.get(0));
		assertEquals("4->49", actual.get(1));
		assertEquals("51->74", actual.get(2));
		assertEquals("76->99", actual.get(3));
	}

	@Test
	void testEmptyArr() {
		List<String> actual = missingRanges.findMissingRanges(new int[] {}, 1, 1);
		assertTrue(actual.isEmpty());
	}
}
