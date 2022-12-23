package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueNumberOfOccurrencesTest {
	UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();

	@Test
	void testUniqueOccurrences() {
		assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
	}

}
