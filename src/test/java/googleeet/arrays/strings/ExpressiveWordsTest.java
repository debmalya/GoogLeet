package googleeet.arrays.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressiveWordsTest {

	ExpressiveWords expressiveWords = new ExpressiveWords();

	@Test
	void testExpressiveWords() {
		assertEquals(1, expressiveWords.expressiveWords("hellooo", new String[] { "hello", "hi", "helo" }));
	}

}
