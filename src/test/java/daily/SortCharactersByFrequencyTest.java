package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortCharactersByFrequencyTest {

	SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();

	@Test
	void testFrequencySort() {
		assertEquals("eert", sortCharactersByFrequency.frequencySort("tree"));
	}

}
