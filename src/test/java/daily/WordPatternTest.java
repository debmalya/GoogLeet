package daily;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class WordPatternTest {
	WordPattern wordPattern = new WordPattern();

	@Test
	void wordPattern0() {
		assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
	}

	@Test
	void wordPattern1() {
		assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
		assertFalse(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
	}

	@Test
	void createSequence() {
		Map<String, List<Integer>> sequence = wordPattern.createSequenceIndex("dog cat cat dog");
		assertAll(() -> assertEquals(2, sequence.size()), () -> assertEquals(2, sequence.entrySet().size()));

	}

	@Test
	void testCreateSearchIndex() {
		int[] actual = wordPattern.createSearchIndex("dog cat cat dog");
		int[] expected = { 2, 1, 1, 2 };
		assertArrayEquals(expected, actual);
	}

}
